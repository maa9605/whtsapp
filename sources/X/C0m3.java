package X;

import android.os.Bundle;
import android.os.Looper;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.HashMap;

/* renamed from: X.0m3  reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0m3 {
    public abstract C13930m5 A01(int i, Bundle bundle, C0HQ c0hq);

    public abstract C13930m5 A02(int i, Bundle bundle, C0HQ c0hq);

    public abstract void A03();

    public abstract void A04(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public static C0m3 A00(final InterfaceC02360Aw interfaceC02360Aw) {
        final C0VW ADv = ((InterfaceC02380Ay) interfaceC02360Aw).ADv();
        return new C0m3(interfaceC02360Aw, ADv) { // from class: X.1Tg
            public final InterfaceC02360Aw A00;
            public final C28691Tf A01;

            {
                this.A00 = interfaceC02360Aw;
                C0CR c0cr = C28691Tf.A02;
                String canonicalName = C28691Tf.class.getCanonicalName();
                if (canonicalName != null) {
                    String A0H = C000200d.A0H("androidx.lifecycle.ViewModelProvider.DefaultKey:", canonicalName);
                    HashMap hashMap = ADv.A00;
                    C0MU c0mu = (C0MU) hashMap.get(A0H);
                    if (C28691Tf.class.isInstance(c0mu)) {
                        if (c0cr instanceof C0VY) {
                            ((C0VY) c0cr).A00(c0mu);
                        }
                    } else {
                        if (c0cr instanceof C0VX) {
                            c0mu = ((C0VX) c0cr).A01(A0H, C28691Tf.class);
                        } else {
                            c0mu = ((C28681Te) c0cr).A6e(C28691Tf.class);
                        }
                        C0MU c0mu2 = (C0MU) hashMap.put(A0H, c0mu);
                        if (c0mu2 != null) {
                            c0mu2.A01();
                        }
                    }
                    this.A01 = (C28691Tf) c0mu;
                    return;
                }
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            }

            @Override // X.C0m3
            public C13930m5 A01(int i, Bundle bundle, C0HQ c0hq) {
                C28691Tf c28691Tf = this.A01;
                if (!c28691Tf.A01) {
                    if (Looper.getMainLooper() == Looper.myLooper()) {
                        C38531oO c38531oO = (C38531oO) c28691Tf.A00.A02(i, null);
                        if (c38531oO == null) {
                            return A05(i, null, c0hq, null);
                        }
                        InterfaceC02360Aw interfaceC02360Aw2 = this.A00;
                        C13930m5 c13930m5 = c38531oO.A05;
                        C28671Td c28671Td = new C28671Td(c13930m5, c0hq);
                        c38531oO.A05(interfaceC02360Aw2, c28671Td);
                        C28671Td c28671Td2 = c38531oO.A01;
                        if (c28671Td2 != null) {
                            c38531oO.A09(c28671Td2);
                        }
                        c38531oO.A00 = interfaceC02360Aw2;
                        c38531oO.A01 = c28671Td;
                        return c13930m5;
                    }
                    throw new IllegalStateException("initLoader must be called on the main thread");
                }
                throw new IllegalStateException("Called while creating a loader");
            }

            @Override // X.C0m3
            public C13930m5 A02(int i, Bundle bundle, C0HQ c0hq) {
                C28691Tf c28691Tf = this.A01;
                if (!c28691Tf.A01) {
                    if (Looper.getMainLooper() == Looper.myLooper()) {
                        C38531oO c38531oO = (C38531oO) c28691Tf.A00.A02(i, null);
                        return A05(i, bundle, c0hq, c38531oO != null ? c38531oO.A0C(false) : null);
                    }
                    throw new IllegalStateException("restartLoader must be called on the main thread");
                }
                throw new IllegalStateException("Called while creating a loader");
            }

            @Override // X.C0m3
            public void A03() {
                C28691Tf c28691Tf = this.A01;
                int A00 = c28691Tf.A00.A00();
                for (int i = 0; i < A00; i++) {
                    C07270Xo c07270Xo = c28691Tf.A00;
                    if (c07270Xo.A01) {
                        c07270Xo.A03();
                    }
                    ((C38531oO) c07270Xo.A03[i]).A0D();
                }
            }

            @Override // X.C0m3
            public void A04(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
                C28691Tf c28691Tf = this.A01;
                if (c28691Tf.A00.A00() > 0) {
                    printWriter.print(str);
                    printWriter.println("Loaders:");
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append("    ");
                    String obj = sb.toString();
                    int i = 0;
                    while (true) {
                        C07270Xo c07270Xo = c28691Tf.A00;
                        if (i < c07270Xo.A00()) {
                            if (c07270Xo.A01) {
                                c07270Xo.A03();
                            }
                            C38531oO c38531oO = (C38531oO) c07270Xo.A03[i];
                            printWriter.print(str);
                            printWriter.print("  #");
                            C07270Xo c07270Xo2 = c28691Tf.A00;
                            if (c07270Xo2.A01) {
                                c07270Xo2.A03();
                            }
                            printWriter.print(c07270Xo2.A02[i]);
                            printWriter.print(": ");
                            printWriter.println(c38531oO.toString());
                            printWriter.print(obj);
                            printWriter.print("mId=");
                            printWriter.print(c38531oO.A03);
                            printWriter.print(" mArgs=");
                            printWriter.println(c38531oO.A04);
                            printWriter.print(obj);
                            printWriter.print("mLoader=");
                            C13930m5 c13930m5 = c38531oO.A05;
                            printWriter.println(c13930m5);
                            c13930m5.A05(C000200d.A0H(obj, "  "), fileDescriptor, printWriter, strArr);
                            if (c38531oO.A01 != null) {
                                printWriter.print(obj);
                                printWriter.print("mCallbacks=");
                                printWriter.println(c38531oO.A01);
                                C28671Td c28671Td = c38531oO.A01;
                                String A0H = C000200d.A0H(obj, "  ");
                                if (c28671Td != null) {
                                    printWriter.print(A0H);
                                    printWriter.print("mDeliveredData=");
                                    printWriter.println(c28671Td.A00);
                                } else {
                                    throw null;
                                }
                            }
                            printWriter.print(obj);
                            printWriter.print("mData=");
                            Object A01 = c38531oO.A01();
                            StringBuilder sb2 = new StringBuilder(64);
                            C07O.A0v(A01, sb2);
                            sb2.append("}");
                            printWriter.println(sb2.toString());
                            printWriter.print(obj);
                            printWriter.print("mStarted=");
                            boolean z = false;
                            if (((C0HL) c38531oO).A00 > 0) {
                                z = true;
                            }
                            printWriter.println(z);
                            i++;
                        } else {
                            return;
                        }
                    }
                }
            }

            public final C13930m5 A05(int i, Bundle bundle, C0HQ c0hq, C13930m5 c13930m5) {
                try {
                    C28691Tf c28691Tf = this.A01;
                    c28691Tf.A01 = true;
                    C13930m5 AJ7 = c0hq.AJ7(i, bundle);
                    if (AJ7 != null) {
                        Class<?> cls = AJ7.getClass();
                        if (cls.isMemberClass() && !Modifier.isStatic(cls.getModifiers())) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Object returned from onCreateLoader must not be a non-static inner member class: ");
                            sb.append(AJ7);
                            throw new IllegalArgumentException(sb.toString());
                        }
                        C38531oO c38531oO = new C38531oO(i, bundle, AJ7, c13930m5);
                        c28691Tf.A00.A05(i, c38531oO);
                        c28691Tf.A01 = false;
                        InterfaceC02360Aw interfaceC02360Aw2 = this.A00;
                        C13930m5 c13930m52 = c38531oO.A05;
                        C28671Td c28671Td = new C28671Td(c13930m52, c0hq);
                        c38531oO.A05(interfaceC02360Aw2, c28671Td);
                        C28671Td c28671Td2 = c38531oO.A01;
                        if (c28671Td2 != null) {
                            c38531oO.A09(c28671Td2);
                        }
                        c38531oO.A00 = interfaceC02360Aw2;
                        c38531oO.A01 = c28671Td;
                        return c13930m52;
                    }
                    throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
                } catch (Throwable th) {
                    this.A01.A01 = false;
                    throw th;
                }
            }

            public String toString() {
                StringBuilder sb = new StringBuilder(128);
                sb.append("LoaderManager{");
                sb.append(Integer.toHexString(System.identityHashCode(this)));
                sb.append(" in ");
                C07O.A0v(this.A00, sb);
                sb.append("}}");
                return sb.toString();
            }
        };
    }
}
