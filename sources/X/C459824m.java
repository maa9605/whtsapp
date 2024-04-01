package X;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.telecom.Connection;
import android.telecom.ConnectionRequest;
import android.telecom.PhoneAccount;
import android.telecom.PhoneAccountHandle;
import android.telecom.TelecomManager;
import com.google.android.search.verification.client.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.SelfManagedConnectionService;
import com.whatsapp.voipcalling.Voip;
import java.util.Iterator;

/* renamed from: X.24m */
/* loaded from: classes2.dex */
public class C459824m {
    public static volatile C459824m A01;
    public AnonymousClass257 A00;

    public C459824m(C001200o c001200o, C02E c02e, C0EW c0ew) {
        this.A00 = Build.VERSION.SDK_INT >= 28 ? new AnonymousClass257(c001200o, c02e, c0ew) : null;
    }

    public static C459824m A00() {
        if (A01 == null) {
            synchronized (C459824m.class) {
                if (A01 == null) {
                    A01 = new C459824m(C001200o.A01, C02E.A00(), C0EW.A00());
                }
            }
        }
        return A01;
    }

    public Connection A01(ConnectionRequest connectionRequest, boolean z) {
        Bundle bundle;
        AnonymousClass257 A03 = A03();
        C000700j.A01();
        Bundle extras = connectionRequest.getExtras();
        C74403dD c74403dD = null;
        if (extras == null) {
            StringBuilder sb = new StringBuilder("voip/SelfManagedConnectionsManager/createSelfManagedConnection extras is null for request ");
            sb.append(connectionRequest);
            Log.i(sb.toString());
        } else {
            if (z) {
                bundle = extras;
            } else {
                bundle = extras.getBundle("android.telecom.extra.INCOMING_CALL_EXTRAS");
                if (bundle == null) {
                    StringBuilder sb2 = new StringBuilder("voip/SelfManagedConnectionsManager/createSelfManagedConnection EXTRA_INCOMING_CALL_EXTRAS is null for request ");
                    sb2.append(connectionRequest);
                    Log.i(sb2.toString());
                    return null;
                }
            }
            String string = bundle.getString("call_id");
            UserJid nullable = UserJid.getNullable(bundle.getString("peer_jid"));
            String string2 = bundle.getString("peer_display_name");
            if (string != null && nullable != null && string2 != null) {
                c74403dD = new C74403dD(A03, string);
                c74403dD.setConnectionProperties(128);
                c74403dD.setAddress(connectionRequest.getAddress(), 1);
                c74403dD.setCallerDisplayName(string2, 1);
                c74403dD.setConnectionCapabilities(c74403dD.getConnectionCapabilities() | 2);
                c74403dD.setVideoState(connectionRequest.getVideoState());
                c74403dD.setExtras(extras);
                StringBuilder sb3 = new StringBuilder("voip/SelfManagedConnectionsManager/createSelfManagedConnection with ");
                sb3.append(nullable);
                sb3.append(", call id: ");
                sb3.append(string);
                sb3.append(", isOutgoing ");
                sb3.append(z);
                Log.i(sb3.toString());
                A03.A02(c74403dD);
                Iterator it = ((AnonymousClass009) A03).A00.iterator();
                while (true) {
                    C0G5 c0g5 = (C0G5) it;
                    if (!c0g5.hasNext()) {
                        break;
                    }
                    AnonymousClass258 anonymousClass258 = (AnonymousClass258) c0g5.next();
                    if (z) {
                        anonymousClass258.A00(string);
                    } else if (!(anonymousClass258 instanceof C86733yB)) {
                        C000700j.A01();
                    } else {
                        C86733yB c86733yB = (C86733yB) anonymousClass258;
                        C000700j.A01();
                        StringBuilder sb4 = new StringBuilder("voip/service/selfManagedConnectionListener/onCreateIncomingConnection ");
                        sb4.append(string);
                        Log.i(sb4.toString());
                        CallInfo callInfo = Voip.getCallInfo();
                        if (callInfo != null && (string.equals(callInfo.callId) || string.equals(callInfo.callWaitingInfo.A04))) {
                            C25L c25l = c86733yB.A00;
                            c25l.A0K.removeMessages(1);
                            Handler handler = c25l.A0K;
                            handler.sendMessageDelayed(handler.obtainMessage(28, string), 500L);
                        } else {
                            c86733yB.A00.A1z.A05(string);
                        }
                    }
                }
            } else {
                StringBuilder sb5 = new StringBuilder("voip/SelfManagedConnectionsManager/createSelfManagedConnection invalid request ");
                sb5.append(connectionRequest);
                Log.i(sb5.toString());
                return null;
            }
        }
        return c74403dD;
    }

