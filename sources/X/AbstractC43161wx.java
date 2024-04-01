package X;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.PowerManager;
import com.whatsapp.Mp4Ops;
import com.whatsapp.util.Log;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: X.1wx */
/* loaded from: classes2.dex */
public abstract class AbstractC43161wx {
    public final C00J A00;
    public final Map A01 = new HashMap();

    public AbstractC43161wx(C00J c00j) {
        this.A00 = c00j;
    }

    public synchronized Runnable A00(Object obj) {
        return A01(obj, null);
    }

    public synchronized Runnable A01(Object obj, Object obj2) {
        RunnableC43241x5 runnableC43241x5;
        Runnable runnable;
        PowerManager.WakeLock wakeLock;
        Map map = this.A01;
        runnableC43241x5 = (RunnableC43241x5) map.get(obj);
        if (runnableC43241x5 == null) {
            if (this instanceof C23K) {
                runnable = new C0CH((AnonymousClass092) obj, (C23K) this) { // from class: X.23W
                    public final AnonymousClass092 A00;
                    public final C23K A01;

                    {
                        this.A00 = r1;
                        this.A01 = r2;
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:95:0x008f, code lost:
                        r8 = r13;
                     */
                    @Override // X.C0CH
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public java.lang.Object A04() {
                        /*
                            r14 = this;
                            X.23K r11 = r14.A01
                            X.092 r9 = r14.A00
                            X.1t8 r0 = r11.A05
                            java.util.List r10 = X.C02180Ae.A0q(r0, r9)
                            r8 = 0
                            if (r10 != 0) goto L22
                            java.lang.String r0 = "Couldn't load vcard for message "
                            java.lang.StringBuilder r1 = X.C000200d.A0P(r0)
                            X.094 r0 = r9.A0n
                            r1.append(r0)
                            java.lang.String r1 = r1.toString()
                            X.1xB r0 = new X.1xB
                            r0.<init>(r1)
                            throw r0
                        L22:
                            r7 = 3
                            java.util.ArrayList r6 = new java.util.ArrayList
                            r6.<init>(r7)
                            r13 = r8
                            r5 = 0
                            r4 = 0
                        L2b:
                            int r0 = r10.size()
                            if (r5 >= r0) goto L8d
                            r0 = 100
                            if (r5 >= r0) goto L8d
                            if (r4 >= r7) goto L8d
                            X.00o r12 = r11.A03
                            X.05W r3 = r11.A01
                            X.01c r2 = r11.A04
                            X.06K r1 = r11.A00
                            java.lang.Object r0 = r10.get(r5)
                            java.lang.String r0 = (java.lang.String) r0
                            X.0Ip r2 = X.C04110Ip.A05(r12, r3, r2, r1, r0)
                            if (r2 == 0) goto L60
                            if (r8 != 0) goto L4e
                            r8 = r2
                        L4e:
                            byte[] r0 = r2.A09
                            if (r0 == 0) goto L63
                            int r0 = r0.length
                            if (r0 <= 0) goto L63
                            r2.A08()
                        L58:
                            r6.add(r2)
                            if (r13 != 0) goto L5e
                            r13 = r2
                        L5e:
                            int r4 = r4 + 1
                        L60:
                            int r5 = r5 + 1
                            goto L2b
                        L63:
                            java.util.List r0 = r2.A05
                            if (r0 == 0) goto L60
                            java.util.Iterator r12 = r0.iterator()
                        L6b:
                            boolean r0 = r12.hasNext()
                            if (r0 == 0) goto L60
                            java.lang.Object r0 = r12.next()
                            X.0cT r0 = (X.C09010cT) r0
                            com.whatsapp.jid.UserJid r0 = r0.A01
                            if (r0 == 0) goto L6b
                            X.06C r1 = r3.A09(r0)
                            if (r1 == 0) goto L6b
                            X.05r r0 = r11.A02
                            boolean r0 = r0.A08(r1)
                            if (r0 == 0) goto L6b
                            r2.A08()
                            goto L58
                        L8d:
                            if (r13 == 0) goto L90
                            r8 = r13
                        L90:
                            int r1 = r10.size()
                            X.3aX r0 = new X.3aX
                            r0.<init>(r9, r8, r1, r6)
                            return r0
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C23W.A04():java.lang.Object");
                    }
                };
            } else if (this instanceof C455422m) {
                C455422m c455422m = (C455422m) this;
                C04150It c04150It = (C04150It) obj2;
                if (c04150It != null) {
                    int A01 = c04150It.A01();
                    if (A01 == 1) {
                        runnable = c455422m.A00.A06(c04150It);
                    } else if (A01 != 2) {
                        runnable = c455422m.A00.A06(c04150It);
                    } else {
                        C41491u0 c41491u0 = c455422m.A00;
                        runnable = new C23V(c41491u0.A08, c41491u0.A03, c41491u0.A01, c41491u0.A0Q, c41491u0.A02, c41491u0.A0G, c41491u0.A07, c41491u0.A06, c41491u0.A0P, c41491u0.A0F, c41491u0.A0I, c41491u0.A0L, c41491u0.A0A, c41491u0.A0M, c41491u0.A0B, c41491u0.A0H, c41491u0.A0E, c41491u0.A0N, c41491u0.A0K, (C43651xk) c04150It);
                    }
                } else {
                    throw null;
                }
            } else if (this instanceof AnonymousClass233) {
                AnonymousClass233 anonymousClass233 = (AnonymousClass233) this;
                C23B c23b = (C23B) obj2;
                if (c23b != null) {
                    C456022s c456022s = anonymousClass233.A00;
                    synchronized (c456022s) {
                        if (c456022s.A00 == null) {
                            PowerManager A0D = c456022s.A07.A0D();
                            if (A0D == null) {
                                Log.w("media-transcode-queue/get-transcode-wakelock pm=null");
                            } else {
                                c456022s.A00 = C02180Ae.A0R(A0D, 1, "mediatranscode");
                            }
                        }
                        wakeLock = c456022s.A00;
                    }
                    if (c23b instanceof C23M) {
                        runnable = new C23N(c456022s.A08, c456022s.A03, c456022s.A0B, c456022s.A01, c456022s.A02, c456022s.A05, c456022s.A0D, c456022s.A0L, c456022s.A06, c456022s.A0K, c456022s.A09, c456022s.A0E, (C23M) c23b, wakeLock);
                    } else if (c23b instanceof C23P) {
                        runnable = new C23O(c456022s.A08, c456022s.A03, c456022s.A0B, c456022s.A01, c456022s.A02, c456022s.A0C, c456022s.A05, c456022s.A0J, c456022s.A0D, c456022s.A0L, c456022s.A0A, c456022s.A06, c456022s.A0K, c456022s.A09, c456022s.A0I, c456022s.A0E, c456022s.A0G, wakeLock, (C23P) c23b) { // from class: X.23Q
                            public static final C2z9 A0J = new C2z9(30, 72);
                            public static final C2z9 A0K = new C2z9(48, 96);
                            public final PowerManager.WakeLock A00;
                            public final AbstractC000600i A01;
                            public final C012005w A02;
                            public final Mp4Ops A03;
                            public final C01B A04;
                            public final C000400f A05;
                            public final C001200o A06;
                            public final C000500h A07;
                            public final C40411sD A08;
                            public final C003701t A09;
                            public final AnonymousClass011 A0A;
                            public final C23P A0B;
                            public final C43091wq A0C;
                            public final C456122t A0D;
                            public final C0GT A0E;
                            public final C02C A0F;
                            public final C41961un A0G;
                            public final C42591vz A0H;
                            public final C0KV A0I;

                            {
                                super(r21);
                                this.A06 = r3;
                                this.A03 = r4;
                                this.A09 = r5;
                                this.A01 = r6;
                                this.A02 = r7;
                                this.A0A = r8;
                                this.A04 = r9;
                                this.A0G = r10;
                                this.A0C = r11;
                                this.A0I = r12;
                                this.A08 = r13;
                                this.A05 = r14;
                                this.A0H = r15;
                                this.A07 = r16;
                                this.A0F = r17;
                                this.A0D = r18;
                                this.A0E = r19;
                                this.A00 = wakeLock;
                                this.A0B = r21;
                            }

                            /* JADX WARN: Code restructure failed: missing block: B:943:0x061b, code lost:
                                if (r1.isHeld() != false) goto L74;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:958:0x0696, code lost:
                                if (r1.isHeld() != false) goto L74;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:966:0x06be, code lost:
                                if (r1.isHeld() != false) goto L74;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:974:0x06f9, code lost:
                                if (r1.isHeld() != false) goto L74;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:982:0x0733, code lost:
                                if (r1.isHeld() != false) goto L74;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:987:0x0741, code lost:
                                if (r1.isHeld() != false) goto L74;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:988:0x0743, code lost:
                                r1.release();
                             */
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Removed duplicated region for block: B:1024:0x07ec  */
                            /* JADX WARN: Removed duplicated region for block: B:727:0x0304 A[Catch: all -> 0x03c0, 0In -> 0x03c5, IOException -> 0x03cc, FileNotFoundException -> 0x03d3, 3sU -> 0x03da, IllegalArgumentException -> 0x03e1, IllegalStateException -> 0x03e8, TRY_ENTER, TRY_LEAVE, TryCatch #54 {0In -> 0x03c5, blocks: (B:727:0x0304, B:750:0x0385, B:752:0x038c, B:743:0x0378, B:639:0x021f, B:642:0x022b, B:645:0x023d, B:646:0x0241, B:648:0x0247, B:650:0x0251, B:674:0x0283), top: B:1044:0x021f }] */
                            /* JADX WARN: Removed duplicated region for block: B:744:0x0379  */
                            /* JADX WARN: Removed duplicated region for block: B:942:0x0617  */
                            /* JADX WARN: Removed duplicated region for block: B:949:0x0649 A[Catch: all -> 0x07e0, TryCatch #91 {all -> 0x07e0, blocks: (B:896:0x057d, B:898:0x0583, B:900:0x0587, B:901:0x058c, B:904:0x0597, B:905:0x059e, B:906:0x059f, B:939:0x05e6, B:947:0x0624, B:949:0x0649, B:951:0x0655, B:954:0x0664, B:962:0x069f, B:970:0x06c7, B:978:0x0701, B:892:0x0545, B:893:0x0550, B:895:0x056c, B:919:0x05b5, B:920:0x05ba, B:921:0x05bb, B:922:0x05cb), top: B:1046:0x00e0 }] */
                            /* JADX WARN: Removed duplicated region for block: B:957:0x0692  */
                            /* JADX WARN: Removed duplicated region for block: B:965:0x06ba  */
                            /* JADX WARN: Removed duplicated region for block: B:973:0x06f5  */
                            /* JADX WARN: Removed duplicated region for block: B:981:0x072f  */
                            /* JADX WARN: Removed duplicated region for block: B:986:0x073d  */
                            /* JADX WARN: Type inference failed for: r16v0 */
                            /* JADX WARN: Type inference failed for: r16v1 */
                            /* JADX WARN: Type inference failed for: r16v10, types: [java.lang.String] */
                            /* JADX WARN: Type inference failed for: r16v100 */
                            /* JADX WARN: Type inference failed for: r16v101 */
                            /* JADX WARN: Type inference failed for: r16v102 */
                            /* JADX WARN: Type inference failed for: r16v103 */
                            /* JADX WARN: Type inference failed for: r16v105 */
                            /* JADX WARN: Type inference failed for: r16v106 */
                            /* JADX WARN: Type inference failed for: r16v107 */
                            /* JADX WARN: Type inference failed for: r16v108 */
                            /* JADX WARN: Type inference failed for: r16v11, types: [java.lang.String] */
                            /* JADX WARN: Type inference failed for: r16v12, types: [java.lang.String] */
                            /* JADX WARN: Type inference failed for: r16v13, types: [java.lang.String] */
                            /* JADX WARN: Type inference failed for: r16v15 */
                            /* JADX WARN: Type inference failed for: r16v16 */
                            /* JADX WARN: Type inference failed for: r16v17 */
                            /* JADX WARN: Type inference failed for: r16v18 */
                            /* JADX WARN: Type inference failed for: r16v19 */
                            /* JADX WARN: Type inference failed for: r16v2 */
                            /* JADX WARN: Type inference failed for: r16v20 */
                            /* JADX WARN: Type inference failed for: r16v21 */
                            /* JADX WARN: Type inference failed for: r16v23 */
                            /* JADX WARN: Type inference failed for: r16v24 */
                            /* JADX WARN: Type inference failed for: r16v25 */
                            /* JADX WARN: Type inference failed for: r16v26 */
                            /* JADX WARN: Type inference failed for: r16v27 */
                            /* JADX WARN: Type inference failed for: r16v28 */
                            /* JADX WARN: Type inference failed for: r16v29 */
                            /* JADX WARN: Type inference failed for: r16v3 */
                            /* JADX WARN: Type inference failed for: r16v30, types: [java.io.File] */
                            /* JADX WARN: Type inference failed for: r16v32 */
                            /* JADX WARN: Type inference failed for: r16v33 */
                            /* JADX WARN: Type inference failed for: r16v34 */
                            /* JADX WARN: Type inference failed for: r16v35 */
                            /* JADX WARN: Type inference failed for: r16v36 */
                            /* JADX WARN: Type inference failed for: r16v37 */
                            /* JADX WARN: Type inference failed for: r16v38 */
                            /* JADX WARN: Type inference failed for: r16v39 */
                            /* JADX WARN: Type inference failed for: r16v4 */
                            /* JADX WARN: Type inference failed for: r16v40 */
                            /* JADX WARN: Type inference failed for: r16v41 */
                            /* JADX WARN: Type inference failed for: r16v42 */
                            /* JADX WARN: Type inference failed for: r16v43 */
                            /* JADX WARN: Type inference failed for: r16v44 */
                            /* JADX WARN: Type inference failed for: r16v45 */
                            /* JADX WARN: Type inference failed for: r16v46 */
                            /* JADX WARN: Type inference failed for: r16v47 */
                            /* JADX WARN: Type inference failed for: r16v48 */
                            /* JADX WARN: Type inference failed for: r16v49 */
                            /* JADX WARN: Type inference failed for: r16v5 */
                            /* JADX WARN: Type inference failed for: r16v50 */
                            /* JADX WARN: Type inference failed for: r16v52 */
                            /* JADX WARN: Type inference failed for: r16v53 */
                            /* JADX WARN: Type inference failed for: r16v54 */
                            /* JADX WARN: Type inference failed for: r16v55 */
                            /* JADX WARN: Type inference failed for: r16v56 */
                            /* JADX WARN: Type inference failed for: r16v57 */
                            /* JADX WARN: Type inference failed for: r16v58 */
                            /* JADX WARN: Type inference failed for: r16v59 */
                            /* JADX WARN: Type inference failed for: r16v6 */
                            /* JADX WARN: Type inference failed for: r16v62 */
                            /* JADX WARN: Type inference failed for: r16v63 */
                            /* JADX WARN: Type inference failed for: r16v64 */
                            /* JADX WARN: Type inference failed for: r16v65 */
                            /* JADX WARN: Type inference failed for: r16v66 */
                            /* JADX WARN: Type inference failed for: r16v67 */
                            /* JADX WARN: Type inference failed for: r16v68 */
                            /* JADX WARN: Type inference failed for: r16v69 */
                            /* JADX WARN: Type inference failed for: r16v7, types: [java.lang.String] */
                            /* JADX WARN: Type inference failed for: r16v72 */
                            /* JADX WARN: Type inference failed for: r16v73 */
                            /* JADX WARN: Type inference failed for: r16v74 */
                            /* JADX WARN: Type inference failed for: r16v76 */
                            /* JADX WARN: Type inference failed for: r16v79 */
                            /* JADX WARN: Type inference failed for: r16v8, types: [java.lang.String] */
                            /* JADX WARN: Type inference failed for: r16v80, types: [java.lang.String] */
                            /* JADX WARN: Type inference failed for: r16v81 */
                            /* JADX WARN: Type inference failed for: r16v82 */
                            /* JADX WARN: Type inference failed for: r16v83 */
                            /* JADX WARN: Type inference failed for: r16v84 */
                            /* JADX WARN: Type inference failed for: r16v85 */
                            /* JADX WARN: Type inference failed for: r16v86 */
                            /* JADX WARN: Type inference failed for: r16v87 */
                            /* JADX WARN: Type inference failed for: r16v88 */
                            /* JADX WARN: Type inference failed for: r16v9, types: [java.lang.String] */
                            /* JADX WARN: Type inference failed for: r16v90 */
                            /* JADX WARN: Type inference failed for: r16v91 */
                            /* JADX WARN: Type inference failed for: r16v92 */
                            /* JADX WARN: Type inference failed for: r16v93 */
                            /* JADX WARN: Type inference failed for: r16v94 */
                            /* JADX WARN: Type inference failed for: r16v95 */
                            /* JADX WARN: Type inference failed for: r16v96 */
                            /* JADX WARN: Type inference failed for: r16v97 */
                            /* JADX WARN: Type inference failed for: r16v98 */
                            /* JADX WARN: Type inference failed for: r16v99 */
                            /* JADX WARN: Type inference failed for: r43v0, types: [X.23Q] */
                            @Override // X.C23O
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct code enable 'Show inconsistent code' option in preferences
                            */
                            public X.AnonymousClass235 A02() {
                                /*
                                    Method dump skipped, instructions count: 2043
                                    To view this dump change 'Code comments level' option to 'DEBUG'
                                */
                                throw new UnsupportedOperationException("Method not decompiled: X.C23Q.A02():X.235");
                            }

                            /* JADX WARN: Not initialized variable reg: 11, insn: 0x00e2: INVOKE  (r11 I:java.io.File) type: STATIC call: X.024.A0f(java.io.File):boolean, block:B:85:0x00dd */
                            public final C3G5 A03(AnonymousClass097 anonymousClass097, C3G4 c3g4, File file) {
                                C09H c09h;
                                File file2;
                                File A0f;
                                byte[] bArr;
                                C2z9 c2z9;
                                C2z9 c2z92;
                                if (anonymousClass097 != null && anonymousClass097.A06 != null && (c09h = anonymousClass097.A02) != null && (file2 = c09h.A0F) != null && file2.exists()) {
                                    try {
                                        AnonymousClass024.A0P(this.A0F, anonymousClass097.A02.A0F, file);
                                        if (!anonymousClass097.A06.equals(C40841sx.A0I(file))) {
                                            AnonymousClass024.A0f(file);
                                            return null;
                                        }
                                        C23P c23p = this.A0B;
                                        boolean z = c23p.A04;
                                        if (z == C003101m.A0Z(anonymousClass097.A0n.A00)) {
                                            C0GT c0gt = this.A0E;
                                            C03900Hp A0E = anonymousClass097.A0E();
                                            if (A0E != null) {
                                                c0gt.A02(A0E);
                                                bArr = anonymousClass097.A0E().A08();
                                            } else {
                                                throw null;
                                            }
                                        } else {
                                            bArr = null;
                                        }
                                        if (bArr == null) {
                                            if (!z) {
                                                c2z9 = A0J;
                                            } else {
                                                c2z9 = A0K;
                                            }
                                            int i = c2z9.A00;
                                            if (z) {
                                                c2z92 = A0K;
                                            } else {
                                                c2z92 = A0J;
                                            }
                                            boolean z2 = !z;
                                            Bitmap A0K2 = C02180Ae.A0K(file, new C40821sv(0L, c2z92.A01, true));
                                            if (A0K2 == null || (bArr = C2z2.A00(A0K2, i, z2)) == null) {
                                                bArr = C02180Ae.A1b(file);
                                            }
                                        }
                                        C0KY c0ky = ((C23B) c23p).A01;
                                        long length = c23p.A03.length();
                                        C0KZ c0kz = c0ky.A03;
                                        c0kz.A0I = Long.valueOf(length);
                                        c0kz.A0M = Long.valueOf(3);
                                        c0kz.A01 = Boolean.valueOf(z);
                                        c0kz.A00 = false;
                                        c0kz.A05 = Long.valueOf(anonymousClass097.A00);
                                        c0kz.A07 = Long.valueOf(file.length());
                                        c0ky.A01();
                                        int i2 = anonymousClass097.A00;
                                        c3g4.A00 = i2;
                                        c3g4.A01 = true;
                                        ((AbstractC63102z7) c3g4).A00 = file;
                                        c3g4.A03 = bArr;
                                        c3g4.A02 = true;
                                        return new C3G5(file, bArr, true, i2, true, ((AbstractC63102z7) c3g4).A01);
                                    } catch (IOException e) {
                                        Log.e("mediatranscodequeue/attemptReuseExistingVideo", e);
                                        AnonymousClass024.A0f(A0f);
                                    }
                                }
                                return null;
                            }

                            public final void A04(C0JA c0ja, C0KY c0ky, int i, int i2, long j) {
                                c0ky.A03.A0O = "transcode";
                                c0ja.A00 = C43091wq.A00(this.A04, i, i2, j, this.A0B.A04 ? 6 : 9);
                                c0ja.A0F();
                            }

                            public final void A05(Exception exc) {
                                C36751lJ c36751lJ = new C36751lJ();
                                c36751lJ.A00 = 5;
                                c36751lJ.A05 = exc.toString();
                                this.A0A.A09(c36751lJ, 1);
                                AnonymousClass011.A01(c36751lJ, "");
                            }

                            public final boolean A06(File file, File file2, C0KY c0ky) {
                                c0ky.A03.A0O = "checkAndRepair";
                                AnonymousClass024.A0P(this.A02.A04, file, file2);
                                try {
                                    return this.A03.A05(file2);
                                } catch (C04100In e) {
                                    throw e;
                                } catch (IOException e2) {
                                    Log.e("mediatranscodequeue/repair/io-exception/", e2);
                                    throw e2;
                                }
                            }
                        };
                    } else if (c23b instanceof C23F) {
                        runnable = new C23R(c456022s.A08, c456022s.A01, c456022s.A02, c456022s.A0K, (C23F) c23b, wakeLock);
                    } else if (c23b instanceof C23E) {
                        runnable = new C23O(c456022s.A0B, c456022s.A01, c456022s.A05, c456022s.A0J, c456022s.A07, c456022s.A0A, c456022s.A06, c456022s.A0G, c456022s.A0F, (C23E) c23b, wakeLock) { // from class: X.23S
                            public final PowerManager.WakeLock A00;
                            public final AbstractC000600i A01;
                            public final C01B A02;
                            public final C000400f A03;
                            public final C02E A04;
                            public final C40411sD A05;
                            public final C003701t A06;
                            public final C23E A07;
                            public final C43171wy A08;
                            public final C0GT A09;
                            public final C41961un A0A;

                            {
                                super(r10);
                                this.A06 = r1;
                                this.A01 = r2;
                                this.A02 = r3;
                                this.A0A = r4;
                                this.A04 = r5;
                                this.A03 = r7;
                                this.A09 = r8;
                                this.A08 = r9;
                                this.A07 = r10;
                                this.A00 = wakeLock;
                                this.A05 = r6;
                            }

                            public static void A00(InputStream inputStream, int i) {
                                int read;
                                byte[] bArr = new byte[1024];
                                while (i > 0) {
                                    int min = Math.min(Math.min(1024, i), 1024);
                                    int i2 = 0;
                                    while (i2 < min && (read = inputStream.read(bArr, 0 + i2, min - i2)) != -1) {
                                        i2 += read;
                                    }
                                    if (i2 == -1) {
                                        throw new EOFException(C000200d.A0D("Unexpected EOF skipping ", i));
                                    }
                                    i -= 1024;
                                }
                            }

                            public static boolean A01(byte[] bArr, byte[] bArr2) {
                                int length = bArr.length - 0;
                                int length2 = bArr2.length;
                                if (length < length2) {
                                    return false;
                                }
                                for (int i = 0; i < length2; i++) {
                                    if (bArr[0 + i] != bArr2[i]) {
                                        return false;
                                    }
                                }
                                return true;
                            }

                            /* JADX WARN: Can't wrap try/catch for region: R(13:(2:299|(7:303|304|305|306|(3:318|(5:321|322|323|(3:326|(1:336)(3:331|(1:333)|317)|324)|338)|339)(3:312|(1:314)|317)|71|(4:73|(1:75)|76|(4:78|(1:80)(1:84)|81|82)(2:85|86))(2:87|88)))|13|14|(1:16)|17|(13:19|(2:252|(1:254))|23|24|25|26|27|28|(1:30)(2:147|(2:148|(2:150|(2:232|233)(2:152|(3:221|222|(3:224|(1:231)(1:229)|230)(0))(2:154|(2:219|220)(3:156|(1:(3:180|181|182)(2:159|(3:160|(2:161|(2:163|(1:165)(1:166)))|171)))(2:183|(3:(3:186|(2:188|(3:194|195|196)(1:190))(2:(2:198|(2:201|202)(1:200))|203)|191)(2:204|(4:(1:207)(1:211)|208|209|210)(2:212|(1:214)(2:215|216)))|192|193)(2:217|218))|178))))(2:234|235)))|31|32|33|(20:35|36|37|(1:39)|40|41|(1:45)|47|48|49|50|51|52|(2:108|(1:110)(1:111))(8:55|(5:57|(3:91|92|(1:94))|59|60|(2:62|63))|107|65|(1:67)|70|71|(0)(0))|64|65|(0)|70|71|(0)(0)))|256|257|258|259|260|(2:281|282)(27:266|267|268|269|270|271|36|37|(0)|40|41|(2:43|45)|47|48|49|50|51|52|(0)|108|(0)(0)|64|65|(0)|70|71|(0)(0))|(4:(0)|(1:100)|(1:245)|(1:286))) */
                            /* JADX WARN: Code restructure failed: missing block: B:424:0x00da, code lost:
                                if (r18.isHeld() != false) goto L316;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:451:0x019e, code lost:
                                if (r0 < 200000) goto L23;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:481:0x029e, code lost:
                                if (r20 == false) goto L168;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:482:0x02a0, code lost:
                                r13[0] = -1;
                                r13[1] = r14[0];
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:483:0x02b2, code lost:
                                if (X.AnonymousClass029.A1a(X.C63082z3.A0I, r14[0]) == false) goto L177;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:484:0x02b4, code lost:
                                r7.write(r13);
                                r11 = r11 + 2;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:485:0x02ba, code lost:
                                r7.write(r14);
                                r11 = r11 + 1;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:566:0x046b, code lost:
                                r8 = move-exception;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:567:0x046c, code lost:
                                r1 = r27.inSampleSize << 1;
                                r27.inSampleSize = r1;
                                r0 = X.C000200d.A0P("imageprocessor/compressToFile/oom ");
                                r0.append(r1);
                                com.whatsapp.util.Log.i(r0.toString(), r8);
                                r9 = r0.A0a(r0, r0, r0, r27, r28);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:607:0x064f, code lost:
                                if (r18.isHeld() != false) goto L69;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:645:0x06d3, code lost:
                                if (r18.isHeld() != false) goto L69;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:659:0x0722, code lost:
                                if (r18.isHeld() != false) goto L69;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:667:0x073e, code lost:
                                if (r18.isHeld() != false) goto L69;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:672:0x074b, code lost:
                                if (r18.isHeld() != false) goto L69;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:673:0x074d, code lost:
                                r18.release();
                                r1 = r1;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:677:0x075b, code lost:
                                if (r18.isHeld() != false) goto L316;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:678:0x075d, code lost:
                                r18.release();
                             */
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Removed duplicated region for block: B:574:0x04d7 A[Catch: SecurityException -> 0x0699, OutOfMemoryError -> 0x06b2, IOException -> 0x06d6, 1w8 -> 0x0725, all -> 0x07aa, TRY_LEAVE, TryCatch #5 {SecurityException -> 0x0699, blocks: (B:388:0x002d, B:391:0x0036, B:435:0x00f1, B:437:0x0122, B:572:0x04bf, B:574:0x04d7, B:575:0x04e5, B:577:0x04ef, B:579:0x04f7, B:580:0x050b, B:550:0x0415, B:558:0x0444, B:565:0x046a, B:634:0x0684, B:635:0x0698, B:438:0x0125, B:395:0x006c), top: B:711:0x002d }] */
                            /* JADX WARN: Removed duplicated region for block: B:602:0x05b5 A[Catch: all -> 0x0653, TryCatch #28 {all -> 0x0653, blocks: (B:598:0x0592, B:600:0x05a5, B:602:0x05b5, B:603:0x0608), top: B:732:0x0536 }] */
                            /* JADX WARN: Removed duplicated region for block: B:603:0x0608 A[Catch: all -> 0x0653, TRY_LEAVE, TryCatch #28 {all -> 0x0653, blocks: (B:598:0x0592, B:600:0x05a5, B:602:0x05b5, B:603:0x0608), top: B:732:0x0536 }] */
                            /* JADX WARN: Removed duplicated region for block: B:606:0x064b  */
                            /* JADX WARN: Removed duplicated region for block: B:644:0x06cf  */
                            /* JADX WARN: Removed duplicated region for block: B:658:0x071e  */
                            /* JADX WARN: Removed duplicated region for block: B:666:0x073a  */
                            /* JADX WARN: Removed duplicated region for block: B:671:0x0747  */
                            /* JADX WARN: Removed duplicated region for block: B:682:0x0765  */
                            /* JADX WARN: Removed duplicated region for block: B:695:0x07a6  */
                            /* JADX WARN: Type inference failed for: r1v39 */
                            /* JADX WARN: Type inference failed for: r1v52, types: [int] */
                            /* JADX WARN: Type inference failed for: r1v53, types: [android.util.Pair] */
                            @Override // X.C23O
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct code enable 'Show inconsistent code' option in preferences
                            */
                            public X.AnonymousClass235 A02() {
                                /*
                                    Method dump skipped, instructions count: 1977
                                    To view this dump change 'Code comments level' option to 'DEBUG'
                                */
                                throw new UnsupportedOperationException("Method not decompiled: X.C23S.A02():X.235");
                            }

                            public C3G2 A03(AnonymousClass097 anonymousClass097, C3G1 c3g1, File file) {
                                C09H c09h;
                                File file2;
                                if (anonymousClass097 != null && anonymousClass097.A06 != null && (c09h = anonymousClass097.A02) != null && (file2 = c09h.A0F) != null && file2.exists()) {
                                    try {
                                        InputStream A0e = this.A0A.A0e(Uri.fromFile(anonymousClass097.A02.A0F));
                                        AnonymousClass024.A0i(A0e, file);
                                        if (!anonymousClass097.A06.equals(C40841sx.A0I(file))) {
                                            AnonymousClass024.A0f(file);
                                            A0e.close();
                                            return null;
                                        }
                                        C0GT c0gt = this.A09;
                                        C03900Hp A0E = anonymousClass097.A0E();
                                        if (A0E != null) {
                                            c0gt.A02(A0E);
                                            C43171wy c43171wy = this.A08;
                                            C04030Id A18 = anonymousClass097.A18();
                                            if (A18 != null) {
                                                c43171wy.A01(A18);
                                                int[] A07 = anonymousClass097.A18().A07();
                                                if (A07 != null && A07.length == 4) {
                                                    if (A07[0] + A07[1] + A07[2] + A07[3] == file.length()) {
                                                        c3g1.A05 = anonymousClass097.A18().A07();
                                                        c3g1.A04 = anonymousClass097.A18().A07() != null;
                                                    }
                                                }
                                                C09H c09h2 = anonymousClass097.A02;
                                                c3g1.A02 = c09h2.A06;
                                                c3g1.A03 = c09h2.A08;
                                                c3g1.A00 = c09h2.A02;
                                                c3g1.A01 = c09h2.A03;
                                                ((AbstractC63102z7) c3g1).A03 = anonymousClass097.A0E().A08();
                                                ((AbstractC63102z7) c3g1).A00 = file;
                                                ((AbstractC63102z7) c3g1).A02 = true;
                                                C3G2 A00 = c3g1.A00();
                                                A0e.close();
                                                return A00;
                                            }
                                            throw null;
                                        }
                                        throw null;
                                    } catch (IOException unused) {
                                        StringBuilder A0P = C000200d.A0P("ProcessImageTask/processImage/failed to get bitmap stream from file ");
                                        A0P.append(anonymousClass097.A02.A0F);
                                        Log.e(A0P.toString());
                                        AnonymousClass024.A0f(file);
                                    }
                                }
                                return null;
                            }
                        };
                    } else if (c23b instanceof C23D) {
                        runnable = new C23T(c456022s.A01, c456022s.A08, c456022s.A02, c456022s.A05, c456022s.A0J, c456022s.A0H, c456022s.A04, (C23D) c23b);
                    } else if (c23b instanceof C23A) {
                        runnable = new C23U(c456022s.A08, (C23A) c23b);
                    } else {
                        throw new AssertionError("Unreachable code");
                    }
                } else {
                    throw null;
                }
            } else if (this instanceof C23L) {
                runnable = (C0CH) obj2;
            } else if (!(this instanceof C43151ww)) {
                runnable = (Runnable) obj2;
                if (runnable == null) {
                    throw null;
                }
            } else {
                runnable = (C0CH) obj2;
            }
            runnableC43241x5 = new RunnableC43241x5(this, obj, runnable, obj2);
            map.put(obj, runnableC43241x5);
            ((ThreadPoolExecutor) this.A00.get()).execute(runnableC43241x5);
        }
        return runnableC43241x5.A02;
    }

    public final synchronized Set A02() {
        return new HashSet(this.A01.keySet());
    }

    public synchronized void A03(Runnable runnable) {
        Iterator it = ((HashSet) A02()).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            RunnableC43241x5 runnableC43241x5 = (RunnableC43241x5) this.A01.get(next);
            if (runnable.equals(runnableC43241x5 != null ? runnableC43241x5.A02 : null)) {
                A06(next);
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x000e, code lost:
        if (r1 == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized boolean A04(java.lang.Object r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.util.Map r0 = r2.A01     // Catch: java.lang.Throwable -> L13
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.Throwable -> L13
            X.1x5 r0 = (X.RunnableC43241x5) r0     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto L10
            boolean r1 = r0.A03     // Catch: java.lang.Throwable -> L13
            r0 = 1
            if (r1 != 0) goto L11
        L10:
            r0 = 0
        L11:
            monitor-exit(r2)
            return r0
        L13:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC43161wx.A04(java.lang.Object):boolean");
    }

    public final synchronized boolean A05(Object obj, RunnableC43241x5 runnableC43241x5) {
        Map map = this.A01;
        if (runnableC43241x5.equals(map.get(obj))) {
            map.remove(obj);
            ((ThreadPoolExecutor) this.A00.get()).remove(runnableC43241x5);
            return true;
        }
        return false;
    }

    public synchronized boolean A06(Object obj) {
        Map map = this.A01;
        RunnableC43241x5 runnableC43241x5 = (RunnableC43241x5) map.get(obj);
        if (runnableC43241x5 != null) {
            Runnable runnable = runnableC43241x5.A02;
            if (runnable instanceof C0CJ) {
                ((C0CJ) runnable).cancel();
            }
            ((ThreadPoolExecutor) this.A00.get()).remove(runnableC43241x5);
            map.remove(obj);
            return true;
        }
        return false;
    }
}
