package X;

import android.os.Bundle;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: X.31g */
/* loaded from: classes2.dex */
public final class C638931g extends AnonymousClass038 {
    public int A00 = -1;
    public int A01 = -1;

    public void A02() {
        Log.i("gdrive-service/backup-cancelled");
        this.A00 = 0;
        synchronized (super.A00) {
            Iterator it = super.A00.iterator();
            while (true) {
                C0G5 c0g5 = (C0G5) it;
                if (c0g5.hasNext()) {
                    ((InterfaceC470229f) c0g5.next()).AHk();
                }
            }
        }
    }

    public void A03() {
        Log.i("gdrive-service/notify-media-restore-cancelled");
        this.A01 = -1;
        synchronized (super.A00) {
            Iterator it = super.A00.iterator();
            while (true) {
                C0G5 c0g5 = (C0G5) it;
                if (c0g5.hasNext()) {
                    ((InterfaceC470229f) c0g5.next()).ALq();
                }
            }
        }
    }

    public void A04() {
        this.A01 = 0;
        synchronized (super.A00) {
            Iterator it = super.A00.iterator();
            while (true) {
                C0G5 c0g5 = (C0G5) it;
                if (c0g5.hasNext()) {
                    ((InterfaceC470229f) c0g5.next()).ALy();
                }
            }
        }
    }

    public void A05() {
        synchronized (super.A00) {
            Iterator it = super.A00.iterator();
            while (true) {
                C0G5 c0g5 = (C0G5) it;
                if (c0g5.hasNext()) {
                    ((InterfaceC470229f) c0g5.next()).AQ8();
                }
            }
        }
    }

    public void A06(int i, Bundle bundle) {
        synchronized (super.A00) {
            Iterator it = super.A00.iterator();
            while (true) {
                C0G5 c0g5 = (C0G5) it;
                if (c0g5.hasNext()) {
                    ((InterfaceC470229f) c0g5.next()).AK1(i, bundle);
                }
            }
        }
    }

    public void A07(int i, Bundle bundle) {
        synchronized (super.A00) {
            Iterator it = super.A00.iterator();
            while (true) {
                C0G5 c0g5 = (C0G5) it;
                if (c0g5.hasNext()) {
                    ((InterfaceC470229f) c0g5.next()).AK2(i, bundle);
                }
            }
        }
    }

    public void A08(long j, long j2) {
        synchronized (super.A00) {
            Iterator it = super.A00.iterator();
            while (true) {
                C0G5 c0g5 = (C0G5) it;
                if (c0g5.hasNext()) {
                    ((InterfaceC470229f) c0g5.next()).AHo(j, j2);
                }
            }
        }
    }

    public void A09(long j, long j2) {
        synchronized (super.A00) {
            Iterator it = super.A00.iterator();
            while (true) {
                C0G5 c0g5 = (C0G5) it;
                if (c0g5.hasNext()) {
                    ((InterfaceC470229f) c0g5.next()).AHp(j, j2);
                }
            }
        }
    }

    public void A0A(long j, long j2) {
        int i;
        if (j2 > 0) {
            i = (int) ((100 * j) / j2);
        } else {
            i = -1;
        }
        if (j2 <= 0) {
            C000200d.A1I(C000200d.A0S("gdrive-service/backup-preparation-progress ", j, "/"), j2);
        }
        if (i != this.A00) {
            this.A00 = i;
            StringBuilder sb = new StringBuilder("gdrive-service/backup-preparation-progress/");
            sb.append(i);
            sb.append("%");
            Log.i(sb.toString());
            synchronized (super.A00) {
                Iterator it = super.A00.iterator();
                while (true) {
                    C0G5 c0g5 = (C0G5) it;
                    if (c0g5.hasNext()) {
                        ((InterfaceC470229f) c0g5.next()).AHr(this.A00);
                    }
                }
            }
        }
    }

    public void A0B(long j, long j2) {
        synchronized (super.A00) {
            Iterator it = super.A00.iterator();
            while (true) {
                C0G5 c0g5 = (C0G5) it;
                if (c0g5.hasNext()) {
                    ((InterfaceC470229f) c0g5.next()).AHt(j, j2);
                }
            }
        }
    }

    public void A0C(long j, long j2) {
        synchronized (super.A00) {
            Iterator it = super.A00.iterator();
            while (true) {
                C0G5 c0g5 = (C0G5) it;
                if (c0g5.hasNext()) {
                    ((InterfaceC470229f) c0g5.next()).ALs(j, j2);
                }
            }
        }
    }

    public void A0D(long j, long j2) {
        synchronized (super.A00) {
            Iterator it = super.A00.iterator();
            while (true) {
                C0G5 c0g5 = (C0G5) it;
                if (c0g5.hasNext()) {
                    ((InterfaceC470229f) c0g5.next()).ALu(j, j2);
                }
            }
        }
    }

    public void A0E(long j, long j2) {
        synchronized (super.A00) {
            Iterator it = super.A00.iterator();
            while (true) {
                C0G5 c0g5 = (C0G5) it;
                if (c0g5.hasNext()) {
                    ((InterfaceC470229f) c0g5.next()).ALv(j, j2);
                }
            }
        }
    }

    public void A0F(long j, long j2) {
        synchronized (super.A00) {
            Iterator it = super.A00.iterator();
            while (true) {
                C0G5 c0g5 = (C0G5) it;
                if (c0g5.hasNext()) {
                    ((InterfaceC470229f) c0g5.next()).ALw(j, j2);
                }
            }
        }
    }

    public void A0G(long j, long j2, long j3) {
        synchronized (super.A00) {
            Iterator it = super.A00.iterator();
            while (true) {
                C0G5 c0g5 = (C0G5) it;
                if (c0g5.hasNext()) {
                    ((InterfaceC470229f) c0g5.next()).ALz(j, j2, j3);
                }
            }
        }
    }

    public void A0H(boolean z) {
        synchronized (super.A00) {
            Iterator it = super.A00.iterator();
            while (true) {
                C0G5 c0g5 = (C0G5) it;
                if (c0g5.hasNext()) {
                    ((InterfaceC470229f) c0g5.next()).AGu(z);
                }
            }
        }
    }

    public void A0I(boolean z) {
        C000200d.A1C("gdrive-service/backup-end/success/", z);
        this.A00 = 0;
        synchronized (super.A00) {
            Iterator it = super.A00.iterator();
            while (true) {
                C0G5 c0g5 = (C0G5) it;
                if (c0g5.hasNext()) {
                    ((InterfaceC470229f) c0g5.next()).AHl(z);
                }
            }
        }
    }

    public void A0J(boolean z) {
        synchronized (super.A00) {
            Iterator it = super.A00.iterator();
            while (true) {
                C0G5 c0g5 = (C0G5) it;
                if (c0g5.hasNext()) {
                    ((InterfaceC470229f) c0g5.next()).AMC(z);
                }
            }
        }
    }

    public void A0K(boolean z, long j, long j2) {
        Locale locale = Locale.ENGLISH;
        Object[] objArr = new Object[3];
        objArr[0] = z ? "successful" : "failed";
        objArr[1] = Long.valueOf(j);
        objArr[2] = Long.valueOf(j2);
        String.format(locale, "gdrive-service/notify-media-restore-end result:%s failed:%d total:%d", objArr);
        this.A01 = -1;
        synchronized (super.A00) {
            Iterator it = super.A00.iterator();
            while (true) {
                C0G5 c0g5 = (C0G5) it;
                if (c0g5.hasNext()) {
                    ((InterfaceC470229f) c0g5.next()).ALr(z, j, j2);
                }
            }
        }
    }
}
