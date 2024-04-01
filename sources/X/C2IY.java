package X;

import android.app.Application;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.telecom.PhoneAccountHandle;
import android.telecom.TelecomManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.widget.Toast;
import com.google.android.search.verification.client.R;
import com.whatsapp.DisplayExceptionDialogFactory$ContactBlockedDialogFragment;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.Voip;
import com.whatsapp.voipcalling.VoipActivityV2;
import com.whatsapp.voipcalling.VoipPermissionsActivity;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.2IY */
/* loaded from: classes2.dex */
public class C2IY {
    public static volatile C2IY A0M;
    public long A00;
    public final Handler A01;
    public final C03020Dv A02;
    public final C018508q A03;
    public final C02L A04;
    public final C01B A05;
    public final C40261rr A06;
    public final C05W A07;
    public final C018708s A08;
    public final C0E7 A09;
    public final C02E A0A;
    public final AnonymousClass012 A0B;
    public final C001200o A0C;
    public final C02F A0D;
    public final C002301c A0E;
    public final C0EC A0F;
    public final C0EE A0G;
    public final C03070Ea A0H;
    public final InterfaceC002901k A0I;
    public final C459824m A0J;
    public final C41641uH A0K;
    public volatile C49022Ia A0L;

    public C2IY(AnonymousClass012 anonymousClass012, C018508q c018508q, C02L c02l, C03070Ea c03070Ea, C001200o c001200o, InterfaceC002901k interfaceC002901k, C01B c01b, C05W c05w, C02E c02e, C018708s c018708s, C002301c c002301c, C40261rr c40261rr, C0EE c0ee, C0EC c0ec, C0E7 c0e7, C41641uH c41641uH, C02F c02f, C03020Dv c03020Dv, C459824m c459824m) {
        this.A0C = c001200o;
        this.A0B = anonymousClass012;
        this.A03 = c018508q;
        this.A04 = c02l;
        this.A0H = c03070Ea;
        this.A0I = interfaceC002901k;
        this.A05 = c01b;
        this.A07 = c05w;
        this.A0A = c02e;
        this.A08 = c018708s;
        this.A0E = c002301c;
        this.A06 = c40261rr;
        this.A0G = c0ee;
        this.A0F = c0ec;
        this.A09 = c0e7;
        this.A0K = c41641uH;
        this.A0D = c02f;
        this.A02 = c03020Dv;
        this.A0J = c459824m;
        if (Build.VERSION.SDK_INT >= 28) {
            c459824m.A03().A01(new C54112i6(this, c459824m, c018508q));
        }
        this.A01 = new Handler(Looper.getMainLooper()) { // from class: X.2i7
            {
                C2IY.this = this;
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                if (message.what == 1) {
                    C2IY c2iy = C2IY.this;
                    C49022Ia c49022Ia = c2iy.A0L;
                    StringBuilder sb = new StringBuilder("app/startOutgoingCall/WHAT_START_PENDING_INTENT ");
                    sb.append(c49022Ia);
                    Log.i(sb.toString());
                    if (c49022Ia != null) {
                        long j = c2iy.A00;
                        if (j > 0) {
                            c49022Ia.A00 = SystemClock.elapsedRealtime() - j;
                        }
                        c2iy.A0I.AS1(new RunnableEBaseShape4S0200000_I0_4(c2iy, c49022Ia, 47));
                        c2iy.A0L = null;
                    }
                }
            }
        };
    }

    public int A00(C06C c06c, Context context, int i, boolean z, boolean z2) {
        if (c06c == null) {
            return 1;
        }
        return A02(Collections.singletonList(c06c), context, i, z, z2, null);
    }

    public int A01(List list, Context context, int i, boolean z) {
        return A02(list, context, i, false, z, null);
    }

