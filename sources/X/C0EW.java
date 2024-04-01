package X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.whatsapp.voipcalling.JNIUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.0EW  reason: invalid class name */
/* loaded from: classes.dex */
public final class C0EW {
    public static volatile C0EW A03;
    public SharedPreferences A00;
    public final C003701t A01;
    public final C02O A02;

    public C0EW(C02O c02o, C003701t c003701t) {
        this.A01 = c003701t;
        this.A02 = c02o;
    }

    public static C0EW A00() {
        if (A03 == null) {
            synchronized (C0EW.class) {
                if (A03 == null) {
                    A03 = new C0EW(C02O.A00(), C003701t.A00());
                }
            }
        }
        return A03;
    }

    public static final String A01(int i, int i2) {
        if (i2 == 1) {
            return C000200d.A0D("voip_camera_info_", i);
        }
        return C000200d.A0F("voip_camera_info_", i, "_api_", i2);
    }

    public long A02(String str) {
        SharedPreferences A04 = A04();
        StringBuilder sb = new StringBuilder("joinable_");
        sb.append(str);
        return A04.getLong(sb.toString(), -1L);
    }

    public final SharedPreferences.Editor A03() {
        return A04().edit();
    }

    public final synchronized SharedPreferences A04() {
        SharedPreferences sharedPreferences;
        sharedPreferences = this.A00;
        if (sharedPreferences == null) {
            sharedPreferences = this.A02.A01("voip_prefs");
            this.A00 = sharedPreferences;
        }
        return sharedPreferences;
    }

    public String A05() {
        String A05 = this.A01.A05(151);
        return !TextUtils.isEmpty(A05) ? A05 : A04().getString("camera2_required_hardware_support_level", null);
    }

    public List A06() {
        Map<String, ?> all = A04().getAll();
        ArrayList arrayList = new ArrayList();
        for (String str : all.keySet()) {
            if (str.startsWith("joinable_")) {
                arrayList.add(str.substring(9));
            }
        }
        return arrayList;
    }

    public void A07(JNIUtils.H26xSupportResult h26xSupportResult) {
        A03().putBoolean("video_codec_h264_hw_supported", h26xSupportResult.isH264HwSupported).putBoolean("video_codec_h264_sw_supported", h26xSupportResult.isH264SwSupported).putBoolean("video_codec_h265_hw_supported", h26xSupportResult.isH265HwSupported).putBoolean("video_codec_h265_sw_supported", h26xSupportResult.isH265SwSupported).apply();
    }

    public void A08(String str) {
        SharedPreferences.Editor A032 = A03();
        StringBuilder sb = new StringBuilder("active_joinable_call");
        sb.append(str);
        A032.putBoolean(sb.toString(), true).apply();
    }

    public void A09(String str, long j) {
        SharedPreferences.Editor A032 = A03();
        StringBuilder sb = new StringBuilder("joinable_");
        sb.append(str);
        A032.putLong(sb.toString(), j).apply();
    }

    public boolean A0A() {
        return A04().contains("video_call_back_camera_width") || A04().contains("video_call_back_camera_height");
    }

    public boolean A0B() {
        return A04().contains("video_call_front_camera_width") || A04().contains("video_call_front_camera_height");
    }
}
