package X;

import android.content.Context;
import android.database.Cursor;
import android.database.CursorIndexOutOfBoundsException;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.2qz */
/* loaded from: classes2.dex */
public class C58342qz extends CursorAdapter {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public ActivityC02320As A06;
    public C0U0 A07;
    public C58832rm A08;
    public AbstractC005302j A09;
    public C2KU A0A;
    public C70383Sb A0B;
    public AnonymousClass094 A0C;
    public AnonymousClass092 A0D;
    public List A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public final SparseArray A0I;
    public final AnonymousClass012 A0J;
    public final C0C9 A0K;
    public final C009905a A0L;
    public final C05U A0M;
    public final ArrayList A0N;
    public final HashSet A0O;
    public final HashSet A0P;
    public final Set A0Q;

    @Override // android.widget.CursorAdapter, android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    @Override // android.widget.CursorAdapter
    public void onContentChanged() {
    }

    public C58342qz(ActivityC02320As activityC02320As, C58832rm c58832rm, AnonymousClass012 anonymousClass012, C05U c05u, C0C9 c0c9, C009905a c009905a) {
        super((Context) activityC02320As, (Cursor) null, false);
        this.A05 = 1L;
        this.A0I = new SparseArray();
        this.A0Q = new HashSet();
        this.A0O = new HashSet();
        this.A0P = new HashSet();
        this.A0N = new ArrayList();
        this.A0H = false;
        this.A0E = new ArrayList();
        this.A0J = anonymousClass012;
        this.A0M = c05u;
        this.A0K = c0c9;
        this.A0L = c009905a;
        this.A06 = activityC02320As;
        this.A08 = c58832rm;
    }

    public int A00() {
        return this.A0N.size();
    }

    public int A01() {
        return (this.A0N.size() + getCursor().getCount()) - this.A04;
    }

    public int A02(int i, int i2) {
        if (i2 != -1 && i2 != 1) {
            AnonymousClass092 item = getItem(i);
            if (item != null) {
                int A00 = C2W2.A00(item);
                if (A00 == 1) {
                    int i3 = i - 1;
                    while (i3 >= 0) {
                        AnonymousClass092 item2 = getItem(i3);
                        if (item2 == null || !A0A(item2, i3, item, i3 + 1) || !A09(item2)) {
                            return i3 + 1;
                        }
                        i3--;
                        item = item2;
                    }
                } else if (A00 != 2) {
                    return i;
                }
                return !this.A0F ? i : i - 1;
            }
            throw null;
        }
        return i;
    }

    public int A03(AnonymousClass092 anonymousClass092) {
        SparseArray sparseArray = this.A0I;
        int indexOfValue = sparseArray.indexOfValue(anonymousClass092);
        if (indexOfValue >= 0) {
            int keyAt = sparseArray.keyAt(indexOfValue);
            return keyAt >= A01() ? keyAt + 1 : keyAt;
        }
        int i = 0;
        while (true) {
            ArrayList arrayList = this.A0N;
            if (i >= arrayList.size()) {
                return -1;
            }
            if (anonymousClass092.equals(arrayList.get(i))) {
                int count = getCursor().getCount() + i;
                return count >= A01() ? count + 1 : count;
            }
            i++;
        }
    }

