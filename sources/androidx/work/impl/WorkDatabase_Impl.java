package androidx.work.impl;

import X.C1Vs;
import X.C1W8;
import X.C1W9;
import X.C29181Vt;
import X.C29201Vv;
import X.C29211Vw;
import X.C29241Vz;
import X.InterfaceC16910rE;
import X.InterfaceC16930rG;
import X.InterfaceC16950rI;
import X.InterfaceC16970rK;
import X.InterfaceC16980rL;
import X.InterfaceC17010rO;
import X.InterfaceC17030rQ;

/* loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {
    public volatile InterfaceC16910rE A00;
    public volatile InterfaceC16930rG A01;
    public volatile InterfaceC16950rI A02;
    public volatile InterfaceC16970rK A03;
    public volatile InterfaceC16980rL A04;
    public volatile InterfaceC17010rO A05;
    public volatile InterfaceC17030rQ A06;

    @Override // androidx.work.impl.WorkDatabase
    public InterfaceC16910rE A06() {
        InterfaceC16910rE interfaceC16910rE;
        if (this.A00 != null) {
            return this.A00;
        }
        synchronized (this) {
            if (this.A00 == null) {
                this.A00 = new C1Vs(this);
            }
            interfaceC16910rE = this.A00;
        }
        return interfaceC16910rE;
    }

    @Override // androidx.work.impl.WorkDatabase
    public InterfaceC16930rG A07() {
        InterfaceC16930rG interfaceC16930rG;
        if (this.A01 != null) {
            return this.A01;
        }
        synchronized (this) {
            if (this.A01 == null) {
                this.A01 = new C29181Vt(this);
            }
            interfaceC16930rG = this.A01;
        }
        return interfaceC16930rG;
    }

    @Override // androidx.work.impl.WorkDatabase
    public InterfaceC16950rI A08() {
        InterfaceC16950rI interfaceC16950rI;
        if (this.A02 != null) {
            return this.A02;
        }
        synchronized (this) {
            if (this.A02 == null) {
                this.A02 = new C29201Vv(this);
            }
            interfaceC16950rI = this.A02;
        }
        return interfaceC16950rI;
    }

    @Override // androidx.work.impl.WorkDatabase
    public InterfaceC16970rK A09() {
        InterfaceC16970rK interfaceC16970rK;
        if (this.A03 != null) {
            return this.A03;
        }
        synchronized (this) {
            if (this.A03 == null) {
                this.A03 = new C29211Vw(this);
            }
            interfaceC16970rK = this.A03;
        }
        return interfaceC16970rK;
    }

    @Override // androidx.work.impl.WorkDatabase
    public InterfaceC16980rL A0A() {
        InterfaceC16980rL interfaceC16980rL;
        if (this.A04 != null) {
            return this.A04;
        }
        synchronized (this) {
            if (this.A04 == null) {
                this.A04 = new C29241Vz(this);
            }
            interfaceC16980rL = this.A04;
        }
        return interfaceC16980rL;
    }

    @Override // androidx.work.impl.WorkDatabase
    public InterfaceC17010rO A0B() {
        InterfaceC17010rO interfaceC17010rO;
        if (this.A05 != null) {
            return this.A05;
        }
        synchronized (this) {
            if (this.A05 == null) {
                this.A05 = new C1W8(this);
            }
            interfaceC17010rO = this.A05;
        }
        return interfaceC17010rO;
    }

    @Override // androidx.work.impl.WorkDatabase
    public InterfaceC17030rQ A0C() {
        InterfaceC17030rQ interfaceC17030rQ;
        if (this.A06 != null) {
            return this.A06;
        }
        synchronized (this) {
            if (this.A06 == null) {
                this.A06 = new C1W9(this);
            }
            interfaceC17030rQ = this.A06;
        }
        return interfaceC17030rQ;
    }
}
