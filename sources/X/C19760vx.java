package X;

import android.graphics.Bitmap;
import android.os.Build;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* renamed from: X.0vx  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C19760vx {
    public C19010uh A00;
    public InterfaceC39071pW A01;
    public C19690vq A02;
    public C24751Cs A03;
    public AbstractC24731Cq A04;
    public AbstractC24731Cq A05;
    public AbstractC24731Cq A06;
    public C19720vt A07;
    public final C19750vw A08;

    public C19760vx(C19750vw c19750vw) {
        this.A08 = c19750vw;
    }

    public InterfaceC39071pW A00() {
        InterfaceC39071pW interfaceC39071pW = this.A01;
        if (interfaceC39071pW == null) {
            C19750vw c19750vw = this.A08;
            switch ("legacy".hashCode()) {
                case -1868884870:
                    if ("legacy".equals("legacy_default_params")) {
                        C24781Cv c24781Cv = new C24781Cv(c19750vw.A01, C19670vo.A00(), c19750vw.A06);
                        this.A01 = c24781Cv;
                        return c24781Cv;
                    }
                    break;
                case -404562712:
                    if ("legacy".equals("experimental")) {
                        final C1Y9 A00 = C1Y9.A00();
                        InterfaceC39071pW interfaceC39071pW2 = new InterfaceC39071pW(A00) { // from class: X.1Cr
                            public int A00;
                            public final InterfaceC19780vz A03;
                            public final AbstractC19700vr A02 = new AbstractC19700vr() { // from class: X.1Y4
                                public static boolean A00(Bitmap bitmap) {
                                    if (bitmap == null) {
                                        return false;
                                    }
                                    if (bitmap.isRecycled()) {
                                        C18960uc.A00("BitmapPoolBackend", "Cannot reuse a recycled bitmap: %s", bitmap);
                                        return false;
                                    } else if (bitmap.isMutable()) {
                                        return true;
                                    } else {
                                        C18960uc.A00("BitmapPoolBackend", "Cannot reuse an immutable bitmap: %s", bitmap);
                                        return false;
                                    }
                                }

                                @Override // X.AbstractC19700vr
                                public int A01(Object obj) {
                                    return C0w6.A01((Bitmap) obj);
                                }

                                @Override // X.AbstractC19700vr
                                public Object A02(int i) {
                                    Bitmap bitmap = (Bitmap) super.A02(i);
                                    if (bitmap == null || !A00(bitmap)) {
                                        return null;
                                    }
                                    bitmap.eraseColor(0);
                                    return bitmap;
                                }

                                @Override // X.AbstractC19700vr
                                public void A03(Object obj) {
                                    Bitmap bitmap = (Bitmap) obj;
                                    if (A00(bitmap)) {
                                        super.A03(bitmap);
                                    }
                                }
                            };
                            public int A01 = 4194304;

                            {
                                this.A03 = A00;
                            }

                            @Override // X.C1XO, X.InterfaceC19050ul
                            public void ARD(Object obj) {
                                AbstractC19700vr abstractC19700vr = this.A02;
                                int A01 = abstractC19700vr.A01(obj);
                                if (A01 <= this.A01) {
                                    abstractC19700vr.A03(obj);
                                    synchronized (this) {
                                        this.A00 += A01;
                                    }
                                }
                            }

                            @Override // X.C1XO
                            public Object get(int i) {
                                Object pollLast;
                                synchronized (this) {
                                    int i2 = this.A00;
                                    if (i2 > 0) {
                                        while (i2 > 0) {
                                            AbstractC19700vr abstractC19700vr = this.A02;
                                            C19660vn c19660vn = abstractC19700vr.A00;
                                            synchronized (c19660vn) {
                                                C19650vm c19650vm = c19660vn.A01;
                                                if (c19650vm == null) {
                                                    pollLast = null;
                                                } else {
                                                    pollLast = c19650vm.A03.pollLast();
                                                    if (c19650vm.A03.isEmpty()) {
                                                        c19660vn.A00(c19650vm);
                                                        c19660vn.A02.remove(c19650vm.A00);
                                                    }
                                                }
                                            }
                                            if (pollLast != null) {
                                                synchronized (abstractC19700vr) {
                                                    abstractC19700vr.A01.remove(pollLast);
                                                }
                                            }
                                            Bitmap bitmap = (Bitmap) pollLast;
                                            if (bitmap == null) {
                                                break;
                                            }
                                            i2 = this.A00 - abstractC19700vr.A01(bitmap);
                                            this.A00 = i2;
                                        }
                                    }
                                    AbstractC19700vr abstractC19700vr2 = this.A02;
                                    Bitmap bitmap2 = (Bitmap) abstractC19700vr2.A02(i);
                                    if (bitmap2 != null) {
                                        this.A00 -= abstractC19700vr2.A01(bitmap2);
                                        return bitmap2;
                                    }
                                    return Bitmap.createBitmap(1, i, Bitmap.Config.ALPHA_8);
                                }
                            }
                        };
                        this.A01 = interfaceC39071pW2;
                        return interfaceC39071pW2;
                    }
                    break;
                case -402149703:
                    if ("legacy".equals("dummy_with_tracking")) {
                        InterfaceC39071pW interfaceC39071pW3 = new InterfaceC39071pW() { // from class: X.1Ct
                            public final Set A00 = Collections.newSetFromMap(new IdentityHashMap());

                            @Override // X.C1XO, X.InterfaceC19050ul
                            public void ARD(Object obj) {
                                Bitmap bitmap = (Bitmap) obj;
                                if (bitmap != null) {
                                    this.A00.remove(bitmap);
                                    bitmap.recycle();
                                    return;
                                }
                                throw null;
                            }

                            @Override // X.C1XO
                            public Object get(int i) {
                                Bitmap createBitmap = Bitmap.createBitmap(1, (int) Math.ceil(i / 2.0d), Bitmap.Config.RGB_565);
                                this.A00.add(createBitmap);
                                return createBitmap;
                            }
                        };
                        this.A01 = interfaceC39071pW3;
                        return interfaceC39071pW3;
                    }
                    break;
                case 95945896:
                    if ("legacy".equals("dummy")) {
                        InterfaceC39071pW interfaceC39071pW4 = new InterfaceC39071pW() { // from class: X.1Cu
                            @Override // X.C1XO, X.InterfaceC19050ul
                            public void ARD(Object obj) {
                                Bitmap bitmap = (Bitmap) obj;
                                if (bitmap != null) {
                                    bitmap.recycle();
                                    return;
                                }
                                throw null;
                            }

                            @Override // X.C1XO
                            public Object get(int i) {
                                return Bitmap.createBitmap(1, (int) Math.ceil(i / 2.0d), Bitmap.Config.RGB_565);
                            }
                        };
                        this.A01 = interfaceC39071pW4;
                        return interfaceC39071pW4;
                    }
                    break;
            }
            if (Build.VERSION.SDK_INT >= 21) {
                C24781Cv c24781Cv2 = new C24781Cv(c19750vw.A01, c19750vw.A02, c19750vw.A06);
                this.A01 = c24781Cv2;
                return c24781Cv2;
            }
            InterfaceC39071pW interfaceC39071pW5 = new InterfaceC39071pW() { // from class: X.1Cu
                @Override // X.C1XO, X.InterfaceC19050ul
                public void ARD(Object obj) {
                    Bitmap bitmap = (Bitmap) obj;
                    if (bitmap != null) {
                        bitmap.recycle();
                        return;
                    }
                    throw null;
                }

                @Override // X.C1XO
                public Object get(int i) {
                    return Bitmap.createBitmap(1, (int) Math.ceil(i / 2.0d), Bitmap.Config.RGB_565);
                }
            };
            this.A01 = interfaceC39071pW5;
            return interfaceC39071pW5;
        }
        return interfaceC39071pW;
    }

    public final AbstractC24731Cq A01(int i) {
        if (i == 0) {
            AbstractC24731Cq abstractC24731Cq = this.A06;
            if (abstractC24731Cq == null) {
                try {
                    Constructor<?> constructor = Class.forName("com.facebook.imagepipeline.memory.NativeMemoryChunkPool").getConstructor(InterfaceC18980ue.class, C19770vy.class, InterfaceC19780vz.class);
                    C19750vw c19750vw = this.A08;
                    AbstractC24731Cq abstractC24731Cq2 = (AbstractC24731Cq) constructor.newInstance(c19750vw.A01, c19750vw.A04, c19750vw.A07);
                    this.A06 = abstractC24731Cq2;
                    return abstractC24731Cq2;
                } catch (ClassNotFoundException e) {
                    C18960uc.A01(e);
                    this.A06 = null;
                    return null;
                } catch (IllegalAccessException e2) {
                    C18960uc.A01(e2);
                    this.A06 = null;
                    return null;
                } catch (InstantiationException e3) {
                    C18960uc.A01(e3);
                    this.A06 = null;
                    return null;
                } catch (NoSuchMethodException e4) {
                    C18960uc.A01(e4);
                    this.A06 = null;
                    return null;
                } catch (InvocationTargetException e5) {
                    C18960uc.A01(e5);
                    this.A06 = null;
                    return null;
                }
            }
            return abstractC24731Cq;
        } else if (i == 1) {
            AbstractC24731Cq abstractC24731Cq3 = this.A05;
            if (abstractC24731Cq3 == null) {
                try {
                    Constructor<?> constructor2 = Class.forName("com.facebook.imagepipeline.memory.BufferMemoryChunkPool").getConstructor(InterfaceC18980ue.class, C19770vy.class, InterfaceC19780vz.class);
                    C19750vw c19750vw2 = this.A08;
                    AbstractC24731Cq abstractC24731Cq4 = (AbstractC24731Cq) constructor2.newInstance(c19750vw2.A01, c19750vw2.A04, c19750vw2.A07);
                    this.A05 = abstractC24731Cq4;
                    return abstractC24731Cq4;
                } catch (ClassNotFoundException unused) {
                    this.A05 = null;
                    return null;
                } catch (IllegalAccessException unused2) {
                    this.A05 = null;
                    return null;
                } catch (InstantiationException unused3) {
                    this.A05 = null;
                    return null;
                } catch (NoSuchMethodException unused4) {
                    this.A05 = null;
                    return null;
                } catch (InvocationTargetException unused5) {
                    this.A05 = null;
                    return null;
                }
            }
            return abstractC24731Cq3;
        } else if (i == 2) {
            AbstractC24731Cq abstractC24731Cq5 = this.A04;
            if (abstractC24731Cq5 == null) {
                try {
                    Constructor<?> constructor3 = Class.forName("com.facebook.imagepipeline.memory.AshmemMemoryChunkPool").getConstructor(InterfaceC18980ue.class, C19770vy.class, InterfaceC19780vz.class);
                    C19750vw c19750vw3 = this.A08;
                    AbstractC24731Cq abstractC24731Cq6 = (AbstractC24731Cq) constructor3.newInstance(c19750vw3.A01, c19750vw3.A04, c19750vw3.A07);
                    this.A04 = abstractC24731Cq6;
                    return abstractC24731Cq6;
                } catch (ClassNotFoundException unused6) {
                    this.A04 = null;
                    return null;
                } catch (IllegalAccessException unused7) {
                    this.A04 = null;
                    return null;
                } catch (InstantiationException unused8) {
                    this.A04 = null;
                    return null;
                } catch (NoSuchMethodException unused9) {
                    this.A04 = null;
                    return null;
                } catch (InvocationTargetException unused10) {
                    this.A04 = null;
                    return null;
                }
            }
            return abstractC24731Cq5;
        } else {
            throw new IllegalArgumentException("Invalid MemoryChunkType");
        }
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [X.0uh] */
    public C19720vt A02() {
        int i = !C19540vb.A00 ? 1 : 0;
        C19720vt c19720vt = this.A07;
        if (c19720vt == null) {
            AbstractC24731Cq A01 = A01(i);
            String A0D = C000200d.A0D("failed to get pool for chunk type: ", i);
            if (A01 != null) {
                AbstractC24731Cq A012 = A01(i);
                if (this.A00 == null) {
                    if (this.A03 == null) {
                        C19750vw c19750vw = this.A08;
                        this.A03 = new C24751Cs(c19750vw.A01, c19750vw.A05, c19750vw.A08);
                    }
                    this.A00 = new Object() { // from class: X.0uh
                        {
                            C07K.A1X(true);
                        }
                    };
                }
                C19720vt c19720vt2 = new C19720vt(A012);
                this.A07 = c19720vt2;
                return c19720vt2;
            }
            throw new NullPointerException(String.valueOf(A0D));
        }
        return c19720vt;
    }
}