    public int A04(AnonymousClass092 anonymousClass092, int i) {
        AnonymousClass092 item;
        if (A09(anonymousClass092)) {
            int A00 = C2W2.A00(anonymousClass092);
            int i2 = 0;
            if (A00 != 1) {
                if (A00 == 2 && this.A0F) {
                    int i3 = i - 1;
                    AnonymousClass092 anonymousClass0922 = anonymousClass092;
                    while (i3 >= 0) {
                        AnonymousClass092 item2 = getItem(i3);
                        if (item2 == null || !A0A(item2, i3, anonymousClass0922, i3 + 1) || !A09(item2)) {
                            break;
                        }
                        i2++;
                        i3--;
                        anonymousClass0922 = item2;
                    }
                    int i4 = i2 % 2;
                    if (i4 != 0) {
                        return i4 == 1 ? 3 : 2;
                    }
                    int i5 = i + 1;
                    AnonymousClass092 item3 = getItem(i5);
                    return (item3 != null && A0A(item3, i5, anonymousClass092, i) && A09(item3)) ? 1 : -1;
                }
                return -1;
            }
            int i6 = i - 1;
            AnonymousClass092 anonymousClass0923 = anonymousClass092;
            int i7 = 0;
            while (i6 >= 0 && i7 < 3) {
                AnonymousClass092 item4 = getItem(i6);
                if (item4 == null || !A0A(item4, i6, anonymousClass0923, i6 + 1) || !A09(item4)) {
                    break;
                }
                i7++;
                i6--;
                anonymousClass0923 = item4;
            }
            int i8 = i + 1;
            while (i8 < getCount() && i2 < 102 && (item = getItem(i8)) != null && A0A(item, i8, anonymousClass092, i8 - 1) && A09(item)) {
                i2++;
                i8++;
                anonymousClass092 = item;
            }
            if (i7 + 1 + i2 < 4 || i2 >= 102) {
                return -1;
            }
            if (i2 == 101 || i7 == 0) {
                return 1;
            }
            return i2 != 0 ? 2 : 3;
        }
        return -1;
    }

    @Override // android.widget.CursorAdapter, android.widget.Adapter
    /* renamed from: A05 */
    public AnonymousClass092 getItem(int i) {
        int i2;
        AnonymousClass092 anonymousClass092 = null;
        if (this.A04 > 0 && i == A01()) {
            AnonymousClass092 anonymousClass0922 = this.A0D;
            if (anonymousClass0922 == null) {
                C05U c05u = this.A0M;
                long A05 = this.A0J.A05();
                C05V c05v = c05u.A07;
                AnonymousClass092 A02 = c05u.A02(C05V.A00(c05v.A01, c05v.A00, null, true), A05, (byte) 0);
                A02.A0l("dummy msg!");
                this.A0D = A02;
                return A02;
            }
            return anonymousClass0922;
        }
        int i3 = i;
        if (i > A01()) {
            i3 = i - 1;
        }
        int count = getCursor().getCount();
        if (i3 < count) {
            SparseArray sparseArray = this.A0I;
            anonymousClass092 = (AnonymousClass092) sparseArray.get(i3);
            if (anonymousClass092 == null) {
                int position = getCursor().getPosition();
                getCursor().moveToPosition((count - 1) - i3);
                int position2 = getCursor().getPosition();
                try {
                    anonymousClass092 = this.A0K.A0D(getCursor(), this.A09);
                    if (position2 < position && (position2 <= (i2 = this.A00) || position2 > i2 + 50)) {
                        this.A00 = Math.max(0, position2 - 50);
                        getCursor().moveToPosition(this.A00);
                    }
                    sparseArray.put(i3, anonymousClass092);
                } catch (CursorIndexOutOfBoundsException e) {
                    StringBuilder A0R = C000200d.A0R("conversation/cursor-out-of-bounds cursorCount:", count, " dataPosition:", i3, " viewPosition:");
                    A0R.append(i);
                    A0R.append(" appended:");
                    A0R.append(this.A0N.size());
                    A0R.append(" unseenRowCount:");
                    C000200d.A1H(A0R, this.A04, " old_pos:", position, " new_pos:");
                    A0R.append(position2);
                    A0R.append(" cursor-count:");
                    A0R.append(getCursor().getCount());
                    Log.e(A0R.toString());
                    throw e;
                }
            }
        } else {
            int i4 = i3 - count;
            if (i4 >= 0) {
                ArrayList arrayList = this.A0N;
                if (i4 < arrayList.size()) {
                    anonymousClass092 = (AnonymousClass092) arrayList.get(i4);
                }
            }
        }
        for (InterfaceC06800Vb interfaceC06800Vb : this.A0E) {
            interfaceC06800Vb.AN9(anonymousClass092);
        }
        return anonymousClass092;
    }

    public void A06() {
        this.A01++;
    }

    public final boolean A07(AbstractC48182Ef abstractC48182Ef, AnonymousClass092 anonymousClass092) {
        HashSet hashSet = this.A0P;
        AnonymousClass094 anonymousClass094 = anonymousClass092.A0n;
        return hashSet.contains(anonymousClass094) || this.A0O.contains(anonymousClass094) || this.A07 != null || abstractC48182Ef.A02 != this.A01 || (anonymousClass092 instanceof C0KC);
    }

