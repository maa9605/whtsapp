package X;

import android.os.Handler;
import android.os.HandlerThread;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.28r */
/* loaded from: classes2.dex */
public class C468928r implements C0EM {
    public static volatile C468928r A0S;
    public Handler A00;
    public final AbstractC000600i A01;
    public final C018508q A02;
    public final C02L A03;
    public final C010005b A04;
    public final C05230Nv A05;
    public final C06K A06;
    public final C06L A07;
    public final C05W A08;
    public final C469428w A09;
    public final C012205z A0A;
    public final C0KQ A0B;
    public final C469528x A0C;
    public final C469728z A0D;
    public final C469628y A0E;
    public final C000400f A0F;
    public final C0E7 A0G;
    public final C02E A0H;
    public final C001200o A0I;
    public final C02F A0J;
    public final C0CA A0K;
    public final C0EC A0L;
    public final C0DW A0M;
    public final C05G A0N;
    public final ExecutorC004702d A0O;
    public final C0L6 A0P;
    public final Runnable A0Q;
    public final AtomicBoolean A0R;

    public C468928r(C001200o c001200o, AnonymousClass012 anonymousClass012, C018508q c018508q, AbstractC000600i abstractC000600i, C02L c02l, InterfaceC002901k interfaceC002901k, AnonymousClass011 anonymousClass011, C41541u6 c41541u6, C05Y c05y, C0L6 c0l6, C05W c05w, C02E c02e, C002301c c002301c, C0DV c0dv, C010005b c010005b, C000400f c000400f, C0EC c0ec, C011505r c011505r, C0E7 c0e7, AnonymousClass075 anonymousClass075, C02F c02f, C000500h c000500h, C06L c06l, C012205z c012205z, C0CA c0ca, C41401tr c41401tr, C0DW c0dw, C41691uM c41691uM, C06K c06k, C469228u c469228u, C05G c05g, C02O c02o, C0KQ c0kq, C010605h c010605h) {
        C469428w c469428w = new C469428w(c001200o, anonymousClass012, abstractC000600i, c41541u6, c05y, new C469328v(c001200o), c02e, c002301c, c0dv, c0ec, anonymousClass075, c02f, c000500h, c0ca, c41401tr, c0dw, c41691uM, c469228u, c0kq);
        C469528x c469528x = new C469528x(anonymousClass012, anonymousClass011);
        C05230Nv c05230Nv = new C05230Nv(c02l, interfaceC002901k, c002301c, c02f, c000500h, c02o);
        this.A0R = new AtomicBoolean(false);
        this.A0I = c001200o;
        this.A02 = c018508q;
        this.A01 = abstractC000600i;
        this.A03 = c02l;
        this.A0P = c0l6;
        this.A08 = c05w;
        this.A0H = c02e;
        this.A04 = c010005b;
        this.A0F = c000400f;
        this.A0L = c0ec;
        this.A0C = c469528x;
        this.A0G = c0e7;
        this.A0J = c02f;
        this.A07 = c06l;
        this.A0A = c012205z;
        this.A0K = c0ca;
        this.A0M = c0dw;
        this.A06 = c06k;
        this.A0N = c05g;
        this.A0B = c0kq;
        this.A09 = c469428w;
        this.A05 = c05230Nv;
        this.A0Q = new RunnableEBaseShape1S0100000_I0_1(c011505r, 43);
        this.A0O = new ExecutorC004702d(interfaceC002901k, false);
        this.A0E = new C469628y(c0kq);
        this.A0D = new C469728z();
        c010605h.A00(this);
    }

    public static C468928r A00() {
        if (A0S == null) {
            synchronized (C468928r.class) {
                if (A0S == null) {
                    A0S = new C468928r(C001200o.A01, AnonymousClass012.A00(), C018508q.A00(), AbstractC000600i.A00(), C02L.A00(), C002801j.A00(), AnonymousClass011.A00(), C41541u6.A00(), C05Y.A01(), C0L6.A00(), C05W.A00(), C02E.A00(), C002301c.A00(), C0DV.A00(), C010005b.A07, C000400f.A00(), C0EC.A00(), C011505r.A00(), C0E7.A00(), AnonymousClass075.A00(), C02F.A00(), C000500h.A00(), C06L.A00(), C012205z.A00, C0CA.A00(), C41401tr.A01(), C0DW.A00(), C41691uM.A00(), C06K.A00(), C469228u.A00(), C05G.A00(), C02O.A00(), C0KQ.A00(), C010605h.A03);
                }
            }
        }
        return A0S;
    }

