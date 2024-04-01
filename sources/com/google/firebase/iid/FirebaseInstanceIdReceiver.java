package com.google.firebase.iid;

import X.C1CG;
import X.C1CK;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;

/* loaded from: classes.dex */
public final class FirebaseInstanceIdReceiver extends BroadcastReceiver {
    public static int A00 = 1;
    public static C1CK A01;
    public static C1CK A02;
    public static final SparseArray A03 = new SparseArray();

    public FirebaseInstanceIdReceiver() {
    }

    public FirebaseInstanceIdReceiver(int i) {
    }

    public static void A00(BroadcastReceiver broadcastReceiver, Context context, String str, Intent intent) {
        C1CK c1ck;
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            String valueOf = String.valueOf(str);
            Log.d("FirebaseInstanceId", valueOf.length() != 0 ? "Binding to service: ".concat(valueOf) : new String("Binding to service: "));
        }
        if (broadcastReceiver.isOrderedBroadcast()) {
            broadcastReceiver.setResultCode(-1);
        }
        synchronized (FirebaseInstanceIdReceiver.class) {
            if ("com.google.firebase.MESSAGING_EVENT".equals(str)) {
                c1ck = A02;
                if (c1ck == null) {
                    c1ck = new C1CK(context, str);
                    A02 = c1ck;
                }
            } else {
                c1ck = A01;
                if (c1ck == null) {
                    c1ck = new C1CK(context, str);
                    A01 = c1ck;
                }
            }
        }
        BroadcastReceiver.PendingResult goAsync = broadcastReceiver.goAsync();
        synchronized (c1ck) {
            if (Log.isLoggable("EnhancedIntentService", 3)) {
                Log.d("EnhancedIntentService", "new intent queued in the bind-strategy delivery");
            }
            c1ck.A04.add(new C1CG(intent, goAsync, c1ck.A05));
            c1ck.A00();
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:39|(1:41)|127|43|(1:(5:46|(1:48)(1:54)|49|50|(1:53))(1:55))(1:126)|56|107|(8:62|(1:113)(2:66|(1:86)(4:70|(2:72|(1:74)(1:75))|14d|80))|87|88|(4:90|1ab|50|(1:53))(1:107)|100|50|(0))|114|(3:116|(1:118)(1:120)|119)|121|87|88|(0)(0)|100|50|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0201, code lost:
        if (r1 == null) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x020c, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x020d, code lost:
        r3 = java.lang.String.valueOf(r0);
        r1 = new java.lang.StringBuilder(r3.length() + 45);
        r1.append("Failed to start service while in background: ");
        r1.append(r3);
        android.util.Log.e("FirebaseInstanceId", r1.toString());
        r6 = 402;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x022f, code lost:
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0230, code lost:
        android.util.Log.e("FirebaseInstanceId", "Error while delivering the message to the serviceIntent", r1);
        r6 = 401;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x023e, code lost:
        if (r4.equals(r5) == false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006e, code lost:
        if (r13.getApplicationInfo().targetSdkVersion < 26) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c0, code lost:
        if (r4.equals("com.google.firebase.MESSAGING_EVENT") == false) goto L127;
     */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01f8 A[Catch: IllegalStateException -> 0x020c, SecurityException -> 0x022f, TryCatch #5 {IllegalStateException -> 0x020c, SecurityException -> 0x022f, blocks: (B:97:0x01a3, B:99:0x01a9, B:100:0x01ab, B:116:0x0203, B:113:0x01f7, B:114:0x01f8), top: B:139:0x01a3 }] */
    /* JADX WARN: Removed duplicated region for block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01a9 A[Catch: IllegalStateException -> 0x020c, SecurityException -> 0x022f, TryCatch #5 {IllegalStateException -> 0x020c, SecurityException -> 0x022f, blocks: (B:97:0x01a3, B:99:0x01a9, B:100:0x01ab, B:116:0x0203, B:113:0x01f7, B:114:0x01f8), top: B:139:0x01a3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A01(android.content.Context r13, android.content.Intent r14, java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 601
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.FirebaseInstanceIdReceiver.A01(android.content.Context, android.content.Intent, java.lang.String):void");
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Intent intent2;
        if (intent == null) {
            return;
        }
        Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
        if ((parcelableExtra instanceof Intent) && (intent2 = (Intent) parcelableExtra) != null) {
            A01(context, intent2, intent.getAction());
        } else {
            A01(context, intent, intent.getAction());
        }
    }
}
