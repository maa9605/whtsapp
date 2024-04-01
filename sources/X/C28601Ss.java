package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1Ss */
/* loaded from: classes.dex */
public class C28601Ss implements InterfaceC12230j4 {
    public int A00;
    public int A02;
    public AbstractC28611St A06;
    public InterfaceC12230j4 A03 = null;
    public boolean A09 = false;
    public boolean A0A = false;
    public EnumC12250j6 A04 = EnumC12250j6.UNKNOWN;
    public int A01 = 1;
    public C38441o9 A05 = null;
    public boolean A0B = false;
    public List A07 = new ArrayList();
    public List A08 = new ArrayList();

    public C28601Ss(AbstractC28611St abstractC28611St) {
        this.A06 = abstractC28611St;
    }

    public void A00() {
        this.A08.clear();
        this.A07.clear();
        this.A0B = false;
        this.A02 = 0;
        this.A0A = false;
        this.A09 = false;
    }

    public void A01(int i) {
        if (this.A0B) {
            return;
        }
        this.A0B = true;
        this.A02 = i;
        for (InterfaceC12230j4 interfaceC12230j4 : this.A07) {
            interfaceC12230j4.AVk(interfaceC12230j4);
        }
    }

    @Override // X.InterfaceC12230j4
    public void AVk(InterfaceC12230j4 interfaceC12230j4) {
        for (C28601Ss c28601Ss : this.A08) {
            if (!c28601Ss.A0B) {
                return;
            }
        }
        this.A0A = true;
        InterfaceC12230j4 interfaceC12230j42 = this.A03;
        if (interfaceC12230j42 != null) {
            interfaceC12230j42.AVk(this);
        }
        if (this.A09) {
            this.A06.AVk(this);
            return;
        }
        C28601Ss c28601Ss2 = null;
        int i = 0;
        for (C28601Ss c28601Ss3 : this.A08) {
            if (!(c28601Ss3 instanceof C38441o9)) {
                i++;
                c28601Ss2 = c28601Ss3;
            }
        }
        if (c28601Ss2 != null && i == 1 && c28601Ss2.A0B) {
            C38441o9 c38441o9 = this.A05;
            if (c38441o9 != null) {
                if (c38441o9.A0B) {
                    this.A00 = this.A01 * c38441o9.A02;
                } else {
                    return;
                }
            }
            A01(c28601Ss2.A02 + this.A00);
        }
        InterfaceC12230j4 interfaceC12230j43 = this.A03;
        if (interfaceC12230j43 != null) {
            interfaceC12230j43.AVk(this);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.A06.A03.A0f);
        sb.append(":");
        sb.append(this.A04);
        sb.append("(");
        sb.append(this.A0B ? Integer.valueOf(this.A02) : "unresolved");
        sb.append(") <t=");
        sb.append(this.A08.size());
        sb.append(":d=");
        sb.append(this.A07.size());
        sb.append(">");
        return sb.toString();
    }
}
