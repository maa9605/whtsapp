package com.whatsapp.voipcalling;

import X.AbstractC84593u0;
import X.AnonymousClass009;
import X.AnonymousClass257;
import X.AnonymousClass258;
import X.C000700j;
import X.C0G5;
import X.C25L;
import X.C2IY;
import X.C459824m;
import X.C49022Ia;
import X.C54112i6;
import X.C86733yB;
import android.content.Intent;
import android.os.Bundle;
import android.telecom.Connection;
import android.telecom.ConnectionRequest;
import android.telecom.DisconnectCause;
import android.telecom.PhoneAccountHandle;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.Voip;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class SelfManagedConnectionService extends AbstractC84593u0 {
    public C459824m A00;

    @Override // X.AbstractC84593u0, android.app.Service
    public void onCreate() {
        super.onCreate();
        Log.i("voip/SelfManagedConnectionService/onCreate");
    }

    @Override // android.telecom.ConnectionService
    public Connection onCreateIncomingConnection(PhoneAccountHandle phoneAccountHandle, ConnectionRequest connectionRequest) {
        StringBuilder sb = new StringBuilder("voip/SelfManagedConnectionService/onCreateIncomingConnection ");
        sb.append(connectionRequest);
        Log.i(sb.toString());
        Connection A01 = this.A00.A01(connectionRequest, false);
        return A01 != null ? A01 : Connection.createFailedConnection(new DisconnectCause(1));
    }

    @Override // android.telecom.ConnectionService
    public void onCreateIncomingConnectionFailed(PhoneAccountHandle phoneAccountHandle, ConnectionRequest connectionRequest) {
        String string;
        StringBuilder sb = new StringBuilder("voip/SelfManagedConnectionService/onCreateIncomingConnectionFailed ");
        sb.append(connectionRequest);
        Log.i(sb.toString());
        AnonymousClass257 A03 = this.A00.A03();
        C000700j.A01();
        Bundle extras = connectionRequest.getExtras();
        if (extras != null && (string = extras.getString("call_id")) != null) {
            Iterator it = ((AnonymousClass009) A03).A00.iterator();
            while (true) {
                C0G5 c0g5 = (C0G5) it;
                if (c0g5.hasNext()) {
                    AnonymousClass258 anonymousClass258 = (AnonymousClass258) c0g5.next();
                    if (!(anonymousClass258 instanceof C86733yB)) {
                        C000700j.A01();
                    } else {
                        C86733yB c86733yB = (C86733yB) anonymousClass258;
                        C000700j.A01();
                        StringBuilder sb2 = new StringBuilder("voip/service/selfManagedConnectionListener/onCreateIncomingConnectionFailed ");
                        sb2.append(string);
                        Log.i(sb2.toString());
                        if (string.equals(Voip.getCurrentCallId())) {
                            C25L c25l = c86733yB.A00;
                            c25l.A0K.removeMessages(1);
                            c25l.A0u(string, "busy", 4);
                        }
                    }
                } else {
                    return;
                }
            }
        }
    }

    @Override // android.telecom.ConnectionService
    public Connection onCreateOutgoingConnection(PhoneAccountHandle phoneAccountHandle, ConnectionRequest connectionRequest) {
        StringBuilder sb = new StringBuilder("voip/SelfManagedConnectionService/onCreateOutgoingConnection ");
        sb.append(connectionRequest);
        Log.i(sb.toString());
        Connection A01 = this.A00.A01(connectionRequest, true);
        return A01 != null ? A01 : Connection.createFailedConnection(new DisconnectCause(1));
    }

    @Override // android.telecom.ConnectionService
    public void onCreateOutgoingConnectionFailed(PhoneAccountHandle phoneAccountHandle, ConnectionRequest connectionRequest) {
        String string;
        StringBuilder sb = new StringBuilder("voip/SelfManagedConnectionService/onCreateOutgoingConnectionFailed ");
        sb.append(connectionRequest);
        Log.i(sb.toString());
        AnonymousClass257 A03 = this.A00.A03();
        C000700j.A01();
        Bundle extras = connectionRequest.getExtras();
        if (extras != null && (string = extras.getString("call_id")) != null) {
            Iterator it = ((AnonymousClass009) A03).A00.iterator();
            while (true) {
                C0G5 c0g5 = (C0G5) it;
                if (c0g5.hasNext()) {
                    AnonymousClass258 anonymousClass258 = (AnonymousClass258) c0g5.next();
                    if (!(anonymousClass258 instanceof C54112i6)) {
                        C000700j.A01();
                    } else {
                        C54112i6 c54112i6 = (C54112i6) anonymousClass258;
                        C000700j.A01();
                        C2IY c2iy = c54112i6.A01;
                        C49022Ia c49022Ia = c2iy.A0L;
                        StringBuilder sb2 = new StringBuilder("app/startOutgoingCall/onCreateOutgoingConnectionFailed ");
                        sb2.append(string);
                        sb2.append(", pendingCallCommand: ");
                        sb2.append(c49022Ia);
                        Log.i(sb2.toString());
                        if (c49022Ia != null && string.equals(c49022Ia.A03)) {
                            Log.w("app/startOutgoingCall/failed_no_cellular_call_in_progress");
                            Voip.CallState currentCallState = Voip.getCurrentCallState();
                            if (currentCallState == Voip.CallState.NONE) {
                                c54112i6.A00.A05(R.string.can_not_start_voip_call_in_phone_call, 1);
                            } else if (currentCallState == Voip.CallState.ACTIVE_ELSEWHERE) {
                                c54112i6.A00.A05(R.string.can_not_start_voip_call_when_active_elsewhere_message, 1);
                            } else {
                                c54112i6.A00.A05(R.string.error_call_disabled_during_call, 1);
                            }
                            c2iy.A0L = null;
                            c2iy.A01.removeMessages(1);
                        }
                    }
                } else {
                    return;
                }
            }
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        Log.i("voip/SelfManagedConnectionService/onDestroy");
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        StringBuilder sb = new StringBuilder("voip/SelfManagedConnectionService/onStartCommand ");
        sb.append(intent);
        Log.i(sb.toString());
        return super.onStartCommand(intent, i, i2);
    }

    @Override // android.telecom.ConnectionService, android.app.Service
    public boolean onUnbind(Intent intent) {
        StringBuilder sb = new StringBuilder("voip/SelfManagedConnectionService/onUnbind ");
        sb.append(intent);
        Log.i(sb.toString());
        return super.onUnbind(intent);
    }
}