    public boolean A08(AnonymousClass094 anonymousClass094) {
        return this.A0O.add(anonymousClass094);
    }

    public final boolean A09(AnonymousClass092 anonymousClass092) {
        if (anonymousClass092.A0p > 0 && anonymousClass092.A0p <= this.A05) {
            byte b = anonymousClass092.A0m;
            if ((b != 20 || anonymousClass092.A0C() == null) && !C40731sm.A0n(anonymousClass092) && anonymousClass092.A0H == null) {
                return ((b == 20 && C0DB.A0N(this.A0J, this.A0L, anonymousClass092)) || C2W2.A00(anonymousClass092) == -1) ? false : true;
            }
            return false;
        }
        return false;
    }

    public final boolean A0A(AnonymousClass092 anonymousClass092, int i, AnonymousClass092 anonymousClass0922, int i2) {
        AbstractC005302j A0A;
        long j = anonymousClass092.A0E;
        long j2 = anonymousClass0922.A0E;
        boolean z = Math.abs(j - j2) <= 610000;
        boolean A06 = C02620Cd.A06(j, j2);
        boolean z2 = anonymousClass092.A14(1) == anonymousClass0922.A14(1);
        boolean z3 = anonymousClass092.A0n.A02;
        boolean z4 = z3 == anonymousClass0922.A0n.A02 && (z3 || (A0A = anonymousClass092.A0A()) == null || A0A.equals(anonymousClass0922.A0A()));
        boolean z5 = (i < A01()) == (i2 < A01());
        boolean z6 = C2W2.A00(anonymousClass092) == C2W2.A00(anonymousClass0922);
        AnonymousClass092 A0C = anonymousClass092.A0C();
        AnonymousClass092 A0C2 = anonymousClass0922.A0C();
        return z && A06 && z4 && z5 && z2 && z6 && (A0C == A0C2 || (A0C != null && A0C2 != null && A0C.A0n.equals(A0C2.A0n)));
    }

    @Override // android.widget.CursorAdapter
    public void bindView(View view, Context context, Cursor cursor) {
        throw new IllegalStateException("should not be called, getView is defined");
    }

    @Override // android.widget.CursorAdapter
    public void changeCursor(Cursor cursor) {
        this.A0G = true;
        super.changeCursor(cursor);
    }

    @Override // android.widget.CursorAdapter, android.widget.Adapter
    public int getCount() {
        if (!this.A0G || getCursor() == null) {
            return 0;
        }
        return this.A0N.size() + getCursor().getCount() + (this.A04 > 0 ? 1 : 0);
    }

    @Override // android.widget.CursorAdapter, android.widget.Adapter
    public long getItemId(int i) {
        AnonymousClass092 item = getItem(i);
        if (item == null) {
            return 0L;
        }
        return ((item.A0p == 0 ? item.A0n.hashCode() : item.A0p) & 4294967295L) | (item.A0m << 32);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i) {
        if (this.A0G) {
            if (this.A04 <= 0 || i != A01()) {
                AnonymousClass092 item = getItem(i);
                if (item == null) {
                    return -1;
                }
                C58832rm c58832rm = this.A08;
                int A04 = A04(item, i);
                if (c58832rm != null) {
                    if (A04 == -1) {
                        return C58832rm.A00(item);
                    }
                    if (A04 == 1) {
                        return C2W2.A00(item) != 2 ? item.A0n.A02 ? 32 : 33 : item.A0n.A02 ? 41 : 42;
                    }
                    return 34;
                }
                throw null;
            }
            return 18;
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:228:0x00ee, code lost:
        if (r6.getFMessage().A0m == r4.A0m) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x02c4  */
    @Override // android.widget.CursorAdapter, android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View getView(int r13, android.view.View r14, android.view.ViewGroup r15) {
        /*
            Method dump skipped, instructions count: 786
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58342qz.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return (this.A04 > 0 ? 1 : 0) + 85;
    }

    @Override // android.widget.CursorAdapter
    public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        throw new IllegalStateException("should not be called, getView is defined");
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        this.A0G = false;
    }
}
