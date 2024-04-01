package X;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* renamed from: X.0TS */
/* loaded from: classes.dex */
public abstract class C0TS {
    public static final List A0I = Collections.emptyList();
    public int A00;
    public RecyclerView A0C;
    public WeakReference A0D;
    public final View A0H;
    public int A05 = -1;
    public int A03 = -1;
    public long A08 = -1;
    public int A02 = -1;
    public int A06 = -1;
    public C0TS A0A = null;
    public C0TS A0B = null;
    public List A0E = null;
    public List A0F = null;
    public int A01 = 0;
    public C15230oI A09 = null;
    public boolean A0G = false;
    public int A07 = 0;
    public int A04 = -1;

    public C0TS(View view) {
        if (view != null) {
            this.A0H = view;
            return;
        }
        throw new IllegalArgumentException("itemView may not be null");
    }

    public final int A00() {
        RecyclerView recyclerView = this.A0C;
        if (recyclerView == null) {
            return -1;
        }
        return recyclerView.A09(this);
    }

    public final int A01() {
        int i = this.A06;
        return i == -1 ? this.A05 : i;
    }

    public List A02() {
        if ((this.A00 & 1024) == 0) {
            List list = this.A0E;
            if (list != null && list.size() != 0) {
                return this.A0F;
            }
            return A0I;
        }
        return A0I;
    }

    public void A03() {
        this.A00 = 0;
        this.A05 = -1;
        this.A03 = -1;
        this.A08 = -1L;
        this.A06 = -1;
        this.A01 = 0;
        this.A0A = null;
        this.A0B = null;
        List list = this.A0E;
        if (list != null) {
            list.clear();
        }
        this.A00 &= -1025;
        this.A07 = 0;
        this.A04 = -1;
        RecyclerView.A04(this);
    }

    public void A04(int i) {
        this.A00 = i | this.A00;
    }

    public void A05(int i, int i2) {
        this.A00 = (i & i2) | (this.A00 & (i2 ^ (-1)));
    }

    public void A06(int i, boolean z) {
        if (this.A03 == -1) {
            this.A03 = this.A05;
        }
        int i2 = this.A06;
        if (i2 == -1) {
            i2 = this.A05;
            this.A06 = i2;
        }
        if (z) {
            this.A06 = i2 + i;
        }
        this.A05 += i;
        View view = this.A0H;
        if (view.getLayoutParams() != null) {
            ((C15170oC) view.getLayoutParams()).A01 = true;
        }
    }

    public final void A07(boolean z) {
        int i = this.A01;
        int i2 = z ? i - 1 : i + 1;
        this.A01 = i2;
        if (i2 < 0) {
            this.A01 = 0;
            StringBuilder sb = new StringBuilder("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ");
            sb.append(this);
            Log.e("View", sb.toString());
        } else if (z) {
            if (i2 != 0) {
                return;
            }
            this.A00 &= -17;
        } else if (i2 != 1) {
        } else {
            this.A00 |= 16;
        }
    }

    public boolean A08() {
        return (this.A00 & 4) != 0;
    }

    public boolean A09() {
        return (this.A00 & 8) != 0;
    }

    public boolean A0A() {
        return (this.A00 & 256) != 0;
    }

    public boolean A0B() {
        return (this.A00 & 128) != 0;
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("ViewHolder{");
        A0P.append(Integer.toHexString(hashCode()));
        A0P.append(" position=");
        A0P.append(this.A05);
        A0P.append(" id=");
        A0P.append(this.A08);
        A0P.append(", oldPos=");
        A0P.append(this.A03);
        A0P.append(", pLpos:");
        A0P.append(this.A06);
        StringBuilder sb = new StringBuilder(A0P.toString());
        if (this.A09 != null) {
            sb.append(" scrap ");
            sb.append(this.A0G ? "[changeScrap]" : "[attachedScrap]");
        }
        if (A08()) {
            sb.append(" invalid");
        }
        int i = this.A00;
        if ((1 & i) == 0) {
            sb.append(" unbound");
        }
        if ((i & 2) != 0) {
            sb.append(" update");
        }
        if (A09()) {
            sb.append(" removed");
        }
        if (A0B()) {
            sb.append(" ignored");
        }
        if (A0A()) {
            sb.append(" tmpDetached");
        }
        if ((i & 16) != 0 || this.A0H.hasTransientState()) {
            StringBuilder A0P2 = C000200d.A0P(" not recyclable(");
            A0P2.append(this.A01);
            A0P2.append(")");
            sb.append(A0P2.toString());
        }
        if ((this.A00 & 512) != 0 || A08()) {
            sb.append(" undefined adapter position");
        }
        if (this.A0H.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append("}");
        return sb.toString();
    }
}
