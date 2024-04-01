package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.util.Pair;
import com.google.android.search.verification.client.R;
import java.lang.ref.WeakReference;

/* renamed from: X.2MW  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2MW {
    public static volatile C2MW A06;
    public final C06810Vc A00;
    public final C018708s A01;
    public final C000400f A02;
    public final C2Qm A03;
    public final C40411sD A04;
    public final InterfaceC002901k A05;

    public C2MW(InterfaceC002901k interfaceC002901k, C06810Vc c06810Vc, C018708s c018708s, C2Qm c2Qm, C40411sD c40411sD, C000400f c000400f) {
        this.A05 = interfaceC002901k;
        this.A00 = c06810Vc;
        this.A01 = c018708s;
        this.A03 = c2Qm;
        this.A04 = c40411sD;
        this.A02 = c000400f;
    }

    public DialogInterfaceC019408z A00(final Activity activity, final C0B5 c0b5, final C06C c06c) {
        C019208x c019208x = new C019208x(activity);
        c019208x.A02(R.string.export_conversation_ask_about_media);
        c019208x.A06(R.string.include_media, new DialogInterface.OnClickListener() { // from class: X.2qq
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C2MW c2mw = C2MW.this;
                Activity activity2 = activity;
                C0B5 c0b52 = c0b5;
                C06C c06c2 = c06c;
                C002701i.A18(activity2, 10);
                c2mw.A01(activity2, c0b52, c06c2, true);
            }
        });
        c019208x.A05(R.string.without_media, new DialogInterface.OnClickListener() { // from class: X.2qr
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C2MW c2mw = C2MW.this;
                Activity activity2 = activity;
                C0B5 c0b52 = c0b5;
                C06C c06c2 = c06c;
                C002701i.A18(activity2, 10);
                c2mw.A01(activity2, c0b52, c06c2, false);
            }
        });
        return c019208x.A00();
    }

    public final void A01(final Context context, final C0B5 c0b5, final C06C c06c, final boolean z) {
        c0b5.AUr(R.string.register_xmpp_title, R.string.register_wait_message);
        InterfaceC002901k interfaceC002901k = this.A05;
        final C2Qm c2Qm = this.A03;
        final C018708s c018708s = this.A01;
        final C000400f c000400f = this.A02;
        final C06810Vc c06810Vc = this.A00;
        interfaceC002901k.ARy(new C0HS(context, c2Qm, c018708s, c000400f, c0b5, c06c, c06810Vc, z) { // from class: X.37m
            public final C06810Vc A00;
            public final C018708s A01;
            public final C000400f A02;
            public final C2Qm A03;
            public final C06C A04;
            public final WeakReference A05;
            public final WeakReference A06;
            public final boolean A07;

            {
                this.A05 = new WeakReference(context);
                this.A02 = c000400f;
                this.A06 = new WeakReference(c0b5);
                this.A07 = z;
                this.A03 = c2Qm;
                this.A01 = c018708s;
                this.A04 = c06c;
                this.A00 = c06810Vc;
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Code restructure failed: missing block: B:441:0x08fd, code lost:
                if (r1.contains("No space") == false) goto L87;
             */
            /* JADX WARN: Finally extract failed */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:100:0x01af  */
            /* JADX WARN: Removed duplicated region for block: B:112:0x01ca A[Catch: all -> 0x022d, TryCatch #11 {all -> 0x022d, blocks: (B:20:0x00a4, B:22:0x00b0, B:50:0x00ef, B:52:0x00f5, B:112:0x01ca, B:114:0x01d0, B:115:0x01d6, B:53:0x00ff, B:55:0x0103, B:56:0x0108, B:58:0x0111, B:59:0x0117, B:61:0x0127, B:63:0x0138, B:64:0x013b, B:70:0x014d, B:85:0x0191, B:98:0x01a9, B:95:0x01a2, B:97:0x01a4, B:101:0x01b0, B:67:0x0142, B:69:0x0147, B:105:0x01b9, B:107:0x01bd, B:109:0x01c4), top: B:476:0x00a4, inners: #28 }] */
            /* JADX WARN: Removed duplicated region for block: B:118:0x01ef  */
            /* JADX WARN: Removed duplicated region for block: B:169:0x0270  */
            /* JADX WARN: Removed duplicated region for block: B:174:0x027c  */
            /* JADX WARN: Removed duplicated region for block: B:176:0x0289  */
            /* JADX WARN: Removed duplicated region for block: B:180:0x02f6  */
            /* JADX WARN: Removed duplicated region for block: B:355:0x0730 A[Catch: all -> 0x0844, TryCatch #21 {all -> 0x0844, blocks: (B:196:0x036c, B:198:0x037a, B:200:0x03a4, B:202:0x03aa, B:203:0x03b3, B:381:0x07e0, B:383:0x07e6, B:384:0x07f7, B:385:0x081b, B:234:0x03f5, B:235:0x03f8, B:241:0x0405, B:242:0x040e, B:244:0x0412, B:245:0x041e, B:247:0x0422, B:353:0x0720, B:355:0x0730, B:357:0x073a, B:358:0x073d, B:360:0x0748, B:362:0x074c, B:367:0x0773, B:369:0x0779, B:391:0x0841, B:370:0x07a8, B:372:0x07b0, B:387:0x0833, B:374:0x07c6, B:376:0x07cc, B:378:0x07d8, B:379:0x07dd, B:386:0x082e, B:248:0x0430, B:250:0x0434, B:251:0x0440, B:253:0x0446, B:254:0x044f, B:255:0x045f, B:257:0x0474, B:258:0x047c, B:261:0x0488, B:262:0x0495, B:263:0x04a5, B:264:0x04b5, B:269:0x04c4, B:274:0x04e8, B:275:0x04f5, B:277:0x0504, B:278:0x050b, B:280:0x0515, B:281:0x051f, B:283:0x0529, B:285:0x0535, B:286:0x053e, B:288:0x0544, B:289:0x0558, B:291:0x055e, B:292:0x0579, B:294:0x058d, B:295:0x0593, B:297:0x059b, B:298:0x05a5, B:300:0x05b0, B:301:0x05b7, B:302:0x05c2, B:303:0x05c5, B:305:0x05d4, B:307:0x05dd, B:309:0x05e1, B:310:0x0603, B:312:0x060d, B:313:0x0617, B:315:0x0621, B:316:0x062d, B:318:0x0638, B:320:0x0640, B:321:0x064b, B:323:0x0654, B:324:0x065e, B:326:0x0662, B:327:0x0667, B:328:0x069c, B:330:0x06a0, B:331:0x06a5, B:338:0x06c7, B:337:0x06bb, B:332:0x06ab, B:334:0x06b0, B:339:0x06e1, B:341:0x06e6, B:343:0x06ec, B:345:0x06f0, B:347:0x06f4, B:348:0x070e, B:350:0x0714, B:352:0x071a, B:392:0x0842, B:393:0x0843, B:363:0x0750, B:364:0x0761, B:388:0x083a), top: B:492:0x036c, inners: #16 }] */
            /* JADX WARN: Removed duplicated region for block: B:440:0x08f6  */
            /* JADX WARN: Removed duplicated region for block: B:444:0x0902  */
            /* JADX WARN: Removed duplicated region for block: B:446:0x090b  */
            /* JADX WARN: Removed duplicated region for block: B:474:0x0322 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:483:0x07b0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:495:0x0248 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:531:0x0243 A[ADDED_TO_REGION, EDGE_INSN: B:531:0x0243->B:149:0x0243 ?: BREAK  , SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:534:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Type inference failed for: r2v16, types: [boolean, int] */
            /* JADX WARN: Type inference failed for: r2v28 */
            /* JADX WARN: Type inference failed for: r2v4 */
            @Override // X.C0HS
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public java.lang.Object A07(java.lang.Object[] r38) {
                /*
                    Method dump skipped, instructions count: 2462
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C655137m.A07(java.lang.Object[]):java.lang.Object");
            }

            @Override // X.C0HS
            public void A09(Object obj) {
                String obj2;
                Pair pair = (Pair) obj;
                if (pair != null) {
                    Intent intent = (Intent) pair.first;
                    int intValue = ((Number) pair.second).intValue();
                    if (intValue == 0) {
                        C0B5 c0b52 = (C0B5) this.A06.get();
                        Context context2 = (Context) this.A05.get();
                        if (intent != null && c0b52 != null && context2 != null) {
                            c0b52.ARS();
                            this.A00.A01(intent, context2, c0b52, context2.getString(R.string.send_conversation_via), false);
                            return;
                        }
                        boolean z2 = this.A07;
                        int i = R.string.export_conversation_failed;
                        if (z2) {
                            i = R.string.export_conversation_with_media_failed;
                        }
                        A0A(i);
                    } else if (intValue != 1) {
                        if (intValue != 3) {
                            if (intValue != 4) {
                                A0A(R.string.export_conversation_failed);
                                return;
                            } else {
                                A0A(R.string.export_conversation_failed_messages_are_uploading);
                                return;
                            }
                        }
                        boolean z3 = this.A07;
                        int i2 = R.string.export_conversation_failed;
                        if (z3) {
                            i2 = R.string.export_conversation_with_media_failed;
                        }
                        A0A(i2);
                    } else {
                        C0B5 c0b53 = (C0B5) this.A06.get();
                        if (c0b53 == null) {
                            return;
                        }
                        Context context3 = (Context) this.A05.get();
                        c0b53.ARS();
                        if (context3 == null) {
                            return;
                        }
                        if (C000400f.A01()) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(context3.getString(R.string.export_conversation_failed_out_of_space));
                            sb.append(" ");
                            sb.append(context3.getString(R.string.remove_files_from_sd_card));
                            obj2 = sb.toString();
                        } else {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(context3.getString(R.string.export_conversation_failed_out_of_space_shared_storage));
                            sb2.append(" ");
                            sb2.append(context3.getString(R.string.remove_files_from_shared_storage));
                            obj2 = sb2.toString();
                        }
                        c0b53.AUm(obj2);
                    }
                }
            }

            public final void A0A(int i) {
                C0B5 c0b52 = (C0B5) this.A06.get();
                if (c0b52 == null) {
                    return;
                }
                c0b52.ARS();
                c0b52.AUj(i);
            }
        }, new Void[0]);
    }
}
