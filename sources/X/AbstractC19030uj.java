package X;

import java.io.Closeable;
import java.io.IOException;
import java.util.Map;
import java.util.logging.Level;

/* renamed from: X.0uj */
/* loaded from: classes.dex */
public abstract class AbstractC19030uj implements Closeable, Cloneable {
    public boolean A00 = false;
    public final InterfaceC19020ui A01;
    public final C19070un A02;
    public final Throwable A03;
    public static final InterfaceC19050ul A05 = new InterfaceC19050ul() { // from class: X.1XP
        @Override // X.InterfaceC19050ul
        public void ARD(Object obj) {
            Closeable closeable = (Closeable) obj;
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (IOException e) {
                    try {
                        C18920uY.A00.log(Level.WARNING, "IOException thrown while closing Closeable.", (Throwable) e);
                    } catch (IOException unused) {
                    }
                }
            }
        }
    };
    public static final InterfaceC19020ui A04 = new InterfaceC19020ui() { // from class: X.1XQ
        @Override // X.InterfaceC19020ui
        public boolean ARh() {
            return false;
        }

        @Override // X.InterfaceC19020ui
        public void ARa(C19070un c19070un, Throwable th) {
            C18960uc.A00.A00(5, AbstractC19030uj.class.getSimpleName(), String.format(null, "Finalized without closing: %x %x (type = %s)", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(c19070un)), c19070un.A00().getClass().getName()));
        }
    };

    /* renamed from: A03 */
    public abstract AbstractC19030uj clone();

    public AbstractC19030uj(C19070un c19070un, InterfaceC19020ui interfaceC19020ui, Throwable th) {
        if (c19070un != null) {
            this.A02 = c19070un;
            synchronized (c19070un) {
                c19070un.A01();
                c19070un.A00++;
            }
            this.A01 = interfaceC19020ui;
            this.A03 = th;
            return;
        }
        throw null;
    }

    public AbstractC19030uj(Object obj, InterfaceC19050ul interfaceC19050ul, InterfaceC19020ui interfaceC19020ui, Throwable th) {
        this.A02 = new C19070un(obj, interfaceC19050ul);
        this.A01 = interfaceC19020ui;
        this.A03 = th;
    }

    public static AbstractC19030uj A00(AbstractC19030uj abstractC19030uj) {
        if (abstractC19030uj != null) {
            synchronized (abstractC19030uj) {
                if (abstractC19030uj.A05()) {
                    return abstractC19030uj.clone();
                }
                return null;
            }
        }
        return null;
    }

    public static AbstractC19030uj A01(Object obj, InterfaceC19050ul interfaceC19050ul, InterfaceC19020ui interfaceC19020ui) {
        if (obj == null) {
            return null;
        }
        return new C1XR(obj, interfaceC19050ul, interfaceC19020ui, interfaceC19020ui.ARh() ? new Throwable() : null);
    }

    public static boolean A02(AbstractC19030uj abstractC19030uj) {
        return abstractC19030uj != null && abstractC19030uj.A05();
    }

    public synchronized Object A04() {
        C07K.A1Z(this.A00 ? false : true);
        return this.A02.A00();
    }

    public synchronized boolean A05() {
        return !this.A00;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        int i;
        Object obj;
        synchronized (this) {
            if (this.A00) {
                return;
            }
            this.A00 = true;
            C19070un c19070un = this.A02;
            synchronized (c19070un) {
                c19070un.A01();
                C07K.A1X(c19070un.A00 > 0);
                i = c19070un.A00 - 1;
                c19070un.A00 = i;
            }
            if (i == 0) {
                synchronized (c19070un) {
                    obj = c19070un.A01;
                    c19070un.A01 = null;
                }
                c19070un.A02.ARD(obj);
                Map map = C19070un.A03;
                synchronized (map) {
                    Integer num = (Integer) map.get(obj);
                    if (num == null) {
                        C18960uc.A00("SharedReference", "No entry in sLiveObjects for value of type %s", obj.getClass());
                    } else {
                        int intValue = num.intValue();
                        if (intValue == 1) {
                            map.remove(obj);
                        } else {
                            map.put(obj, Integer.valueOf(intValue - 1));
                        }
                    }
                }
            }
        }
    }

    public void finalize() {
        boolean z;
        try {
            synchronized (this) {
                z = this.A00;
            }
            if (z) {
                return;
            }
            this.A01.ARa(this.A02, this.A03);
            close();
        } finally {
            super.finalize();
        }
    }
}