    public final int A02(List list, Context context, int i, boolean z, boolean z2, GroupJid groupJid) {
        boolean z3 = z2;
        AnonymousClass012 anonymousClass012 = this.A0B;
        C02L c02l = this.A04;
        String A02 = C05V.A02(anonymousClass012, c02l, true);
        C000700j.A01();
        Application application = this.A0C.A00;
        StringBuilder sb = new StringBuilder("app/startOutgoingCall/from ");
        sb.append(i);
        sb.append(", video call:");
        sb.append(z3);
        Log.i(sb.toString());
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            UserJid userJid = (UserJid) ((C06C) it.next()).A03(UserJid.class);
            if (this.A06.A0H(userJid)) {
                arrayList2.add(userJid);
                Log.w("app/startOutgoingCall/failed_contact_blocked");
            } else {
                arrayList.add(userJid);
            }
        }
        int A03 = A03(list, context, z3, arrayList, arrayList2, null);
        if (A03 != 0) {
            if (A03 == 7) {
                Intent intent = new Intent(context, VoipPermissionsActivity.class);
                intent.putStringArrayListExtra("jids", C003101m.A0E(arrayList));
                intent.putExtra("call_from", i);
                intent.putExtra("video_call", z3);
                intent.putExtra("smaller_call_btn", z);
                if (groupJid != null) {
                    intent.putExtra("group_jid", groupJid.getRawString());
                }
                context.startActivity(intent);
            }
            return A03;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            linkedHashMap.put(it2.next(), null);
        }
        C49022Ia c49022Ia = new C49022Ia(A02, linkedHashMap, z3, groupJid, i, z);
        if (A05()) {
            UserJid userJid2 = (UserJid) arrayList.get(0);
            C06C A0A = this.A07.A0A(userJid2);
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                linkedHashMap2.put(it3.next(), null);
            }
            C49022Ia c49022Ia2 = new C49022Ia(A02, linkedHashMap2, z3, groupJid, i, z);
            if (A05() && Build.VERSION.SDK_INT >= 28) {
                this.A00 = SystemClock.elapsedRealtime();
                c02l.A05();
                UserJid userJid3 = c02l.A03;
                if (userJid3 != null) {
                    C459824m c459824m = this.A0J;
                    if (c459824m.A07(application, userJid3)) {
                        this.A0L = c49022Ia2;
                        String A08 = this.A08.A08(A0A, false);
                        AnonymousClass257 A032 = c459824m.A03();
                        C000700j.A01();
                        StringBuilder sb2 = new StringBuilder("voip/SelfManagedConnectionsManager/placeOutgoingCall ");
                        sb2.append(userJid2);
                        Log.i(sb2.toString());
                        if (!A032.A01) {
                            Log.w("voip/SelfManagedConnectionsManager/placeOutgoingCall outgoingEnabled is false");
                        } else {
                            TelecomManager telecomManager = A032.A02;
                            if (telecomManager == null) {
                                Log.w("voip/SelfManagedConnectionsManager/placeOutgoingCall telecomManager is null");
                            } else {
                                PhoneAccountHandle phoneAccountHandle = A032.A00;
                                if (phoneAccountHandle == null) {
                                    Log.w("voip/SelfManagedConnectionsManager/placeOutgoingCall phoneAccountHandle is null");
                                } else {
                                    try {
                                        if (!telecomManager.isOutgoingCallPermitted(phoneAccountHandle)) {
                                            Log.w("voip/SelfManagedConnectionsManager/placeOutgoingCall outgoing call not permitted for the phone account handle");
                                        } else {
                                            Uri A00 = AnonymousClass257.A00(userJid2);
                                            if (A00 != null) {
                                                if (z2 && Build.VERSION.SDK_INT >= 28 && Build.MANUFACTURER.equalsIgnoreCase("samsung")) {
                                                    z3 = false;
                                                }
                                                Bundle A01 = AnonymousClass257.A01(A02, userJid2, A08, z3, true);
                                                A01.putParcelable("android.telecom.extra.PHONE_ACCOUNT_HANDLE", A032.A00);
                                                StringBuilder sb3 = new StringBuilder();
                                                sb3.append("voip/SelfManagedConnectionsManager/placeOutgoingCall ");
                                                sb3.append(A01);
                                                Log.i(sb3.toString());
                                                try {
                                                    telecomManager.placeCall(A00, A01);
                                                    Handler handler = this.A01;
                                                    handler.removeMessages(1);
                                                    handler.sendEmptyMessageDelayed(1, 2000L);
                                                    return 0;
                                                } catch (SecurityException e) {
                                                    Log.e(e);
                                                }
                                            }
                                        }
                                    } catch (Exception e2) {
                                        Log.e(e2);
                                    }
                                }
                            }
                        }
                        this.A0L = null;
                    }
                } else {
                    throw null;
                }
            }
        }
        this.A0I.AS1(new RunnableEBaseShape4S0200000_I0_4(this, c49022Ia, 47));
        return 0;
    }

    public final int A03(List list, final Context context, boolean z, ArrayList arrayList, ArrayList arrayList2, String str) {
        boolean equals;
        if (list.isEmpty()) {
            Log.e("app/startOutgoingCall empty list of contacts");
            return 1;
        } else if (this.A0L != null) {
            Log.e("app/startOutgoingCall user tapped the call button twice before the telecom framework responds");
            return 2;
        } else {
            this.A00 = 0L;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C06C c06c = (C06C) it.next();
                if (this.A04.A0A(c06c.A02())) {
                    this.A03.A05(R.string.voip_error_calling_self, 1);
                    return 1;
                }
                C000700j.A09(!c06c.A0C(), "can't start a call with a group contact");
            }
            if (!this.A0H.A05()) {
                Log.w("app/startOutgoingCall/tos_not_allowed");
                return 3;
            }
            boolean z2 = true;
            if (str == null) {
                z2 = false;
                if (this.A09.A03(true) == 0) {
                    if (C0E7.A02(context)) {
                        Log.w("app/startOutgoingCall/failed_airplane_mode_is_on");
                        this.A03.A05(R.string.can_not_start_voip_call_in_airplane_mode, 1);
                        return 4;
                    }
                    Log.w("app/startOutgoingCall/failed_no_network");
                    this.A03.A05(R.string.voip_call_failed_no_network, 1);
                    return 4;
                }
            }
            String string = context.getString(R.string.voip_blocked_contact, this.A0E.A0E(this.A08.A0C(arrayList2)));
            if (arrayList2.size() == list.size()) {
                C018508q c018508q = this.A03;
                C0B5 c0b5 = c018508q.A00;
                if (c0b5 != null) {
                    if (!c0b5.AFE() && (c0b5 instanceof ActivityC02290Ap)) {
                        DisplayExceptionDialogFactory$ContactBlockedDialogFragment displayExceptionDialogFactory$ContactBlockedDialogFragment = new DisplayExceptionDialogFactory$ContactBlockedDialogFragment();
                        Bundle bundle = new Bundle();
                        bundle.putString("message", string);
                        bundle.putParcelableArrayList("jids", arrayList2);
                        displayExceptionDialogFactory$ContactBlockedDialogFragment.A0P(bundle);
                        c0b5.AUh(displayExceptionDialogFactory$ContactBlockedDialogFragment);
                        return 5;
                    }
                    return 5;
                }
                c018508q.A0E(string, 0);
                return 5;
            }
            if (!arrayList2.isEmpty()) {
                this.A03.A0E(string, 0);
            }
            C000700j.A08(!arrayList.isEmpty(), "callable jids must not be empty");
            Object obj = arrayList.get(0);
            if (!this.A0D.A0B(z)) {
                Log.w("app/startOutgoingCall/failed_no_record_audio_permission");
                return 7;
            }
            CallInfo callInfo = Voip.getCallInfo();
            if (callInfo != null && Voip.A08(callInfo)) {
                if (z2) {
                    equals = TextUtils.equals(str, callInfo.callId);
                } else {
                    equals = obj.equals(callInfo.peerJid);
                }
                if (callInfo.callState == Voip.CallState.ACTIVE_ELSEWHERE) {
                    Log.w("app/startOutgoingCall/failed_call_is_active_on_elsewhere");
                    int i = R.string.can_not_start_voip_call_when_active_elsewhere_message;
                    if (z2) {
                        i = R.string.voip_joinable_can_not_join_when_active_elsewhere_message;
                    }
                    C019208x c019208x = new C019208x(context);
                    c019208x.A02(i);
                    c019208x.A01.A0J = true;
                    c019208x.A06(R.string.can_not_start_voip_call_when_active_elsewhere_positive_action, new DialogInterface.OnClickListener() { // from class: X.3bt
                        {
                            C2IY.this = this;
                        }

                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            C2IY c2iy = C2IY.this;
                            Context context2 = context;
                            context2.startActivity(C20R.A00(context2, c2iy.A05, c2iy.A0G, false));
                        }
                    });
                    c019208x.A04(R.string.ok, new DialogInterface.OnClickListener() { // from class: X.3bu
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            dialogInterface.dismiss();
                        }
                    });
                    c019208x.A01();
                    return 8;
                } else if (equals) {
                    Intent A01 = VoipActivityV2.A01(context, callInfo.peerJid, Boolean.valueOf(!this.A02.A00));
                    A01.putExtra("lobbyEntryPoint", 7);
                    context.startActivity(A01);
                    return 8;
                } else {
                    Log.w("app/startOutgoingCall/ try to start outgoing call from active voip call ");
                    Toast makeText = Toast.makeText(context, (int) R.string.error_call_disabled_during_call, 1);
                    makeText.setGravity(17, 0, 0);
                    makeText.show();
                    return 8;
                }
            }
            TelephonyManager A0G = this.A0A.A0G();
            if (A0G == null || A0G.getCallState() == 0) {
                return 0;
            }
            Log.w("app/startOutgoingCall/failed_cellular_call_in_progress");
            int i2 = R.string.can_not_start_voip_call_in_phone_call;
            if (z2) {
                i2 = R.string.voip_joinable_can_not_join_already_in_phone_call;
            }
            this.A03.A05(i2, 1);
            return 9;
        }
    }

    public void A04(C0D3 c0d3, Context context, int i) {
        C000700j.A01();
        StringBuilder sb = new StringBuilder("app/startFromCallLog/from ");
        sb.append(c0d3.A03().toString());
        Log.i(sb.toString());
        if (this.A0L != null) {
            Log.e("app/startFromCallLog user tapped the call button twice before the telecom framework responds");
            return;
        }
        this.A00 = 0L;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = ((AbstractCollection) c0d3.A04()).iterator();
        while (it.hasNext()) {
            UserJid userJid = ((C0D4) it.next()).A02;
            arrayList.add(userJid);
            arrayList3.add(this.A07.A0A(userJid));
        }
        boolean z = c0d3.A0E;
        C07950aM c07950aM = c0d3.A09;
        String str = c07950aM.A02;
        int A03 = A03(arrayList3, context, z, arrayList, arrayList2, AnonymousClass029.A0s(str));
        if (A03 == 0) {
            this.A0I.AS1(new RunnableEBaseShape0S0201000_I0(this, i, c0d3, 6));
        } else if (A03 == 7) {
            Intent intent = new Intent(context, VoipPermissionsActivity.class);
            intent.putExtra("join_call_log", true);
            intent.putExtra("call_log_call_id", str);
            intent.putExtra("call_log_transaction_id", c07950aM.A00);
            intent.putExtra("call_log_from_me", c07950aM.A03);
            intent.putExtra("call_log_user_jid", c07950aM.A01.getRawString());
            intent.putExtra("video_call", c0d3.A0E);
            intent.putExtra("lobby_entry_point", i);
            context.startActivity(intent);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x001d, code lost:
        if (r2.A04.A04().getBoolean("enable_telecom_framework_caller", false) == false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A05() {
        /*
            r6 = this;
            int r5 = android.os.Build.VERSION.SDK_INT
            r4 = 1
            r3 = 0
            r1 = 28
            if (r5 < r1) goto L25
            X.24m r0 = r6.A0J
            X.257 r2 = r0.A03()
            if (r5 < r1) goto L1f
            X.0EW r0 = r2.A04
            android.content.SharedPreferences r1 = r0.A04()
            java.lang.String r0 = "enable_telecom_framework_caller"
            boolean r1 = r1.getBoolean(r0, r3)
            r0 = 1
            if (r1 != 0) goto L20
        L1f:
            r0 = 0
        L20:
            r2.A01 = r0
            if (r0 == 0) goto L25
            return r4
        L25:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2IY.A05():boolean");
    }

    public boolean A06(C06C c06c, Context context, int i, boolean z) {
        return A00(c06c, context, i, z, false) == 0;
    }
}
