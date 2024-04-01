package X;

import android.content.SharedPreferences;
import android.database.Cursor;
import android.os.Message;
import android.util.Pair;
import com.whatsapp.jid.UserJid;
import com.whatsapp.service.MDSyncService;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;

/* renamed from: X.1u6 */
/* loaded from: classes2.dex */
public class C41541u6 extends C00T implements C1u7, C01o, InterfaceC41551u8, C0EM {
    public static volatile C41541u6 A0Y;
    public Runnable A01;
    public boolean A02;
    public final C02L A03;
    public final C01B A04;
    public final C41301th A05;
    public final C44531zE A06;
    public final C44511zC A07;
    public final C44421z3 A08;
    public final C44441z5 A09;
    public final C44471z8 A0A;
    public final C44341yu A0B;
    public final C44331yt A0C;
    public final C44381yy A0D;
    public final C42961wc A0E;
    public final C44411z1 A0F;
    public final C44311yr A0G;
    public final C44321ys A0H;
    public final C41831ua A0I;
    public final C05W A0J;
    public final C001200o A0K;
    public final C0CA A0L;
    public final C41711uO A0N;
    public final C44431z4 A0O;
    public final C44291yp A0P;
    public final C44401z0 A0Q;
    public final C44351yv A0R;
    public final C010605h A0S;
    public final C0EE A0T;
    public final C0ER A0U;
    public final InterfaceC002901k A0V;
    public final C44301yq A0W;
    public final AnonymousClass062 A0X;
    public AbstractC44481z9 A00 = null;
    public final C44501zB A0M = new C44491zA(this);

    @Override // X.C1u7
    public void APU() {
    }

    public C41541u6(C001200o c001200o, AnonymousClass012 anonymousClass012, AbstractC000600i abstractC000600i, C02L c02l, InterfaceC002901k interfaceC002901k, C01B c01b, C44291yp c44291yp, C44301yq c44301yq, C05Y c05y, C05W c05w, C44311yr c44311yr, C44321ys c44321ys, C0ER c0er, C44331yt c44331yt, AnonymousClass062 anonymousClass062, C0EE c0ee, C44341yu c44341yu, C44351yv c44351yv, C44361yw c44361yw, C0CA c0ca, C44371yx c44371yx, C44381yy c44381yy, C44401z0 c44401z0, C44411z1 c44411z1, C41711uO c41711uO, C1z2 c1z2, C42961wc c42961wc, C44421z3 c44421z3, C44431z4 c44431z4, C44441z5 c44441z5, C44451z6 c44451z6, C44461z7 c44461z7, C44471z8 c44471z8, C010605h c010605h, C41831ua c41831ua, C41301th c41301th) {
        this.A0K = c001200o;
        this.A03 = c02l;
        this.A0V = interfaceC002901k;
        this.A04 = c01b;
        this.A0P = c44291yp;
        this.A0W = c44301yq;
        this.A0J = c05w;
        this.A0G = c44311yr;
        this.A0H = c44321ys;
        this.A0U = c0er;
        this.A0C = c44331yt;
        this.A0X = anonymousClass062;
        this.A0T = c0ee;
        this.A0B = c44341yu;
        this.A0R = c44351yv;
        this.A0L = c0ca;
        this.A0D = c44381yy;
        this.A0Q = c44401z0;
        this.A0F = c44411z1;
        this.A0N = c41711uO;
        this.A0E = c42961wc;
        this.A08 = c44421z3;
        this.A0O = c44431z4;
        this.A09 = c44441z5;
        this.A0A = c44471z8;
        this.A0S = c010605h;
        this.A0I = c41831ua;
        this.A05 = c41301th;
        C44511zC c44511zC = new C44511zC(anonymousClass012, abstractC000600i, c01b, c44311yr, c44321ys, c44331yt, c44351yv, c44371yx, c44401z0, c41711uO, c1z2, c42961wc, c44451z6, new C0G8(new Random()), new C44521zD(this, c44421z3, c44361yw, c44411z1));
        this.A07 = c44511zC;
        this.A06 = new C44531zE(interfaceC002901k, c05y, c44331yt, c44381yy, c44401z0, c44461z7, c44511zC);
    }

