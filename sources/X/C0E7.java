package X;

import android.content.ContentResolver;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.TrafficStats;
import android.os.Build;
import android.os.DeadObjectException;
import android.os.DeadSystemException;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.core.NetworkStateManager$SubscriptionManagerBasedRoamingDetector;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* renamed from: X.0E7 */
/* loaded from: classes.dex */
public class C0E7 {
    public static volatile C0E7 A02;
    public final AbstractC000600i A00;
    public final C02E A01;

    public C0E7(AbstractC000600i abstractC000600i, C02E c02e) {
        this.A00 = abstractC000600i;
        this.A01 = c02e;
    }

    public static C0E7 A00() {
        if (A02 == null) {
            synchronized (C0E7.class) {
                if (A02 == null) {
                    A02 = new C0E7(AbstractC000600i.A00(), C02E.A00());
                }
            }
        }
        return A02;
    }

    public static boolean A01() {
        HttpURLConnection httpURLConnection = null;
        try {
            TrafficStats.setThreadStatsTag(3);
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(C0FH.A0D).openConnection();
            try {
                httpURLConnection2.setInstanceFollowRedirects(false);
                httpURLConnection2.setConnectTimeout(SearchActionVerificationClientService.NOTIFICATION_ID);
                httpURLConnection2.setReadTimeout(SearchActionVerificationClientService.NOTIFICATION_ID);
                httpURLConnection2.setUseCaches(false);
                httpURLConnection2.getInputStream();
                if (httpURLConnection2.getResponseCode() == 204) {
                    httpURLConnection2.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    return false;
                }
                Log.i("captive portal");
                httpURLConnection2.disconnect();
                TrafficStats.clearThreadStatsTag();
                return true;
            } catch (IOException unused) {
                httpURLConnection = httpURLConnection2;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                TrafficStats.clearThreadStatsTag();
                return false;
            } catch (Throwable th) {
                th = th;
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                }
                TrafficStats.clearThreadStatsTag();
                throw th;
            }
        } catch (IOException unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static boolean A02(Context context) {
        int i = Build.VERSION.SDK_INT;
        ContentResolver contentResolver = context.getContentResolver();
        return i < 17 ? Settings.System.getInt(contentResolver, "airplane_mode_on", 0) != 0 : Settings.Global.getInt(contentResolver, "airplane_mode_on", 0) != 0;
    }

    public int A03(boolean z) {
        C02E c02e = this.A01;
        TelephonyManager A0G = c02e.A0G();
        ConnectivityManager A0B = c02e.A0B();
        if (A0B == null || A0G == null) {
            return 0;
        }
        NetworkInfo networkInfo = null;
        try {
            networkInfo = A0B.getActiveNetworkInfo();
        } catch (RuntimeException e) {
            if (!(e.getCause() instanceof DeadObjectException) && (Build.VERSION.SDK_INT < 24 || !(e.getCause() instanceof DeadSystemException))) {
                throw e;
            }
        }
        if (networkInfo != null && networkInfo.isConnected()) {
            if (networkInfo.getType() == 1) {
                return 1;
            }
            if (Build.VERSION.SDK_INT >= 24) {
                Pair determineNetworkStateUsingSubscriptionManager = NetworkStateManager$SubscriptionManagerBasedRoamingDetector.determineNetworkStateUsingSubscriptionManager(c02e, z);
                if (((Boolean) determineNetworkStateUsingSubscriptionManager.first).booleanValue()) {
                    return ((Number) determineNetworkStateUsingSubscriptionManager.second).intValue();
                }
            }
            if (networkInfo.isRoaming() || A0G.isNetworkRoaming()) {
                return 3;
            }
            String simCountryIso = A0G.getSimCountryIso();
            if (TextUtils.isEmpty(simCountryIso)) {
                return 3;
            }
            String simOperator = A0G.getSimOperator();
            if (TextUtils.isEmpty(simOperator)) {
                return 3;
            }
            if (A0G.getPhoneType() != 2) {
                String networkCountryIso = A0G.getNetworkCountryIso();
                if (!TextUtils.isEmpty(networkCountryIso) && simCountryIso.equals(networkCountryIso)) {
                    String networkOperator = A0G.getNetworkOperator();
                    if (TextUtils.isEmpty(networkOperator)) {
                        return 3;
                    }
                    if (networkOperator.equals(simOperator) || C0FJ.A00.contains(new C0FK(networkOperator, simOperator))) {
                    }
                }
                return 3;
            }
            return 2;
        }
        return 0;
    }

    public NetworkInfo A04() {
        ConnectivityManager A0B = this.A01.A0B();
        if (A0B == null) {
            Log.w("NetworkStateManager/getActiveNetworkInfo cm=null");
            return null;
        }
        return A0B.getActiveNetworkInfo();
    }

    public boolean A05() {
        ConnectivityManager A0B = this.A01.A0B();
        if (A0B == null) {
            return false;
        }
        try {
            NetworkInfo activeNetworkInfo = A0B.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                return activeNetworkInfo.isConnected();
            }
            return false;
        } catch (RuntimeException e) {
            if (e.getCause() instanceof DeadObjectException) {
                this.A00.A09("networkstatemanager/deadOS", null, false);
                return false;
            }
            throw e;
        }
    }

    public boolean A06() {
        if (Build.VERSION.SDK_INT < 24) {
            return false;
        }
        ConnectivityManager A0B = this.A01.A0B();
        if (A0B == null) {
            Log.w("NetworkStateManager/isDataSaverOn cm=null");
            return false;
        } else if (A0B.isActiveNetworkMetered()) {
            A0B.getRestrictBackgroundStatus();
            return A0B.getRestrictBackgroundStatus() == 3;
        } else {
            return false;
        }
    }
}
