package X;

import android.telecom.CallAudioState;
import android.telecom.Connection;
import android.telecom.DisconnectCause;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.Voip;
import java.util.Iterator;

/* renamed from: X.3dD  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C74403dD extends Connection {
    public AnonymousClass257 A00;
    public String A01;

    public C74403dD(AnonymousClass257 anonymousClass257, String str) {
        this.A00 = anonymousClass257;
        this.A01 = str;
    }

    public void A00(int i) {
        if (this.A00 != null) {
            StringBuilder A0P = C000200d.A0P("voip/SelfManagedConnection/setDisconnected ");
            A0P.append(this.A01);
            A0P.append(", cause: ");
            A0P.append(i);
            Log.i(A0P.toString());
            setDisconnected(new DisconnectCause(i));
            destroy();
            this.A00.A03(this);
            this.A00 = null;
        }
    }

    @Override // android.telecom.Connection
    public void onAbort() {
        Log.i("voip/SelfManagedConnection/onAbort");
        super.onAbort();
    }

    @Override // android.telecom.Connection
    public void onAnswer() {
        onAnswer(0);
    }

    @Override // android.telecom.Connection
    public void onAnswer(int i) {
        Log.i("voip/SelfManagedConnection/onAnswer");
        AnonymousClass257 anonymousClass257 = this.A00;
        if (anonymousClass257 != null) {
            anonymousClass257.A04(this.A01, 2);
        }
        setActive();
    }

    @Override // android.telecom.Connection
    public void onCallAudioStateChanged(CallAudioState callAudioState) {
        StringBuilder sb = new StringBuilder("voip/SelfManagedConnection/onCallAudioStateChanged ");
        sb.append(callAudioState);
        Log.i(sb.toString());
        super.onCallAudioStateChanged(callAudioState);
        AnonymousClass257 anonymousClass257 = this.A00;
        if (anonymousClass257 != null) {
            String str = this.A01;
            C000700j.A01();
            Iterator it = ((AnonymousClass009) anonymousClass257).A00.iterator();
            while (true) {
                C0G5 c0g5 = (C0G5) it;
                if (c0g5.hasNext()) {
                    AnonymousClass258 anonymousClass258 = (AnonymousClass258) c0g5.next();
                    if (!(anonymousClass258 instanceof C86743yC)) {
                        C000700j.A01();
                    } else {
                        C000700j.A01();
                        StringBuilder sb2 = new StringBuilder("voip/audio_route/selfManagedConnectionListener/onCallAudioStateChanged ");
                        sb2.append(str);
                        sb2.append(", ");
                        C74613dY c74613dY = ((C86743yC) anonymousClass258).A00;
                        sb2.append(Voip.A05(c74613dY.A00));
                        sb2.append(" -> ");
                        sb2.append(callAudioState);
                        Log.i(sb2.toString());
                        CallInfo callInfo = Voip.getCallInfo();
                        if (Voip.A0A(callInfo, str) && callInfo.callState != Voip.CallState.ACTIVE_ELSEWHERE) {
                            int i = c74613dY.A00;
                            if (i != 3 && i != 4) {
                                c74613dY.A02(callInfo);
                                c74613dY.A03(callInfo);
                            } else {
                                c74613dY.A01(callInfo);
                            }
                        }
                    }
                } else {
                    return;
                }
            }
        }
    }

    @Override // android.telecom.Connection
    public void onDisconnect() {
        Log.i("voip/SelfManagedConnection/onDisconnect");
        AnonymousClass257 anonymousClass257 = this.A00;
        if (anonymousClass257 != null) {
            anonymousClass257.A04(this.A01, 4);
        }
        A00(2);
    }

    @Override // android.telecom.Connection
    public void onHold() {
        Log.i("voip/SelfManagedConnection/onHold");
        AnonymousClass257 anonymousClass257 = this.A00;
        if (anonymousClass257 != null) {
            anonymousClass257.A04(this.A01, 0);
        }
        setOnHold();
    }

    @Override // android.telecom.Connection
    public void onReject() {
        Log.i("voip/SelfManagedConnection/onReject");
        AnonymousClass257 anonymousClass257 = this.A00;
        if (anonymousClass257 != null) {
            anonymousClass257.A04(this.A01, 3);
        }
        A00(6);
    }

    @Override // android.telecom.Connection
    public void onReject(String str) {
        StringBuilder sb = new StringBuilder("voip/SelfManagedConnection/onReject ");
        sb.append(str);
        Log.i(sb.toString());
        onReject();
    }

    @Override // android.telecom.Connection
    public void onShowIncomingCallUi() {
        Log.i("voip/SelfManagedConnection/onShowIncomingCallUi");
        AnonymousClass257 anonymousClass257 = this.A00;
        if (anonymousClass257 != null) {
            String str = this.A01;
            C000700j.A01();
            Iterator it = ((AnonymousClass009) anonymousClass257).A00.iterator();
            while (true) {
                C0G5 c0g5 = (C0G5) it;
                if (c0g5.hasNext()) {
                    ((AnonymousClass258) c0g5.next()).A01(str);
                } else {
                    return;
                }
            }
        }
    }

    @Override // android.telecom.Connection
    public void onStateChanged(int i) {
        C000200d.A0q("voip/SelfManagedConnection/onStateChanged ", i);
        super.onStateChanged(i);
    }

    @Override // android.telecom.Connection
    public void onUnhold() {
        Log.i("voip/SelfManagedConnection/onUnhold");
        AnonymousClass257 anonymousClass257 = this.A00;
        if (anonymousClass257 != null) {
            anonymousClass257.A04(this.A01, 1);
        }
        setActive();
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("SelfManagedConnection: ");
        A0P.append(this.A01);
        return A0P.toString();
    }
}