    public static C41541u6 A00() {
        if (A0Y == null) {
            synchronized (C41541u6.class) {
                if (A0Y == null) {
                    C001200o c001200o = C001200o.A01;
                    AnonymousClass012 A00 = AnonymousClass012.A00();
                    AbstractC000600i A002 = AbstractC000600i.A00();
                    C02L A003 = C02L.A00();
                    InterfaceC002901k A004 = C002801j.A00();
                    C01B A005 = C01B.A00();
                    C44291yp A006 = C44291yp.A00();
                    C44301yq A007 = C44301yq.A00();
                    C05Y A01 = C05Y.A01();
                    C05W A008 = C05W.A00();
                    C44311yr A009 = C44311yr.A00();
                    C44321ys A0010 = C44321ys.A00();
                    C0ER A0011 = C0ER.A00();
                    C44331yt A0012 = C44331yt.A00();
                    AnonymousClass062 A0013 = AnonymousClass062.A00();
                    C0EE A0014 = C0EE.A00();
                    C44341yu A0015 = C44341yu.A00();
                    C44351yv A0016 = C44351yv.A00();
                    if (C44361yw.A00 == null) {
                        synchronized (C44361yw.class) {
                            if (C44361yw.A00 == null) {
                                C44361yw.A00 = new C44361yw();
                            }
                        }
                    }
                    C44361yw c44361yw = C44361yw.A00;
                    C0CA A0017 = C0CA.A00();
                    C44371yx A0018 = C44371yx.A00();
                    C44381yy A0019 = C44381yy.A00();
                    C44401z0 A0020 = C44401z0.A00();
                    if (C44411z1.A04 == null) {
                        synchronized (C44411z1.class) {
                            if (C44411z1.A04 == null) {
                                C44411z1.A04 = new C44411z1(AnonymousClass012.A00(), AbstractC000600i.A00(), C01B.A00(), C42961wc.A00());
                            }
                        }
                    }
                    C44411z1 c44411z1 = C44411z1.A04;
                    C41711uO A0021 = C41711uO.A00();
                    C1z2 A0022 = C1z2.A00();
                    C42961wc A0023 = C42961wc.A00();
                    C44421z3 A0024 = C44421z3.A00();
                    C44431z4 A0025 = C44431z4.A00();
                    C44441z5 A0026 = C44441z5.A00();
                    if (C44451z6.A05 == null) {
                        synchronized (C44451z6.class) {
                            if (C44451z6.A05 == null) {
                                C44451z6.A05 = new C44451z6(C0EL.A00(), C01B.A00(), C0IY.A00(), C000400f.A00(), C04000Ia.A00());
                            }
                        }
                    }
                    C44451z6 c44451z6 = C44451z6.A05;
                    if (C44461z7.A03 == null) {
                        synchronized (C44461z7.class) {
                            if (C44461z7.A03 == null) {
                                C01B A0027 = C01B.A00();
                                C44371yx A0028 = C44371yx.A00();
                                if (C44541zF.A02 == null) {
                                    synchronized (C44541zF.class) {
                                        if (C44541zF.A02 == null) {
                                            C44541zF.A02 = new C44541zF(C44551zG.A00(), C000400f.A00());
                                        }
                                    }
                                }
                                C44461z7.A03 = new C44461z7(A0027, A0028, C44541zF.A02);
                            }
                        }
                    }
                    A0Y = new C41541u6(c001200o, A00, A002, A003, A004, A005, A006, A007, A01, A008, A009, A0010, A0011, A0012, A0013, A0014, A0015, A0016, c44361yw, A0017, A0018, A0019, A0020, c44411z1, A0021, A0022, A0023, A0024, A0025, A0026, c44451z6, C44461z7.A03, C44471z8.A00(), C010605h.A03, C41831ua.A00(), C41301th.A00);
                }
            }
        }
        return A0Y;
    }

    public static void A01(C41541u6 c41541u6, boolean z) {
        synchronized (c41541u6) {
            c41541u6.A02 = false;
            if (!z) {
                return;
            }
            c41541u6.A0N();
        }
    }

    @Override // X.C00T
    public void A0C(AnonymousClass092 anonymousClass092, int i) {
        if (!this.A0T.A02() || anonymousClass092.A0n.A00 == null) {
            return;
        }
        if (i == -1 || i == 22) {
            this.A0V.AS1(new RunnableEBaseShape0S0200000_I0_0(this, anonymousClass092, 47));
        }
    }

    public final Pair A0D(Collection collection, Collection collection2) {
        C44301yq c44301yq = this.A0W;
        List A0F = C003101m.A0F(UserJid.class, c44301yq.A0H("SYNC_MANAGER_CONTACTS_JID_ADDED"));
        List A0F2 = C003101m.A0F(UserJid.class, c44301yq.A0H("SYNC_MANAGER_CONTACTS_JID_REMOVED"));
        collection.addAll(A0F);
        collection2.addAll(A0F2);
        HashSet hashSet = new HashSet();
        C003101m.A0N(collection, hashSet);
        HashSet hashSet2 = new HashSet();
        C003101m.A0N(collection2, hashSet2);
        return new Pair(hashSet, hashSet2);
    }