    public C74403dD A02(String str) {
        return (C74403dD) A03().A05.get(str);
    }

    public final AnonymousClass257 A03() {
        if (Build.VERSION.SDK_INT >= 28) {
            AnonymousClass257 anonymousClass257 = this.A00;
            if (anonymousClass257 != null) {
                return anonymousClass257;
            }
            throw null;
        }
        throw new RuntimeException("Requires API level 28");
    }

    public void A04(AnonymousClass258 anonymousClass258) {
        A03().A01(anonymousClass258);
    }

    public void A05(String str) {
        AnonymousClass257 A03 = A03();
        C000700j.A01();
        StringBuilder sb = new StringBuilder("voip/SelfManagedConnectionsManager/disconnectConnectionIfExists");
        sb.append(str);
        Log.i(sb.toString());
        C74403dD c74403dD = (C74403dD) A03.A05.get(str);
        if (c74403dD != null) {
            c74403dD.A00(2);
        }
    }

    public void A06(String str, String str2) {
        AnonymousClass257 A03 = A03();
        C74403dD c74403dD = (C74403dD) A03.A05.get(str);
        if (c74403dD != null) {
            StringBuilder sb = new StringBuilder("voip/SelfManagedConnectionsManager/onCallAutoConnected changing CallId from: ");
            sb.append(str);
            sb.append(" -> ");
            sb.append(str2);
            Log.i(sb.toString());
            A03.A03(c74403dD);
            c74403dD.A01 = str2;
            A03.A02(c74403dD);
        }
    }

    public boolean A07(Context context, UserJid userJid) {
        AnonymousClass257 A03 = A03();
        C000700j.A01();
        if (A03.A00 == null) {
            TelecomManager telecomManager = A03.A02;
            if (telecomManager == null) {
                Log.w("voip/SelfManagedConnectionsManager/registerPhoneAccount telecomManager is null");
                return false;
            }
            Uri A00 = AnonymousClass257.A00(userJid);
            if (A00 == null) {
                Log.w("voip/SelfManagedConnectionsManager/registerPhoneAccount address is null");
                return false;
            }
            StringBuilder sb = new StringBuilder("voip/SelfManagedConnectionsManager/registerPhoneAccount ");
            sb.append(userJid);
            Log.i(sb.toString());
            PhoneAccountHandle phoneAccountHandle = new PhoneAccountHandle(new ComponentName(context, SelfManagedConnectionService.class), userJid.getRawString());
            A03.A00 = phoneAccountHandle;
            C001200o c001200o = A03.A03;
            PhoneAccount.Builder shortDescription = PhoneAccount.builder(phoneAccountHandle, c001200o.A00.getString(R.string.whatsapp_name)).addSupportedUriScheme("tel").setAddress(A00).setCapabilities(3080).setShortDescription(c001200o.A00.getString(R.string.voip_phone_account_description));
            if (Build.VERSION.SDK_INT >= 28) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("android.telecom.extra.LOG_SELF_MANAGED_CALLS", false);
                shortDescription.setExtras(bundle);
            }
            try {
                telecomManager.registerPhoneAccount(shortDescription.build());
                return true;
            } catch (SecurityException e) {
                Log.e(e);
                A03.A00 = null;
                return false;
            }
        }
        return true;
    }
}
