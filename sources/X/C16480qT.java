package X;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* renamed from: X.0qT  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16480qT {
    public int A00;
    public C0OF A01;
    public C0OF A02;
    public C07M A03;
    public Set A04;
    public UUID A05;

    public C16480qT(UUID id, C07M state, C0OF outputData, List tags, C0OF progress, int runAttemptCount) {
        this.A05 = id;
        this.A03 = state;
        this.A01 = outputData;
        this.A04 = new HashSet(tags);
        this.A02 = progress;
        this.A00 = runAttemptCount;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || C16480qT.class != o.getClass()) {
            return false;
        }
        C16480qT c16480qT = (C16480qT) o;
        if (this.A00 == c16480qT.A00 && this.A05.equals(c16480qT.A05) && this.A03 == c16480qT.A03 && this.A01.equals(c16480qT.A01) && this.A04.equals(c16480qT.A04)) {
            return this.A02.equals(c16480qT.A02);
        }
        return false;
    }

    public int hashCode() {
        return ((this.A02.hashCode() + ((this.A04.hashCode() + ((this.A01.hashCode() + ((this.A03.hashCode() + (this.A05.hashCode() * 31)) * 31)) * 31)) * 31)) * 31) + this.A00;
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("WorkInfo{mId='");
        A0P.append(this.A05);
        A0P.append('\'');
        A0P.append(", mState=");
        A0P.append(this.A03);
        A0P.append(", mOutputData=");
        A0P.append(this.A01);
        A0P.append(", mTags=");
        A0P.append(this.A04);
        A0P.append(", mProgress=");
        A0P.append(this.A02);
        A0P.append('}');
        return A0P.toString();
    }
}
