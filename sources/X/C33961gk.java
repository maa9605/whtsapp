package X;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/* renamed from: X.1gk  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C33961gk implements C0AL {
    public C0AM A00;
    public InterfaceC020509l A01;
    public String A02;
    public final Stack A05 = new Stack();
    public final Stack A04 = new Stack();
    public final C020409k A03 = new C020409k();

    public C33961gk(Iterator it) {
        this.A05.add(it);
        this.A04.add(C1F8.ReadObject);
    }

    public final void A00() {
        InterfaceC020509l interfaceC020509l = this.A01;
        if (interfaceC020509l == C0A6.A00) {
            this.A00 = C0AM.NULL;
        } else if (interfaceC020509l instanceof Number) {
            this.A00 = C0AM.NUMBER;
        } else if (interfaceC020509l instanceof C0A8) {
            Object A0q = AnonymousClass088.A0q(interfaceC020509l);
            if (A0q instanceof String) {
                this.A00 = C0AM.STRING;
            } else if (A0q instanceof List) {
                this.A05.push(((List) A0q).iterator());
                this.A04.push(C1F8.ArrayReadValue);
                this.A00 = C0AM.START_ARRAY;
            } else if (A0q instanceof Map) {
                this.A05.push(((Map) A0q).entrySet().iterator());
                this.A04.push(C1F8.ObjectReadName);
                this.A00 = C0AM.START_OBJECT;
            } else {
                StringBuilder A0P = C000200d.A0P("unknown value type");
                A0P.append(interfaceC020509l);
                throw new IllegalStateException(A0P.toString());
            }
        } else if (interfaceC020509l instanceof C020609m) {
            this.A00 = C0AM.EXPRESSION;
        } else {
            StringBuilder A0P2 = C000200d.A0P("unknown value type");
            A0P2.append(interfaceC020509l);
            throw new IllegalStateException(A0P2.toString());
        }
    }

    @Override // X.C0AL
    public C0AM AGm() {
        C1F8 c1f8 = C1F8.ObjectReadName;
        this.A02 = null;
        this.A00 = null;
        Stack stack = this.A04;
        Stack stack2 = this.A05;
        Iterator it = (Iterator) stack2.peek();
        int ordinal = ((C1F8) stack.peek()).ordinal();
        if (ordinal == 0) {
            this.A00 = C0AM.START_OBJECT;
            stack.pop();
            stack.push(c1f8);
        } else if (ordinal == 1) {
            this.A01 = null;
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                this.A02 = (String) AnonymousClass088.A0r((InterfaceC020509l) entry.getKey());
                this.A01 = (InterfaceC020509l) entry.getValue();
                this.A00 = C0AM.NAME;
                stack.pop();
                stack.push(C1F8.ObjectReadValue);
            } else {
                this.A00 = C0AM.END_OBJECT;
                stack.pop();
                stack2.pop();
            }
        } else if (ordinal == 2) {
            stack.pop();
            stack.push(c1f8);
            A00();
        } else if (ordinal == 3) {
            this.A00 = C0AM.START_ARRAY;
            stack.pop();
            stack.push(C1F8.ArrayReadValue);
        } else if (ordinal == 4) {
            this.A01 = null;
            if (it.hasNext()) {
                this.A01 = (InterfaceC020509l) it.next();
                A00();
            } else {
                this.A00 = C0AM.END_ARRAY;
                stack2.pop();
                stack.pop();
            }
        }
        return this.A00;
    }

    @Override // X.C0AL
    public String AQg() {
        return this.A02;
    }

    @Override // X.C0AL
    public C0AM AQh() {
        return this.A00;
    }

    @Override // X.C0AL
    public InterfaceC020309j AQi() {
        C020409k c020409k = this.A03;
        c020409k.A00 = this.A01;
        return c020409k;
    }

    @Override // X.C0AL
    public void AUv() {
        C0AM c0am = C0AM.START_OBJECT;
        C0AM c0am2 = C0AM.START_ARRAY;
        C0AM c0am3 = this.A00;
        if (c0am3 != c0am2 && c0am3 != c0am) {
            return;
        }
        int i = 1;
        while (true) {
            C0AM AGm = AGm();
            if (AGm == c0am2 || AGm == c0am) {
                i++;
            } else if (AGm == C0AM.END_ARRAY || AGm == C0AM.END_OBJECT) {
                i--;
            }
            if (i == 0) {
                return;
            }
        }
    }
}