    public Set A0E(AbstractC005302j abstractC005302j, boolean z) {
        C44321ys c44321ys = this.A0H;
        C44561zH c44561zH = (C44561zH) c44321ys.A02("archive");
        if (c44561zH != null) {
            C02L c02l = this.A03;
            c02l.A05();
            if (c02l.A03 != null && A0W()) {
                return c44321ys.A04(Collections.singletonList(new C44601zL(null, abstractC005302j, z, c44561zH.A02.A05(), null, false, c44561zH.A00.A02(abstractC005302j, false))));
            }
        }
        return Collections.emptySet();
    }

    public Set A0F(AbstractC005302j abstractC005302j, boolean z) {
        C44321ys c44321ys = this.A0H;
        C44661zR c44661zR = (C44661zR) c44321ys.A02("pin");
        if (c44661zR == null) {
            return Collections.emptySet();
        }
        C02L c02l = this.A03;
        c02l.A05();
        if (c02l.A03 == null) {
            return Collections.emptySet();
        }
        if (!A0W()) {
            return Collections.emptySet();
        }
        return c44321ys.A04(Collections.singletonList(new C44671zS(null, abstractC005302j, z, c44661zR.A02.A05(), null, false)));
    }

    public Set A0G(AbstractC005302j abstractC005302j, boolean z) {
        C44321ys c44321ys = this.A0H;
        C44681zT c44681zT = (C44681zT) c44321ys.A02("deleteChat");
        if (c44681zT == null) {
            return Collections.emptySet();
        }
        if (!A0W()) {
            return Collections.emptySet();
        }
        C44691zU c44691zU = new C44691zU(null, abstractC005302j, z, c44681zT.A02.A05(), null, true, c44681zT.A01.A02(abstractC005302j, true));
        C44351yv c44351yv = ((AbstractC44571zI) c44681zT).A00;
        C44691zU c44691zU2 = (C44691zU) c44351yv.A07(AbstractC44611zM.A00(c44691zU.A06()));
        if (c44691zU2 != null || (c44691zU2 = (C44691zU) c44351yv.A08(AbstractC44611zM.A00(c44691zU.A06()))) != null) {
            c44691zU = r11;
            C44691zU c44691zU3 = new C44691zU(null, c44691zU2.A01, c44691zU2.A02, c44691zU.A04, null, true, C44591zK.A01(c44691zU.A00, c44691zU2.A00));
        }
        return c44321ys.A04(Collections.singletonList(c44691zU));
    }

    public Set A0H(AbstractC005302j abstractC005302j, boolean z) {
        C44321ys c44321ys = this.A0H;
        C44701zV c44701zV = (C44701zV) c44321ys.A02("markChatAsRead");
        if (c44701zV == null) {
            return Collections.emptySet();
        }
        if (!A0W()) {
            return Collections.emptySet();
        }
        return c44321ys.A04(Collections.singletonList(new C44711zW(null, abstractC005302j, z, c44701zV.A02.A05(), null, false, c44701zV.A00.A02(abstractC005302j, false))));
    }

    public Set A0I(AbstractC005302j abstractC005302j, boolean z, long j) {
        C44321ys c44321ys = this.A0H;
        C44721zX c44721zX = (C44721zX) c44321ys.A02("mute");
        if (c44721zX == null) {
            return Collections.emptySet();
        }
        if (!A0W()) {
            return Collections.emptySet();
        }
        return c44321ys.A04(Collections.singletonList(new C44731zY(null, abstractC005302j, z, null, false, j, c44721zX.A00.A05())));
    }

    public Set A0J(AbstractC005302j abstractC005302j, boolean z, boolean z2) {
        C44321ys c44321ys = this.A0H;
        C44741zZ c44741zZ = (C44741zZ) c44321ys.A02("clearChat");
        if (c44741zZ != null) {
            C02L c02l = this.A03;
            c02l.A05();
            if (c02l.A03 != null && A0W()) {
                C44751za c44751za = new C44751za(null, abstractC005302j, z, z2, c44741zZ.A02.A05(), null, true, c44741zZ.A01.A02(abstractC005302j, true));
                C44351yv c44351yv = ((AbstractC44571zI) c44741zZ).A00;
                C44751za c44751za2 = (C44751za) c44351yv.A07(AbstractC44611zM.A00(c44751za.A06()));
                if (c44751za2 != null || (c44751za2 = (C44751za) c44351yv.A08(AbstractC44611zM.A00(c44751za.A06()))) != null) {
                    c44751za = new C44751za(null, c44751za2.A01, c44751za2.A03, c44751za2.A02, c44751za.A04, null, true, C44591zK.A01(c44751za.A00, c44751za2.A00));
                }
                return c44321ys.A04(Collections.singletonList(c44751za));
            }
        }
        return Collections.emptySet();
    }

