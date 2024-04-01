package X;

import android.view.Choreographer;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1WM  reason: invalid class name */
/* loaded from: classes.dex */
public class C1WM implements InterfaceC021309t {
    public final InterfaceC021309t A00;

    public C1WM(final InterfaceC021309t interfaceC021309t) {
        final InterfaceC021309t interfaceC021309t2 = new InterfaceC021309t(interfaceC021309t) { // from class: X.1WN
            public final InterfaceC021309t A00;

            {
                this.A00 = interfaceC021309t;
            }

            @Override // X.InterfaceC021309t
            public InterfaceC020509l A7h(C33971gl c33971gl, C021109r c021109r, final C021209s c021209s) {
                String str = c33971gl.A00;
                int hashCode = str.hashCode();
                if (hashCode != -600206934) {
                    if (hashCode != -512481856) {
                        if (hashCode == 1371463060 && str.equals("bk.action.animation.spring.SetEndValue")) {
                            ((C20350xO) AnonymousClass088.A0r(c021109r.A00(0))).A00(((Number) c021109r.A00(1)).floatValue());
                            return C0A6.A00;
                        }
                    } else if (str.equals("bk.action.animation.spring.Create")) {
                        final C020709n c020709n = ((C020609m) c021109r.A00(0)).A00;
                        C20380xR c20380xR = new C20380xR(new C1YT(Choreographer.getInstance()));
                        C20350xO c20350xO = new C20350xO(c20380xR);
                        Map map = c20380xR.A02;
                        String str2 = c20350xO.A0C;
                        if (!map.containsKey(str2)) {
                            map.put(str2, c20350xO);
                            ArrayList arrayList = new ArrayList();
                            InterfaceC020509l A0f = AnonymousClass088.A0f(c20350xO);
                            if (arrayList.size() == 0) {
                                arrayList.add(A0f);
                                final C021109r c021109r2 = new C021109r(arrayList);
                                c20350xO.A06.add(new C1YU() { // from class: X.1pN
                                    @Override // X.C1YU
                                    public void A01(C20350xO c20350xO2) {
                                        C25011Ds.A00(C09P.this, c021109r2, c021209s);
                                    }
                                });
                                return AnonymousClass088.A0f(c20350xO);
                            }
                            throw new IllegalArgumentException("arguments have to be continuous");
                        }
                        throw new IllegalArgumentException("spring is already registered");
                    }
                } else if (str.equals("bk.action.animation.spring.GetCurrentValue")) {
                    return new C020909p(((C20350xO) AnonymousClass088.A0r(c021109r.A00(0))).A08.A00);
                }
                return this.A00.A7h(c33971gl, c021109r, c021209s);
            }
        };
        this.A00 = new InterfaceC021309t(interfaceC021309t2) { // from class: X.1WL
            public static final long A01 = TimeUnit.SECONDS.toMillis(1);
            public final InterfaceC021309t A00;

            {
                this.A00 = interfaceC021309t2;
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
                if (r4.equals("bk.action.animated.Stagger") == false) goto L3;
             */
            /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
                if (r4.equals("bk.action.animated.easing.CreateCubicBezier") == false) goto L3;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x003f, code lost:
                if (r4.equals("bk.action.animated.Loop") == false) goto L3;
             */
            /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
                if (r4.equals("bk.action.animated.CreateColor") == false) goto L3;
             */
            /* JADX WARN: Code restructure failed: missing block: B:22:0x0055, code lost:
                if (r4.equals("bk.action.animated.GetCurrentDimensionValue") == false) goto L3;
             */
            /* JADX WARN: Code restructure failed: missing block: B:25:0x0060, code lost:
                if (r4.equals("bk.action.animated.GetCurrentColorValue") == false) goto L3;
             */
            /* JADX WARN: Code restructure failed: missing block: B:28:0x006b, code lost:
                if (r4.equals("bk.action.animated.CreateDimension") == false) goto L3;
             */
            /* JADX WARN: Code restructure failed: missing block: B:31:0x0075, code lost:
                if (r4.equals("bk.action.animated.Start") == false) goto L3;
             */
            /* JADX WARN: Code restructure failed: missing block: B:34:0x007f, code lost:
                if (r4.equals("bk.action.animated.Cancel") == false) goto L3;
             */
            /* JADX WARN: Code restructure failed: missing block: B:37:0x0089, code lost:
                if (r4.equals("bk.action.animated.Create") == false) goto L3;
             */
            /* JADX WARN: Code restructure failed: missing block: B:40:0x0093, code lost:
                if (r4.equals("bk.action.animated.Parallel") == false) goto L3;
             */
            /* JADX WARN: Code restructure failed: missing block: B:43:0x009e, code lost:
                if (r4.equals("bk.action.animated.Sequence") == false) goto L3;
             */
            /* JADX WARN: Code restructure failed: missing block: B:46:0x00a9, code lost:
                if (r4.equals("bk.action.animated.GetCurrentValue") == false) goto L3;
             */
            @Override // X.InterfaceC021309t
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public X.InterfaceC020509l A7h(X.C33971gl r16, X.C021109r r17, final X.C021209s r18) {
                /*
                    Method dump skipped, instructions count: 1080
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1WL.A7h(X.1gl, X.09r, X.09s):X.09l");
            }
        };
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
        if (r1.equals("bk.action.animation.linear.GetCurrentValue") == false) goto L3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
        if (r1.equals("bk.action.string.MatchesRegex") == false) goto L3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0040, code lost:
        if (r1.equals("commerce.action.GetCreditCardMetadata") == false) goto L3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
        if (r1.equals("bk.action.animation.linear.Cancel") == false) goto L3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0054, code lost:
        if (r1.equals("bk.action.animation.linear.Start") == false) goto L3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005e, code lost:
        if (r1.equals("bk.action.animation.linear.SetNewEndValue") == false) goto L3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0068, code lost:
        if (r1.equals("bk.action.core.Delay") == false) goto L3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0072, code lost:
        if (r1.equals("bk.action.animation.linear.CreateAnimation") == false) goto L3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007d, code lost:
        if (r1.equals("bk.action.array.Map") == false) goto L3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0086, code lost:
        if (r1.equals("bk.action.array.Filter") == false) goto L3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0091, code lost:
        if (r1.equals("bk.action.array.Concat") == false) goto L3;
     */
    @Override // X.InterfaceC021309t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.InterfaceC020509l A7h(X.C33971gl r16, X.C021109r r17, final X.C021209s r18) {
        /*
            Method dump skipped, instructions count: 818
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1WM.A7h(X.1gl, X.09r, X.09s):X.09l");
    }
}