    public static Collection A01(C468928r c468928r, Set set) {
        ArrayList arrayList = new ArrayList();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C06C A09 = c468928r.A08.A09((AbstractC005302j) it.next());
            if (A09 != null) {
                arrayList.add(A09);
            }
        }
        return arrayList;
    }

    public static void A02(C468928r c468928r, String str, RuntimeException runtimeException) {
        StringBuilder sb = new StringBuilder("ContactSyncRequestExecutor/");
        sb.append(str);
        Log.e(sb.toString(), runtimeException);
        c468928r.A01.A09(C000200d.A0H("ContactSyncRequestExecutor/", str), runtimeException.getMessage(), true);
    }

    public final synchronized Handler A03() {
        Handler handler;
        handler = this.A00;
        if (handler == null) {
            HandlerThread handlerThread = new HandlerThread("sync", 10);
            handlerThread.start();
            handler = new Handler(handlerThread.getLooper());
            this.A00 = handler;
        }
        return handler;
    }

    /* JADX WARN: Code restructure failed: missing block: B:198:0x00b0, code lost:
        if (r2.A07 == false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x00bc, code lost:
        if (r2.A08 == false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x00c8, code lost:
        if (r2.A06 != false) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x00ec, code lost:
        if (r2.A0A != false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x00f6, code lost:
        if (r2.A0D != false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x0100, code lost:
        if (r2.A0E != false) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x010a, code lost:
        if (r2.A09 != false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x0114, code lost:
        if (r2.A0B != false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x011f, code lost:
        if (r2.A0C != false) goto L123;
     */
    /* JADX WARN: Removed duplicated region for block: B:197:0x00ad A[Catch: all -> 0x0281, TryCatch #2 {, blocks: (B:156:0x0018, B:157:0x001a, B:159:0x001d, B:160:0x001e, B:161:0x0022, B:163:0x002a, B:165:0x0036, B:166:0x003b, B:168:0x004c, B:169:0x004d, B:175:0x006b, B:178:0x0076, B:181:0x0081, B:182:0x0088, B:184:0x008e, B:191:0x00a1, B:241:0x0146, B:242:0x0166, B:186:0x0092, B:188:0x009b, B:195:0x00a7, B:197:0x00ad, B:200:0x00b3, B:202:0x00b9, B:205:0x00bf, B:207:0x00c5, B:210:0x00cb, B:212:0x00e9, B:215:0x00ef, B:217:0x00f3, B:220:0x00f9, B:222:0x00fd, B:225:0x0103, B:227:0x0107, B:230:0x010d, B:232:0x0111, B:235:0x0117, B:237:0x011b, B:240:0x0123, B:249:0x0188, B:251:0x0191, B:252:0x019f, B:254:0x01a2, B:258:0x01ac, B:260:0x01d2, B:261:0x01d4, B:272:0x0223, B:273:0x0224, B:270:0x0221, B:274:0x0225, B:275:0x022e, B:279:0x024a, B:280:0x024b, B:281:0x0269, B:243:0x0167, B:244:0x0182, B:167:0x003c, B:262:0x01d5, B:264:0x01e1, B:269:0x0208, B:267:0x0203, B:276:0x022f, B:278:0x0247, B:158:0x001b), top: B:295:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x00b9 A[Catch: all -> 0x0281, TryCatch #2 {, blocks: (B:156:0x0018, B:157:0x001a, B:159:0x001d, B:160:0x001e, B:161:0x0022, B:163:0x002a, B:165:0x0036, B:166:0x003b, B:168:0x004c, B:169:0x004d, B:175:0x006b, B:178:0x0076, B:181:0x0081, B:182:0x0088, B:184:0x008e, B:191:0x00a1, B:241:0x0146, B:242:0x0166, B:186:0x0092, B:188:0x009b, B:195:0x00a7, B:197:0x00ad, B:200:0x00b3, B:202:0x00b9, B:205:0x00bf, B:207:0x00c5, B:210:0x00cb, B:212:0x00e9, B:215:0x00ef, B:217:0x00f3, B:220:0x00f9, B:222:0x00fd, B:225:0x0103, B:227:0x0107, B:230:0x010d, B:232:0x0111, B:235:0x0117, B:237:0x011b, B:240:0x0123, B:249:0x0188, B:251:0x0191, B:252:0x019f, B:254:0x01a2, B:258:0x01ac, B:260:0x01d2, B:261:0x01d4, B:272:0x0223, B:273:0x0224, B:270:0x0221, B:274:0x0225, B:275:0x022e, B:279:0x024a, B:280:0x024b, B:281:0x0269, B:243:0x0167, B:244:0x0182, B:167:0x003c, B:262:0x01d5, B:264:0x01e1, B:269:0x0208, B:267:0x0203, B:276:0x022f, B:278:0x0247, B:158:0x001b), top: B:295:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x00c5 A[Catch: all -> 0x0281, TryCatch #2 {, blocks: (B:156:0x0018, B:157:0x001a, B:159:0x001d, B:160:0x001e, B:161:0x0022, B:163:0x002a, B:165:0x0036, B:166:0x003b, B:168:0x004c, B:169:0x004d, B:175:0x006b, B:178:0x0076, B:181:0x0081, B:182:0x0088, B:184:0x008e, B:191:0x00a1, B:241:0x0146, B:242:0x0166, B:186:0x0092, B:188:0x009b, B:195:0x00a7, B:197:0x00ad, B:200:0x00b3, B:202:0x00b9, B:205:0x00bf, B:207:0x00c5, B:210:0x00cb, B:212:0x00e9, B:215:0x00ef, B:217:0x00f3, B:220:0x00f9, B:222:0x00fd, B:225:0x0103, B:227:0x0107, B:230:0x010d, B:232:0x0111, B:235:0x0117, B:237:0x011b, B:240:0x0123, B:249:0x0188, B:251:0x0191, B:252:0x019f, B:254:0x01a2, B:258:0x01ac, B:260:0x01d2, B:261:0x01d4, B:272:0x0223, B:273:0x0224, B:270:0x0221, B:274:0x0225, B:275:0x022e, B:279:0x024a, B:280:0x024b, B:281:0x0269, B:243:0x0167, B:244:0x0182, B:167:0x003c, B:262:0x01d5, B:264:0x01e1, B:269:0x0208, B:267:0x0203, B:276:0x022f, B:278:0x0247, B:158:0x001b), top: B:295:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:212:0x00e9 A[Catch: all -> 0x0281, TryCatch #2 {, blocks: (B:156:0x0018, B:157:0x001a, B:159:0x001d, B:160:0x001e, B:161:0x0022, B:163:0x002a, B:165:0x0036, B:166:0x003b, B:168:0x004c, B:169:0x004d, B:175:0x006b, B:178:0x0076, B:181:0x0081, B:182:0x0088, B:184:0x008e, B:191:0x00a1, B:241:0x0146, B:242:0x0166, B:186:0x0092, B:188:0x009b, B:195:0x00a7, B:197:0x00ad, B:200:0x00b3, B:202:0x00b9, B:205:0x00bf, B:207:0x00c5, B:210:0x00cb, B:212:0x00e9, B:215:0x00ef, B:217:0x00f3, B:220:0x00f9, B:222:0x00fd, B:225:0x0103, B:227:0x0107, B:230:0x010d, B:232:0x0111, B:235:0x0117, B:237:0x011b, B:240:0x0123, B:249:0x0188, B:251:0x0191, B:252:0x019f, B:254:0x01a2, B:258:0x01ac, B:260:0x01d2, B:261:0x01d4, B:272:0x0223, B:273:0x0224, B:270:0x0221, B:274:0x0225, B:275:0x022e, B:279:0x024a, B:280:0x024b, B:281:0x0269, B:243:0x0167, B:244:0x0182, B:167:0x003c, B:262:0x01d5, B:264:0x01e1, B:269:0x0208, B:267:0x0203, B:276:0x022f, B:278:0x0247, B:158:0x001b), top: B:295:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:217:0x00f3 A[Catch: all -> 0x0281, TryCatch #2 {, blocks: (B:156:0x0018, B:157:0x001a, B:159:0x001d, B:160:0x001e, B:161:0x0022, B:163:0x002a, B:165:0x0036, B:166:0x003b, B:168:0x004c, B:169:0x004d, B:175:0x006b, B:178:0x0076, B:181:0x0081, B:182:0x0088, B:184:0x008e, B:191:0x00a1, B:241:0x0146, B:242:0x0166, B:186:0x0092, B:188:0x009b, B:195:0x00a7, B:197:0x00ad, B:200:0x00b3, B:202:0x00b9, B:205:0x00bf, B:207:0x00c5, B:210:0x00cb, B:212:0x00e9, B:215:0x00ef, B:217:0x00f3, B:220:0x00f9, B:222:0x00fd, B:225:0x0103, B:227:0x0107, B:230:0x010d, B:232:0x0111, B:235:0x0117, B:237:0x011b, B:240:0x0123, B:249:0x0188, B:251:0x0191, B:252:0x019f, B:254:0x01a2, B:258:0x01ac, B:260:0x01d2, B:261:0x01d4, B:272:0x0223, B:273:0x0224, B:270:0x0221, B:274:0x0225, B:275:0x022e, B:279:0x024a, B:280:0x024b, B:281:0x0269, B:243:0x0167, B:244:0x0182, B:167:0x003c, B:262:0x01d5, B:264:0x01e1, B:269:0x0208, B:267:0x0203, B:276:0x022f, B:278:0x0247, B:158:0x001b), top: B:295:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:222:0x00fd A[Catch: all -> 0x0281, TryCatch #2 {, blocks: (B:156:0x0018, B:157:0x001a, B:159:0x001d, B:160:0x001e, B:161:0x0022, B:163:0x002a, B:165:0x0036, B:166:0x003b, B:168:0x004c, B:169:0x004d, B:175:0x006b, B:178:0x0076, B:181:0x0081, B:182:0x0088, B:184:0x008e, B:191:0x00a1, B:241:0x0146, B:242:0x0166, B:186:0x0092, B:188:0x009b, B:195:0x00a7, B:197:0x00ad, B:200:0x00b3, B:202:0x00b9, B:205:0x00bf, B:207:0x00c5, B:210:0x00cb, B:212:0x00e9, B:215:0x00ef, B:217:0x00f3, B:220:0x00f9, B:222:0x00fd, B:225:0x0103, B:227:0x0107, B:230:0x010d, B:232:0x0111, B:235:0x0117, B:237:0x011b, B:240:0x0123, B:249:0x0188, B:251:0x0191, B:252:0x019f, B:254:0x01a2, B:258:0x01ac, B:260:0x01d2, B:261:0x01d4, B:272:0x0223, B:273:0x0224, B:270:0x0221, B:274:0x0225, B:275:0x022e, B:279:0x024a, B:280:0x024b, B:281:0x0269, B:243:0x0167, B:244:0x0182, B:167:0x003c, B:262:0x01d5, B:264:0x01e1, B:269:0x0208, B:267:0x0203, B:276:0x022f, B:278:0x0247, B:158:0x001b), top: B:295:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0107 A[Catch: all -> 0x0281, TryCatch #2 {, blocks: (B:156:0x0018, B:157:0x001a, B:159:0x001d, B:160:0x001e, B:161:0x0022, B:163:0x002a, B:165:0x0036, B:166:0x003b, B:168:0x004c, B:169:0x004d, B:175:0x006b, B:178:0x0076, B:181:0x0081, B:182:0x0088, B:184:0x008e, B:191:0x00a1, B:241:0x0146, B:242:0x0166, B:186:0x0092, B:188:0x009b, B:195:0x00a7, B:197:0x00ad, B:200:0x00b3, B:202:0x00b9, B:205:0x00bf, B:207:0x00c5, B:210:0x00cb, B:212:0x00e9, B:215:0x00ef, B:217:0x00f3, B:220:0x00f9, B:222:0x00fd, B:225:0x0103, B:227:0x0107, B:230:0x010d, B:232:0x0111, B:235:0x0117, B:237:0x011b, B:240:0x0123, B:249:0x0188, B:251:0x0191, B:252:0x019f, B:254:0x01a2, B:258:0x01ac, B:260:0x01d2, B:261:0x01d4, B:272:0x0223, B:273:0x0224, B:270:0x0221, B:274:0x0225, B:275:0x022e, B:279:0x024a, B:280:0x024b, B:281:0x0269, B:243:0x0167, B:244:0x0182, B:167:0x003c, B:262:0x01d5, B:264:0x01e1, B:269:0x0208, B:267:0x0203, B:276:0x022f, B:278:0x0247, B:158:0x001b), top: B:295:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0111 A[Catch: all -> 0x0281, TryCatch #2 {, blocks: (B:156:0x0018, B:157:0x001a, B:159:0x001d, B:160:0x001e, B:161:0x0022, B:163:0x002a, B:165:0x0036, B:166:0x003b, B:168:0x004c, B:169:0x004d, B:175:0x006b, B:178:0x0076, B:181:0x0081, B:182:0x0088, B:184:0x008e, B:191:0x00a1, B:241:0x0146, B:242:0x0166, B:186:0x0092, B:188:0x009b, B:195:0x00a7, B:197:0x00ad, B:200:0x00b3, B:202:0x00b9, B:205:0x00bf, B:207:0x00c5, B:210:0x00cb, B:212:0x00e9, B:215:0x00ef, B:217:0x00f3, B:220:0x00f9, B:222:0x00fd, B:225:0x0103, B:227:0x0107, B:230:0x010d, B:232:0x0111, B:235:0x0117, B:237:0x011b, B:240:0x0123, B:249:0x0188, B:251:0x0191, B:252:0x019f, B:254:0x01a2, B:258:0x01ac, B:260:0x01d2, B:261:0x01d4, B:272:0x0223, B:273:0x0224, B:270:0x0221, B:274:0x0225, B:275:0x022e, B:279:0x024a, B:280:0x024b, B:281:0x0269, B:243:0x0167, B:244:0x0182, B:167:0x003c, B:262:0x01d5, B:264:0x01e1, B:269:0x0208, B:267:0x0203, B:276:0x022f, B:278:0x0247, B:158:0x001b), top: B:295:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:237:0x011b A[Catch: all -> 0x0281, TryCatch #2 {, blocks: (B:156:0x0018, B:157:0x001a, B:159:0x001d, B:160:0x001e, B:161:0x0022, B:163:0x002a, B:165:0x0036, B:166:0x003b, B:168:0x004c, B:169:0x004d, B:175:0x006b, B:178:0x0076, B:181:0x0081, B:182:0x0088, B:184:0x008e, B:191:0x00a1, B:241:0x0146, B:242:0x0166, B:186:0x0092, B:188:0x009b, B:195:0x00a7, B:197:0x00ad, B:200:0x00b3, B:202:0x00b9, B:205:0x00bf, B:207:0x00c5, B:210:0x00cb, B:212:0x00e9, B:215:0x00ef, B:217:0x00f3, B:220:0x00f9, B:222:0x00fd, B:225:0x0103, B:227:0x0107, B:230:0x010d, B:232:0x0111, B:235:0x0117, B:237:0x011b, B:240:0x0123, B:249:0x0188, B:251:0x0191, B:252:0x019f, B:254:0x01a2, B:258:0x01ac, B:260:0x01d2, B:261:0x01d4, B:272:0x0223, B:273:0x0224, B:270:0x0221, B:274:0x0225, B:275:0x022e, B:279:0x024a, B:280:0x024b, B:281:0x0269, B:243:0x0167, B:244:0x0182, B:167:0x003c, B:262:0x01d5, B:264:0x01e1, B:269:0x0208, B:267:0x0203, B:276:0x022f, B:278:0x0247, B:158:0x001b), top: B:295:0x0018 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A04(X.C468528n r19) {
        /*
            Method dump skipped, instructions count: 644
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C468928r.A04(X.28n):void");
    }

    @Override // X.C0EM
    public void AIL(boolean z) {
        if (z) {
            this.A0O.execute(new RunnableEBaseShape1S0100000_I0_1(this, 42));
        }
    }
}