    public Set A0K(Collection collection, boolean z) {
        C44321ys c44321ys = this.A0H;
        C44761zb c44761zb = (C44761zb) c44321ys.A02("star");
        if (c44761zb == null) {
            return Collections.emptySet();
        }
        C02L c02l = this.A03;
        c02l.A05();
        if (c02l.A03 == null) {
            return Collections.emptySet();
        }
        if (!A0W()) {
            return Collections.emptySet();
        }
        long A05 = c44761zb.A02.A05();
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            AnonymousClass092 anonymousClass092 = (AnonymousClass092) it.next();
            AnonymousClass094 anonymousClass094 = anonymousClass092.A0n;
            AbstractC005302j abstractC005302j = anonymousClass094.A00;
            arrayList.add(new C44771zc(null, anonymousClass094, z, A05, null, false, (C003101m.A0U(abstractC005302j) || C003101m.A0P(abstractC005302j)) ? anonymousClass092.A0A() : null));
        }
        return c44321ys.A04(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.1ys] */
    public Set A0L(Collection collection, boolean z) {
        ?? emptyList;
        ?? r4 = this.A0H;
        C44791ze c44791ze = (C44791ze) r4.A02("deleteMessageForMe");
        if (c44791ze == null) {
            return Collections.emptySet();
        }
        if (!A0W()) {
            return Collections.emptySet();
        }
        if (!collection.isEmpty()) {
            long A05 = c44791ze.A00.A05();
            emptyList = new ArrayList(collection.size());
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                AnonymousClass092 anonymousClass092 = (AnonymousClass092) it.next();
                AnonymousClass094 anonymousClass094 = anonymousClass092.A0n;
                AbstractC005302j abstractC005302j = anonymousClass094.A00;
                emptyList.add(new C44801zf(null, anonymousClass094, z, A05, anonymousClass092.A0E, null, false, (C003101m.A0U(abstractC005302j) || C003101m.A0P(abstractC005302j)) ? anonymousClass092.A0A() : null));
            }
        } else {
            emptyList = Collections.emptyList();
        }
        return r4.A04(emptyList);
    }

    public void A0M() {
        C41831ua c41831ua = this.A0I;
        synchronized (c41831ua) {
            Set set = c41831ua.A00;
            if (set != null) {
                set.clear();
            }
        }
        this.A0U.A02(this.A0K.A00, MDSyncService.class);
        this.A0P.A03();
        this.A0E.A02().clear().apply();
    }

    /* JADX WARN: Code restructure failed: missing block: B:92:0x0018, code lost:
        if (r7.A0F.A02.A03().getBoolean("syncd_soft_fatal_on_device", false) != false) goto L73;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0N() {
        /*
            Method dump skipped, instructions count: 346
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41541u6.A0N():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x003e, code lost:
        if (r5 == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0077, code lost:
        if (r5 != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0079, code lost:
        A0P();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized void A0O() {
        /*
            Method dump skipped, instructions count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41541u6.A0O():void");
    }

    public synchronized void A0P() {
        StringBuilder sb = new StringBuilder();
        sb.append("sync-manager/deleteAllSyncdData: isSyncing = ");
        sb.append(this.A02);
        Log.i(sb.toString());
        this.A00 = new C44821zi(this);
        if (!this.A02) {
            A0X();
        }
    }

    public synchronized void A0Q() {
        if (A0W()) {
            List A0F = C003101m.A0F(UserJid.class, this.A0W.A0H("SYNC_MANAGER_CONTACTS_JID_ADDED"));
            List<AbstractC005302j> A0F2 = C003101m.A0F(UserJid.class, this.A0W.A0H("SYNC_MANAGER_CONTACTS_JID_REMOVED"));
            C44831zj c44831zj = (C44831zj) this.A0H.A02("contact");
            if (c44831zj != null) {
                C44321ys c44321ys = this.A0H;
                ArrayList arrayList = new ArrayList(A0F);
                ArrayList arrayList2 = new ArrayList();
                for (AbstractC005302j abstractC005302j : A0F2) {
                    if (!arrayList.contains(abstractC005302j)) {
                        C06C A09 = c44831zj.A01.A09(abstractC005302j);
                        if (A09 != null && AnonymousClass060.A02(A09) && A09.A0X) {
                            arrayList.add(abstractC005302j);
                        } else {
                            arrayList2.add(abstractC005302j);
                        }
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(c44831zj.A08(arrayList, C44841zk.A03));
                arrayList3.addAll(c44831zj.A08(arrayList2, C44841zk.A02));
                c44321ys.A04(arrayList3);
            }
            this.A0W.A0I("SYNC_MANAGER_CONTACTS_JID_ADDED", null);
            this.A0W.A0I("SYNC_MANAGER_CONTACTS_JID_REMOVED", null);
            C44321ys c44321ys2 = this.A0H;
            synchronized (c44321ys2) {
                Iterator it = ((ArrayList) c44321ys2.A03()).iterator();
                while (it.hasNext()) {
                    if (((AbstractC44571zI) it.next()) == null) {
                        throw null;
                    }
                }
            }
            C44351yv c44351yv = this.A0R;
            ArrayList arrayList4 = new ArrayList();
            C0CD A01 = c44351yv.A01.A01();
            Cursor A07 = A01.A02.A07("SELECT _id, mutation_index, mutation_value, mutation_version, operation, device_id, epoch, are_dependencies_missing FROM pending_mutations WHERE is_ready_to_sync = 0  ORDER BY _id ASC ", null);
            while (A07.moveToNext()) {
                try {
                    arrayList4.add(c44351yv.A05(A07));
                } finally {
                }
            }
            A07.close();
            A01.close();
            StringBuilder sb = new StringBuilder();
            sb.append("sync-manager/handleNotReadyToSyncPendingMutations count: ");
            ArrayList arrayList5 = arrayList4;
            sb.append(arrayList5.size());
            Log.i(sb.toString());
            C44321ys c44321ys3 = this.A0H;
            if (c44321ys3 != null) {
                Iterator it2 = arrayList5.iterator();
                while (it2.hasNext()) {
                    AbstractC44611zM abstractC44611zM = (AbstractC44611zM) it2.next();
                    AbstractC44571zI A012 = c44321ys3.A01(abstractC44611zM);
                    if (A012 != null) {
                        if (A012 instanceof C44761zb) {
                            C44761zb c44761zb = (C44761zb) A012;
                            C44771zc c44771zc = (C44771zc) abstractC44611zM;
                            AnonymousClass092 A0F3 = c44761zb.A04.A0F(c44771zc.A01);
                            if (A0F3 != null) {
                                c44761zb.A09(c44771zc, A0F3);
                                c44761zb.A04(c44771zc);
                            } else {
                                ((AbstractC44571zI) c44761zb).A00.A0F(c44771zc);
                            }
                        } else if (!(A012 instanceof C44851zl)) {
                            if (A012 instanceof C44861zm) {
                                C44861zm c44861zm = (C44861zm) A012;
                                C44891zp c44891zp = (C44891zp) abstractC44611zM;
                                C02L c02l = c44861zm.A00;
                                String str = c44891zp.A00;
                                c02l.A07(str);
                                c44861zm.A02.A0C(Message.obtain(null, 0, 3, 0, Pair.create(str, null)));
                                c44861zm.A04(c44891zp);
                            } else if (A012 instanceof C44661zR) {
                                C44661zR c44661zR = (C44661zR) A012;
                                C44671zS c44671zS = (C44671zS) abstractC44611zM;
                                C05M c05m = c44661zR.A04;
                                AbstractC005302j abstractC005302j2 = c44671zS.A00;
                                if (c05m.A0E(abstractC005302j2)) {
                                    c44661zR.A09(c44671zS, abstractC005302j2);
                                    c44661zR.A04(c44671zS);
                                } else {
                                    ((AbstractC44571zI) c44661zR).A00.A0F(c44671zS);
                                }
                            } else if (A012 instanceof C44721zX) {
                                C44721zX c44721zX = (C44721zX) A012;
                                C44731zY c44731zY = (C44731zY) abstractC44611zM;
                                if (c44721zX.A01.A0E(c44731zY.A01)) {
                                    c44721zX.A08(c44731zY);
                                    c44721zX.A04(c44731zY);
                                } else {
                                    ((AbstractC44571zI) c44721zX).A00.A0F(c44731zY);
                                }
                            } else if (A012 instanceof C44701zV) {
                                C44701zV c44701zV = (C44701zV) A012;
                                C44711zW c44711zW = (C44711zW) abstractC44611zM;
                                if (c44701zV.A04.A07(c44711zW.A01) == null) {
                                    ((AbstractC44571zI) c44701zV).A00.A0F(c44711zW);
                                } else {
                                    if (c44711zW.A02) {
                                        c44701zV.A01.A03(c44711zW.A01, false, true);
                                    } else {
                                        c44701zV.A01.A01(c44711zW.A01, false);
                                    }
                                    c44701zV.A04(c44711zW);
                                }
                            } else if (A012 instanceof C44871zn) {
                                A012.A04(abstractC44611zM);
                            } else if (A012 instanceof C44791ze) {
                                C44791ze c44791ze = (C44791ze) A012;
                                C44801zf c44801zf = (C44801zf) abstractC44611zM;
                                C0C9 c0c9 = c44791ze.A01;
                                AnonymousClass092 A0F4 = c0c9.A0F(c44801zf.A02);
                                if (A0F4 != null) {
                                    c0c9.A0c(Collections.singleton(A0F4), (c44801zf.A03 ? 1 : 0) | 2);
                                }
                                c44791ze.A04(c44801zf);
                            } else if (A012 instanceof C44681zT) {
                                C44681zT c44681zT = (C44681zT) A012;
                                C44691zU c44691zU = (C44691zU) abstractC44611zM;
                                if (c44681zT.A03.A07(c44691zU.A01) == null) {
                                    ((AbstractC44571zI) c44681zT).A00.A0F(c44691zU);
                                } else {
                                    c44681zT.A08(c44691zU);
                                    c44681zT.A04(c44691zU);
                                }
                            } else if (A012 instanceof C44831zj) {
                                C44831zj c44831zj2 = (C44831zj) A012;
                                C44881zo c44881zo = (C44881zo) abstractC44611zM;
                                C06C A092 = c44831zj2.A01.A09(c44881zo.A00);
                                if (A092 != null && AnonymousClass060.A02(A092) && A092.A0X) {
                                    if (c44881zo.A05 == C44841zk.A03) {
                                        c44831zj2.A04(c44881zo);
                                    } else {
                                        ((AbstractC44571zI) c44831zj2).A00.A0F(c44881zo);
                                    }
                                } else if (c44881zo.A05 == C44841zk.A02) {
                                    c44831zj2.A04(c44881zo);
                                } else {
                                    ((AbstractC44571zI) c44831zj2).A00.A0F(c44881zo);
                                }
                            } else if (!(A012 instanceof C44741zZ)) {
                                C44561zH c44561zH = (C44561zH) A012;
                                C44601zL c44601zL = (C44601zL) abstractC44611zM;
                                C0IT A072 = c44561zH.A04.A07(c44601zL.A01);
                                if (A072 == null) {
                                    ((AbstractC44571zI) c44561zH).A00.A0F(c44601zL);
                                } else {
                                    c44561zH.A09(c44601zL, A072);
                                    c44561zH.A04(c44601zL);
                                }
                            } else {
                                C44741zZ c44741zZ = (C44741zZ) A012;
                                C44751za c44751za = (C44751za) abstractC44611zM;
                                if (c44741zZ.A03.A07(c44751za.A01) == null) {
                                    ((AbstractC44571zI) c44741zZ).A00.A0F(c44751za);
                                } else {
                                    c44741zZ.A08(c44751za);
                                    c44741zZ.A04(c44751za);
                                }
                            }
                        }
                    }
                }
                A0R();
                return;
            }
            throw null;
        }
    }

    public final synchronized void A0R() {
        Runnable runnable = this.A01;
        if (runnable != null) {
            this.A0V.ART(runnable);
            this.A01 = null;
            Log.i("sync-manager/forceSync removed scheduled sync");
        }
        A0N();
    }

    public synchronized void A0S(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("sync-manager/handleFatalFailure: errorCode = ");
        sb.append(i);
        sb.append("; isSyncing = ");
        sb.append(this.A02);
        Log.i(sb.toString());
        this.A00 = new C44901zq(this, i);
        if (!this.A02) {
            A0X();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x001c, code lost:
        if (A0W() == false) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized void A0T(java.util.Collection r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            X.0EE r0 = r7.A0T     // Catch: java.lang.Throwable -> La0
            boolean r0 = r0.A02()     // Catch: java.lang.Throwable -> La0
            if (r0 != 0) goto Lb
            monitor-exit(r7)
            return
        Lb:
            X.1ys r1 = r7.A0H     // Catch: java.lang.Throwable -> La0
            java.lang.String r0 = "contact"
            java.lang.Object r0 = r1.A02(r0)     // Catch: java.lang.Throwable -> La0
            X.1zj r0 = (X.C44831zj) r0     // Catch: java.lang.Throwable -> La0
            if (r0 == 0) goto L1e
            boolean r0 = r7.A0W()     // Catch: java.lang.Throwable -> La0
            r6 = 1
            if (r0 != 0) goto L1f
        L1e:
            r6 = 0
        L1f:
            java.util.HashSet r5 = new java.util.HashSet     // Catch: java.lang.Throwable -> La0
            r5.<init>()     // Catch: java.lang.Throwable -> La0
            java.util.HashSet r4 = new java.util.HashSet     // Catch: java.lang.Throwable -> La0
            r4.<init>()     // Catch: java.lang.Throwable -> La0
            if (r6 == 0) goto L67
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> La0
            r5.<init>()     // Catch: java.lang.Throwable -> La0
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> La0
            r4.<init>()     // Catch: java.lang.Throwable -> La0
            java.util.Iterator r3 = r8.iterator()     // Catch: java.lang.Throwable -> La0
        L39:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> La0
            if (r0 == 0) goto L5b
            java.lang.Object r2 = r3.next()     // Catch: java.lang.Throwable -> La0
            X.06C r2 = (X.C06C) r2     // Catch: java.lang.Throwable -> La0
            java.lang.Class<com.whatsapp.jid.UserJid> r0 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r1 = r2.A03(r0)     // Catch: java.lang.Throwable -> La0
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1     // Catch: java.lang.Throwable -> La0
            if (r1 == 0) goto L39
            boolean r0 = r2.A0X     // Catch: java.lang.Throwable -> La0
            if (r0 == 0) goto L57
            r5.add(r1)     // Catch: java.lang.Throwable -> La0
            goto L39
        L57:
            r4.add(r1)     // Catch: java.lang.Throwable -> La0
            goto L39
        L5b:
            android.util.Pair r0 = r7.A0D(r5, r4)     // Catch: java.lang.Throwable -> La0
            java.lang.Object r5 = r0.first     // Catch: java.lang.Throwable -> La0
            java.util.Set r5 = (java.util.Set) r5     // Catch: java.lang.Throwable -> La0
            java.lang.Object r4 = r0.second     // Catch: java.lang.Throwable -> La0
            java.util.Set r4 = (java.util.Set) r4     // Catch: java.lang.Throwable -> La0
        L67:
            X.062 r0 = r7.A0X     // Catch: java.lang.Throwable -> La0
            X.0CD r3 = r0.A03()     // Catch: java.lang.Throwable -> La0
            X.0Hb r2 = r3.A00()     // Catch: java.lang.Throwable -> L99
            X.1yq r1 = r7.A0W     // Catch: java.lang.Throwable -> L92
            java.lang.String r0 = "SYNC_MANAGER_CONTACTS_JID_ADDED"
            r1.A0J(r0, r5)     // Catch: java.lang.Throwable -> L92
            java.lang.String r0 = "SYNC_MANAGER_CONTACTS_JID_REMOVED"
            r1.A0J(r0, r4)     // Catch: java.lang.Throwable -> L92
            X.05W r0 = r7.A0J     // Catch: java.lang.Throwable -> L92
            r0.A0O(r8)     // Catch: java.lang.Throwable -> L92
            r2.A00()     // Catch: java.lang.Throwable -> L92
            r2.close()     // Catch: java.lang.Throwable -> L99
            r3.close()     // Catch: java.lang.Throwable -> La0
            if (r6 == 0) goto L90
            r7.A0Q()     // Catch: java.lang.Throwable -> La0
        L90:
            monitor-exit(r7)
            return
        L92:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L94
        L94:
            r0 = move-exception
            r2.close()     // Catch: java.lang.Throwable -> L98
        L98:
            throw r0     // Catch: java.lang.Throwable -> L99
        L99:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L9b
        L9b:
            r0 = move-exception
            r3.close()     // Catch: java.lang.Throwable -> L9f
        L9f:
            throw r0     // Catch: java.lang.Throwable -> La0
        La0:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41541u6.A0T(java.util.Collection):void");
    }

    public void A0U(Set set) {
        if (set.isEmpty()) {
            return;
        }
        C44321ys c44321ys = this.A0H;
        synchronized (c44321ys) {
            C0CD A02 = c44321ys.A02.A01.A02();
            C03790Hb A00 = A02.A00();
            C44351yv.A03(A02.A02, (String[]) set.toArray(C44351yv.A02));
            A00.A00();
            A00.close();
            A02.close();
        }
    }

    public void A0V(Set set) {
        if (set.isEmpty()) {
            return;
        }
        C44321ys c44321ys = this.A0H;
        synchronized (c44321ys) {
            c44321ys.A02.A0I(set);
        }
        A0R();
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0018, code lost:
        if (r6.A0F.A02.A03().getBoolean("syncd_soft_fatal_on_device", false) != false) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A0W() {
        /*
            r6 = this;
            X.1z5 r0 = r6.A09
            boolean r0 = r0.A04()
            if (r0 != 0) goto L1a
            X.1z1 r0 = r6.A0F
            X.1wc r0 = r0.A02
            android.content.SharedPreferences r2 = r0.A03()
            java.lang.String r1 = "syncd_soft_fatal_on_device"
            r0 = 0
            boolean r1 = r2.getBoolean(r1, r0)
            r0 = 0
            if (r1 == 0) goto L1b
        L1a:
            r0 = 1
        L1b:
            r5 = 1
            r4 = 0
            if (r0 != 0) goto L6d
            X.0EE r0 = r6.A0T
            boolean r0 = r0.A02()
            if (r0 == 0) goto L6d
            X.1yv r1 = r6.A0R
            boolean r0 = r1.A0J()
            if (r0 != 0) goto L69
            X.1yp r0 = r1.A01
            X.0CD r3 = r0.A01()
            X.0CE r2 = r3.A02     // Catch: java.lang.Throwable -> L5d
            java.lang.String r1 = "SELECT _id FROM pending_mutations WHERE is_ready_to_sync = 1  LIMIT 1"
            r0 = 0
            android.database.Cursor r2 = r2.A07(r1, r0)     // Catch: java.lang.Throwable -> L5d
            if (r2 == 0) goto L6a
            boolean r0 = r2.moveToNext()     // Catch: java.lang.Throwable -> L56
            if (r0 != 0) goto L4a
            r2.close()     // Catch: java.lang.Throwable -> L5d
            goto L6a
        L4a:
            java.lang.String r1 = r2.getString(r4)     // Catch: java.lang.Throwable -> L56
            r0 = 0
            if (r1 == 0) goto L52
            r0 = 1
        L52:
            r2.close()     // Catch: java.lang.Throwable -> L5d
            goto L64
        L56:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L58
        L58:
            r0 = move-exception
            r2.close()     // Catch: java.lang.Throwable -> L5c
        L5c:
            throw r0     // Catch: java.lang.Throwable -> L5d
        L5d:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L5f
        L5f:
            r0 = move-exception
            r3.close()     // Catch: java.lang.Throwable -> L63
        L63:
            throw r0
        L64:
            r3.close()
            if (r0 == 0) goto L6d
        L69:
            return r5
        L6a:
            r3.close()
        L6d:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41541u6.A0W():boolean");
    }

    public synchronized boolean A0X() {
        AbstractC44481z9 abstractC44481z9 = this.A00;
        if (abstractC44481z9 == null) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("sync-manager/handleSyncdStateIfRequired: syncdState = ");
        sb.append(abstractC44481z9);
        Log.i(sb.toString());
        AbstractC44481z9 abstractC44481z92 = this.A00;
        if (!(abstractC44481z92 instanceof C44901zq)) {
            ((C44821zi) abstractC44481z92).A00.A09.A01();
        } else {
            C44901zq c44901zq = (C44901zq) abstractC44481z92;
            c44901zq.A01.A07.A01(c44901zq.A00);
        }
        this.A00 = null;
        return true;
    }

    @Override // X.C0EM
    public void AIL(boolean z) {
        if (z) {
            this.A0V.AS1(new RunnableEBaseShape1S0100000_I0_1(this, 34));
        }
    }

    @Override // X.InterfaceC41551u8
    public void AKA(C0JU c0ju) {
        if (c0ju instanceof C44911zr) {
            try {
                C44311yr c44311yr = this.A0G;
                C44911zr c44911zr = (C44911zr) c0ju;
                if (c44311yr != null) {
                    if (!c44911zr.A01 || c44311yr.A0C()) {
                        return;
                    }
                    c44311yr.A09();
                    c44311yr.A0A(new HashSet(c44911zr.A1B().values()));
                    this.A0V.AS1(new RunnableEBaseShape1S0100000_I0_1(this, 35));
                    return;
                }
                throw null;
            } catch (C44921zs e) {
                A0S(e.errorCode);
            }
        }
    }

    @Override // X.C01o
    public void ALd() {
        Object A02 = this.A0H.A02("setting_locale");
        if (A02 == null) {
            return;
        }
        this.A0V.AS1(new RunnableEBaseShape0S0200000_I0_0(this, A02, 48));
    }

    @Override // X.C1u7
    public void APT() {
        C41831ua c41831ua = this.A0I;
        synchronized (c41831ua) {
            Set set = c41831ua.A00;
            if (set != null) {
                set.clear();
            }
        }
        this.A0P.A03();
        SharedPreferences.Editor A02 = this.A0E.A02();
        for (String str : C42961wc.A02) {
            A02.remove(str);
        }
        A02.apply();
        C44301yq c44301yq = this.A0W;
        c44301yq.A0I("SYNC_MANAGER_CONTACTS_JID_ADDED", null);
        c44301yq.A0I("SYNC_MANAGER_CONTACTS_JID_REMOVED", null);
    }
}
