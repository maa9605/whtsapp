package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: X.0Jp  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC04290Jp extends AnonymousClass092 {
    public boolean A00;
    public boolean A01;
    public final List A02;

    @Override // X.AnonymousClass092
    public boolean A13() {
        return false;
    }

    @Override // X.AnonymousClass092
    public String A16() {
        return null;
    }

    @Override // X.AnonymousClass092
    public void A17(String str) {
    }

    public abstract C0D3 A18();

    public AbstractC04290Jp(AnonymousClass094 anonymousClass094, long j, byte b) {
        super(anonymousClass094, j, b);
        this.A02 = new ArrayList();
        this.A00 = false;
        super.A0Y(6);
    }

    @Override // X.AnonymousClass092
    public String A0J() {
        if (this.A00) {
            return this.A01 ? "video" : "audio";
        }
        return null;
    }

    @Override // X.AnonymousClass092
    public void A0Q() {
        C000700j.A08(false, "Cannot change status for calls message type");
    }

    @Override // X.AnonymousClass092
    public void A0Y(int i) {
        super.A0Y(6);
    }

    @Override // X.AnonymousClass092
    public void A0o(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.A01 = "video".equals(str);
            this.A00 = true;
            return;
        }
        this.A00 = false;
    }

    public List A19() {
        C0D3 A18;
        List list = this.A02;
        if (list.isEmpty() && this.A00 && (A18 = A18()) != null) {
            list.add(A18);
        }
        return new ArrayList(list);
    }

    public void A1A(List list) {
        List list2 = this.A02;
        list2.clear();
        list2.addAll(list);
        Collections.sort(list2, new Comparator() { // from class: X.3Th
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((C0D3) obj).A09.A00 - ((C0D3) obj2).A09.A00;
            }
        });
    }
}
