package com.whatsapp.push;

import X.AbstractC000600i;
import X.AbstractServiceC05030Na;
import X.AnonymousClass288;
import X.C000500h;
import X.C003701t;
import X.C01B;
import X.C01Y;
import X.C02E;
import X.C0CB;
import X.C0EG;
import X.C70753Tm;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.whatsapp.util.Log;

/* loaded from: classes2.dex */
public class RegistrationIntentService extends AnonymousClass288 {
    public AbstractC000600i A00;
    public C01B A01;
    public C02E A02;
    public C000500h A03;
    public C003701t A04;
    public C0EG A05;
    public C01Y A06;
    public C70753Tm A07 = new Object() { // from class: X.3Tm
    };
    public C0CB A08;

    public static void A01(Context context) {
        Log.i("GCM: refreshing gcm token");
        AbstractServiceC05030Na.A00(context, RegistrationIntentService.class, 4, new Intent("com.whatsapp.action.REFRESH", null, context, RegistrationIntentService.class));
    }

    public static void A02(Context context, String str, String str2) {
        StringBuilder sb = new StringBuilder("GCM: verifying registration; serverRegistrationId=");
        sb.append(str);
        Log.i(sb.toString());
        Intent intent = new Intent("com.whatsapp.action.VERIFY", null, context, RegistrationIntentService.class);
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra("registrationId", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            intent.putExtra("mutedChatsHash", str2);
        }
        AbstractServiceC05030Na.A00(context, RegistrationIntentService.class, 4, intent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:218:0x007c, code lost:
        if (android.text.TextUtils.isEmpty(r13) == false) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x0080, code lost:
        if (r23 != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x0082, code lost:
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0087, code lost:
        if (android.text.TextUtils.equals(r13, r10) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x0089, code lost:
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x008a, code lost:
        r20 = android.text.TextUtils.isEmpty(r10);
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x008f, code lost:
        if (210915004 == r2) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x0091, code lost:
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x0092, code lost:
        if (r21 != false) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x0094, code lost:
        if (r20 != false) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x0096, code lost:
        if (r1 != false) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x0098, code lost:
        r19 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x009a, code lost:
        if (r0 == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x009c, code lost:
        r19 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x00a0, code lost:
        if (r19 == false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x00a2, code lost:
        if (r21 == false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x00a4, code lost:
        if (r20 != false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x00ae, code lost:
        if (r24.A03.A00.getBoolean("saved_gcm_token_server_unreg", false) == false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x00b8, code lost:
        if (r24.A01.A0E(X.C01C.A0f) == false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x00ba, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("GCM: verifying tokenUnregisteredOnServer deleting savedToken:");
        r1.append(r10);
        com.whatsapp.util.Log.i(r1.toString());
        r4 = r24.A06.A00;
        r3 = com.google.firebase.iid.FirebaseInstanceId.getInstance(X.C08U.A00());
        r2 = "FCM";
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x00dc, code lost:
        if (r3 == null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x00e6, code lost:
        if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x00ec, code lost:
        if ("FCM".isEmpty() != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x00f4, code lost:
        if ("FCM".equalsIgnoreCase("fcm") != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x00fc, code lost:
        if ("FCM".equalsIgnoreCase("gcm") == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x00fe, code lost:
        r2 = "*";
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x0100, code lost:
        r18 = com.google.firebase.iid.FirebaseInstanceId.A01();
        com.google.firebase.iid.FirebaseInstanceId.A00(r4, r2);
        r1 = r3.A00;
        r3.A04(X.C0Bc.A00(r1.A01(r1.A02(r18, r4, r2, X.C000200d.A02("delete", "1")))));
        r1 = com.google.firebase.iid.FirebaseInstanceId.A08;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x0124, code lost:
        monitor-enter(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x0125, code lost:
        r2 = X.C02400Ba.A01(r4, r2);
        r0 = r1.A01.edit();
        r0.remove(r2);
        r0.commit();
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x0140, code lost:
        throw new java.io.IOException("MAIN_THREAD");
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x0142, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x0143, code lost:
        monitor-exit(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x0144, code lost:
        r24.A03.A0D().putBoolean("saved_gcm_token_server_unreg", false).apply();
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x0151, code lost:
        r1 = r24.A07;
        r2 = r24.A06.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x0157, code lost:
        if (r1 == null) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x0159, code lost:
        r3 = com.google.firebase.iid.FirebaseInstanceId.getInstance(X.C08U.A00()).A05(r2, "FCM");
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x016b, code lost:
        if (android.text.TextUtils.isEmpty(r3) != false) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x016d, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("GCM: token retrieved successfully; token=");
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x0177, code lost:
        if (r3 == null) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x017a, code lost:
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x017c, code lost:
        r0 = r3.length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x0180, code lost:
        r1.append(r0);
        r1.append(" bytes; applicationVersion=");
        r1.append(210915004);
        com.whatsapp.util.Log.i(r1.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x0192, code lost:
        if (r20 == false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x0194, code lost:
        com.whatsapp.util.Log.i("GCM: no previously saved token");
        X.C000200d.A0g(r24.A03, "logins_with_messages", 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x01a0, code lost:
        r10 = !android.text.TextUtils.equals(r3, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x01a6, code lost:
        if (r19 != false) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x01a8, code lost:
        if (r10 != false) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x01b2, code lost:
        if (r24.A04.A0C(283) == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x01b4, code lost:
        if (r23 == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x01b6, code lost:
        r6 = r25.getStringExtra("mutedChatsHash");
        r4 = r24.A08.A0D();
        r5 = !android.text.TextUtils.isEmpty(r6);
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x01cd, code lost:
        if (r4.size() <= 0) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x01cf, code lost:
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x01d0, code lost:
        if (r5 != false) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x01d2, code lost:
        if (r0 == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x01d5, code lost:
        if (r0 == false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x01d7, code lost:
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x01da, code lost:
        if (r24.A08 == null) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x01dc, code lost:
        r13 = java.security.MessageDigest.getInstance("SHA-256");
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x01e2, code lost:
        r12 = java.nio.charset.Charset.forName("UTF-8");
        r18 = r4.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x01f0, code lost:
        if (r18.hasNext() == false) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x01f2, code lost:
        r11 = (X.C03470Fv) r18.next();
        r13.update(r11.A01.getRawString().getBytes(r12));
        r0 = r11.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x0207, code lost:
        if (r0 != null) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x0209, code lost:
        r0 = r11.A02.longValue();
        r14 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x0213, code lost:
        if (r0 == (-1)) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x0215, code lost:
        r14 = java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x021b, code lost:
        r0 = java.lang.Long.valueOf(r14);
        r11.A00 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x0221, code lost:
        r13.update(r0.toString().getBytes(r12));
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x022d, code lost:
        r1 = new byte[6];
        java.lang.System.arraycopy(r13.digest(), 0, r1, 0, 6);
        r1 = android.util.Base64.encodeToString(r1, 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x0247, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x024d, code lost:
        if ((!r1.equalsIgnoreCase(r6)) != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x024f, code lost:
        com.whatsapp.util.Log.i("GCM: sending client config with new muted chats");
        r24.A05.A0Q(r3, "gcm", r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x025d, code lost:
        r24.A03.A00.edit().putString("c2dm_reg_id", r3).putInt("c2dm_app_vers", 210915004).apply();
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x0270, code lost:
        if (r22 != false) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x0276, code lost:
        if (android.text.TextUtils.equals(r3, r13) != false) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x0278, code lost:
        com.whatsapp.util.Log.i("GCM: sending client config with new token");
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x0287, code lost:
        if (r24.A04.A0C(283) == false) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x0289, code lost:
        r24.A05.A0Q(r3, "gcm", r24.A08.A0D());
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x0295, code lost:
        r24.A05.A0Q(r3, "gcm", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x029b, code lost:
        if (r19 == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x029d, code lost:
        if (r21 == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x029f, code lost:
        if (r10 != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x02a9, code lost:
        if (r24.A03.A00.getBoolean("saved_gcm_token_server_unreg", false) != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x02ab, code lost:
        com.whatsapp.util.Log.i("GCM: verifying tokenUnregisteredOnServer fetched saved token");
        r24.A00.A09("gcm-retrieved-saved-token", null, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x02be, code lost:
        r24.A03.A0D().putBoolean("saved_gcm_token_server_unreg", true).apply();
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x02c7, code lost:
        r2 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x02d0, code lost:
        throw new java.lang.AssertionError("GCM: empty token returned but no exception thrown");
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x02d2, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x02d3, code lost:
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x02d8, code lost:
        if (r2.getMessage() == null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x02f2, code lost:
        com.whatsapp.util.Log.e("GCM: security exception caught; switching to long-connect", r2);
        r24.A03.A0L();
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x02fe, code lost:
        throw r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x02ff, code lost:
        r2 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:343:0x0304, code lost:
        if (r2.getMessage() == null) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x0306, code lost:
        r1 = r2.getMessage();
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x030f, code lost:
        switch(r1.hashCode()) {
            case -1992442893: goto L81;
            case -1800638118: goto L88;
            case -1579216525: goto L92;
            case -1515255836: goto L96;
            case -829011630: goto L99;
            case -630263762: goto L102;
            case -595928767: goto L105;
            case 370784008: goto L108;
            case 855732677: goto L110;
            case 901541140: goto L112;
            case 1750400351: goto L114;
            default: goto L79;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x0317, code lost:
        throw new java.lang.AssertionError(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x031e, code lost:
        if (r1.equals("SERVICE_NOT_AVAILABLE") != false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x0327, code lost:
        if (r1.equals("QUOTA_EXCEEDED") != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x0330, code lost:
        if (r1.equals("PHONE_REGISTRATION_ERROR") != false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x033a, code lost:
        if (r1.equals("AUTHENTICATION_FAILED") != false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x0343, code lost:
        if (r1.equals("INVALID_PARAMETERS") != false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x034c, code lost:
        if (r1.equals("INTERNAL_SERVER_ERROR") != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x0355, code lost:
        if (r1.equals("TIMEOUT") != false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x035e, code lost:
        if (r1.equals("BACKOFF") != false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x0360, code lost:
        r4 = java.lang.Math.min(r25.getLongExtra("delay_ms", 15000), 86400000L);
        r25.putExtra("delay_ms", 2 * r4);
        r3 = r24.A02.A02();
        r2 = android.app.PendingIntent.getService(r24, 0, r25, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x037e, code lost:
        if (r3 == null) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x0380, code lost:
        r3.cancel(r2);
        r3.set(3, android.os.SystemClock.elapsedRealtime() + r4, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x0392, code lost:
        if (r1.equals("TOO_MANY_REGISTRATIONS") != false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:376:0x0394, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("GCM: attempted to register for GCM but registration count was exceeded already; exceptionMessage=");
        r1.append(r2.getMessage());
        com.whatsapp.util.Log.e(r1.toString());
        r24.A03.A0L();
     */
    /* JADX WARN: Code restructure failed: missing block: B:378:0x03b8, code lost:
        if (r1.equals("ACCOUNT_MISSING") != false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x03ba, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("GCM: attempted to register for GCM but received undocumented error; exceptionMessage=");
        r1.append(r2.getMessage());
        r1.append("; playServicesAvailable=");
        r1.append(X.AnonymousClass029.A02(r24));
        com.whatsapp.util.Log.e(r1.toString());
        r24.A03.A0L();
     */
    /* JADX WARN: Code restructure failed: missing block: B:381:0x03ea, code lost:
        if (r1.equals("MISSING_INSTANCEID_SERVICE") != false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:382:0x03ec, code lost:
        com.whatsapp.util.Log.e("GCM: attempted to register for GCM but Google Play Services was missing");
        r24.A03.A0L();
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x03f7, code lost:
        com.whatsapp.util.Log.w("RegistrationIntentService/onHandleWork AlarmManager is null");
     */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x03ff, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:387:0x0405, code lost:
        throw new java.lang.AssertionError(r2);
     */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0306 A[Catch: all -> 0x0406, TryCatch #3 {all -> 0x0406, blocks: (B:215:0x0057, B:217:0x0076, B:221:0x0082, B:224:0x008a, B:237:0x00a6, B:239:0x00b0, B:241:0x00ba, B:243:0x00de, B:245:0x00e8, B:247:0x00ee, B:249:0x00f6, B:252:0x0100, B:253:0x0124, B:262:0x0143, B:263:0x0144, B:256:0x0137, B:257:0x0138, B:258:0x0139, B:259:0x0140, B:261:0x0142, B:333:0x02d4, B:335:0x02da, B:337:0x02e6, B:339:0x02f2, B:340:0x02fe, B:342:0x0300, B:344:0x0306, B:345:0x030f, B:346:0x0312, B:347:0x0317, B:348:0x0318, B:371:0x0360, B:373:0x0380, B:383:0x03f7, B:351:0x0321, B:376:0x0394, B:354:0x032a, B:379:0x03ba, B:357:0x0334, B:360:0x033d, B:363:0x0346, B:366:0x034f, B:369:0x0358, B:374:0x038c, B:377:0x03b2, B:380:0x03e4, B:382:0x03ec, B:386:0x0400, B:387:0x0405, B:264:0x0151, B:266:0x0159, B:268:0x016d, B:272:0x017c, B:273:0x0180, B:275:0x0194, B:276:0x01a0, B:279:0x01aa, B:282:0x01b6, B:310:0x024f, B:289:0x01d7, B:291:0x01dc, B:292:0x01e2, B:293:0x01ec, B:295:0x01f2, B:297:0x0209, B:299:0x0215, B:300:0x021b, B:301:0x0221, B:302:0x022d, B:307:0x0247, B:305:0x023f, B:306:0x0246, B:308:0x0248, B:311:0x025d, B:313:0x0272, B:322:0x02a1, B:324:0x02ab, B:325:0x02be, B:315:0x0278, B:317:0x0289, B:318:0x0295, B:328:0x02c9, B:329:0x02d0, B:331:0x02d2), top: B:398:0x0057, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0380 A[Catch: all -> 0x0406, TryCatch #3 {all -> 0x0406, blocks: (B:215:0x0057, B:217:0x0076, B:221:0x0082, B:224:0x008a, B:237:0x00a6, B:239:0x00b0, B:241:0x00ba, B:243:0x00de, B:245:0x00e8, B:247:0x00ee, B:249:0x00f6, B:252:0x0100, B:253:0x0124, B:262:0x0143, B:263:0x0144, B:256:0x0137, B:257:0x0138, B:258:0x0139, B:259:0x0140, B:261:0x0142, B:333:0x02d4, B:335:0x02da, B:337:0x02e6, B:339:0x02f2, B:340:0x02fe, B:342:0x0300, B:344:0x0306, B:345:0x030f, B:346:0x0312, B:347:0x0317, B:348:0x0318, B:371:0x0360, B:373:0x0380, B:383:0x03f7, B:351:0x0321, B:376:0x0394, B:354:0x032a, B:379:0x03ba, B:357:0x0334, B:360:0x033d, B:363:0x0346, B:366:0x034f, B:369:0x0358, B:374:0x038c, B:377:0x03b2, B:380:0x03e4, B:382:0x03ec, B:386:0x0400, B:387:0x0405, B:264:0x0151, B:266:0x0159, B:268:0x016d, B:272:0x017c, B:273:0x0180, B:275:0x0194, B:276:0x01a0, B:279:0x01aa, B:282:0x01b6, B:310:0x024f, B:289:0x01d7, B:291:0x01dc, B:292:0x01e2, B:293:0x01ec, B:295:0x01f2, B:297:0x0209, B:299:0x0215, B:300:0x021b, B:301:0x0221, B:302:0x022d, B:307:0x0247, B:305:0x023f, B:306:0x0246, B:308:0x0248, B:311:0x025d, B:313:0x0272, B:322:0x02a1, B:324:0x02ab, B:325:0x02be, B:315:0x0278, B:317:0x0289, B:318:0x0295, B:328:0x02c9, B:329:0x02d0, B:331:0x02d2), top: B:398:0x0057, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:383:0x03f7 A[Catch: all -> 0x0406, TRY_LEAVE, TryCatch #3 {all -> 0x0406, blocks: (B:215:0x0057, B:217:0x0076, B:221:0x0082, B:224:0x008a, B:237:0x00a6, B:239:0x00b0, B:241:0x00ba, B:243:0x00de, B:245:0x00e8, B:247:0x00ee, B:249:0x00f6, B:252:0x0100, B:253:0x0124, B:262:0x0143, B:263:0x0144, B:256:0x0137, B:257:0x0138, B:258:0x0139, B:259:0x0140, B:261:0x0142, B:333:0x02d4, B:335:0x02da, B:337:0x02e6, B:339:0x02f2, B:340:0x02fe, B:342:0x0300, B:344:0x0306, B:345:0x030f, B:346:0x0312, B:347:0x0317, B:348:0x0318, B:371:0x0360, B:373:0x0380, B:383:0x03f7, B:351:0x0321, B:376:0x0394, B:354:0x032a, B:379:0x03ba, B:357:0x0334, B:360:0x033d, B:363:0x0346, B:366:0x034f, B:369:0x0358, B:374:0x038c, B:377:0x03b2, B:380:0x03e4, B:382:0x03ec, B:386:0x0400, B:387:0x0405, B:264:0x0151, B:266:0x0159, B:268:0x016d, B:272:0x017c, B:273:0x0180, B:275:0x0194, B:276:0x01a0, B:279:0x01aa, B:282:0x01b6, B:310:0x024f, B:289:0x01d7, B:291:0x01dc, B:292:0x01e2, B:293:0x01ec, B:295:0x01f2, B:297:0x0209, B:299:0x0215, B:300:0x021b, B:301:0x0221, B:302:0x022d, B:307:0x0247, B:305:0x023f, B:306:0x0246, B:308:0x0248, B:311:0x025d, B:313:0x0272, B:322:0x02a1, B:324:0x02ab, B:325:0x02be, B:315:0x0278, B:317:0x0289, B:318:0x0295, B:328:0x02c9, B:329:0x02d0, B:331:0x02d2), top: B:398:0x0057, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0400 A[Catch: all -> 0x0406, TRY_ENTER, TryCatch #3 {all -> 0x0406, blocks: (B:215:0x0057, B:217:0x0076, B:221:0x0082, B:224:0x008a, B:237:0x00a6, B:239:0x00b0, B:241:0x00ba, B:243:0x00de, B:245:0x00e8, B:247:0x00ee, B:249:0x00f6, B:252:0x0100, B:253:0x0124, B:262:0x0143, B:263:0x0144, B:256:0x0137, B:257:0x0138, B:258:0x0139, B:259:0x0140, B:261:0x0142, B:333:0x02d4, B:335:0x02da, B:337:0x02e6, B:339:0x02f2, B:340:0x02fe, B:342:0x0300, B:344:0x0306, B:345:0x030f, B:346:0x0312, B:347:0x0317, B:348:0x0318, B:371:0x0360, B:373:0x0380, B:383:0x03f7, B:351:0x0321, B:376:0x0394, B:354:0x032a, B:379:0x03ba, B:357:0x0334, B:360:0x033d, B:363:0x0346, B:366:0x034f, B:369:0x0358, B:374:0x038c, B:377:0x03b2, B:380:0x03e4, B:382:0x03ec, B:386:0x0400, B:387:0x0405, B:264:0x0151, B:266:0x0159, B:268:0x016d, B:272:0x017c, B:273:0x0180, B:275:0x0194, B:276:0x01a0, B:279:0x01aa, B:282:0x01b6, B:310:0x024f, B:289:0x01d7, B:291:0x01dc, B:292:0x01e2, B:293:0x01ec, B:295:0x01f2, B:297:0x0209, B:299:0x0215, B:300:0x021b, B:301:0x0221, B:302:0x022d, B:307:0x0247, B:305:0x023f, B:306:0x0246, B:308:0x0248, B:311:0x025d, B:313:0x0272, B:322:0x02a1, B:324:0x02ab, B:325:0x02be, B:315:0x0278, B:317:0x0289, B:318:0x0295, B:328:0x02c9, B:329:0x02d0, B:331:0x02d2), top: B:398:0x0057, inners: #1 }] */
    @Override // X.AbstractServiceC05030Na
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A05(android.content.Intent r25) {
        /*
            Method dump skipped, instructions count: 1082
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.push.RegistrationIntentService.A05(android.content.Intent):void");
    }
}
