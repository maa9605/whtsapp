package X;

import android.animation.AnimatorSet;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import com.whatsapp.jid.UserJid;
import com.whatsapp.status.Hilt_StatusesFragment;
import com.whatsapp.status.StatusesFragment;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.265  reason: invalid class name */
/* loaded from: classes2.dex */
public class AnonymousClass265 extends BaseAdapter implements Filterable {
    public Filter A01;
    public final /* synthetic */ StatusesFragment A03;
    public final Map A02 = new HashMap();
    public long A00 = 4;

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 3;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    public AnonymousClass265(StatusesFragment statusesFragment) {
        this.A03 = statusesFragment;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.A03.A0n.size();
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        Filter filter = this.A01;
        if (filter == null) {
            final StatusesFragment statusesFragment = this.A03;
            Filter filter2 = new Filter() { // from class: X.2jO
                public List A00(List list, ArrayList arrayList) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        C0Hr c0Hr = (C0Hr) it.next();
                        StatusesFragment statusesFragment2 = StatusesFragment.this;
                        if (statusesFragment2.A0C.A0G(statusesFragment2.A0A.A0A(c0Hr.A0A), arrayList, true)) {
                            arrayList2.add(new C53112bu(statusesFragment2, c0Hr));
                        }
                    }
                    return arrayList2;
                }

                @Override // android.widget.Filter
                public Filter.FilterResults performFiltering(CharSequence charSequence) {
                    Filter.FilterResults filterResults = new Filter.FilterResults();
                    ArrayList arrayList = new ArrayList();
                    if (TextUtils.isEmpty(charSequence)) {
                        StatusesFragment statusesFragment2 = StatusesFragment.this;
                        C0Hr c0Hr = statusesFragment2.A0a.A00;
                        if (c0Hr == null) {
                            c0Hr = new C0Hr(statusesFragment2.A0H, C011405q.A00, -1L, -1L, -1L, -1L, -1L, 0L, 0, 0);
                        }
                        arrayList.add(new C53112bu(statusesFragment2, c0Hr));
                        if (c0Hr != null) {
                            if (statusesFragment2.A0f != null) {
                                arrayList.add(new C54042hx(statusesFragment2));
                            } else {
                                throw null;
                            }
                        }
                    }
                    ArrayList A03 = TextUtils.isEmpty(charSequence) ? null : C09940f2.A03(charSequence.toString(), StatusesFragment.this.A0L);
                    StatusesFragment statusesFragment3 = StatusesFragment.this;
                    List A00 = A00(statusesFragment3.A0a.A02, A03);
                    List A002 = A00(statusesFragment3.A0a.A03, A03);
                    List A003 = A00(statusesFragment3.A0a.A01, A03);
                    if (!((AbstractCollection) A00).isEmpty()) {
                        arrayList.add(new C54822jP(statusesFragment3, 0L));
                        arrayList.addAll(A00);
                    }
                    if (!((AbstractCollection) A002).isEmpty()) {
                        arrayList.add(new C54822jP(statusesFragment3, 1L));
                        arrayList.addAll(A002);
                    }
                    filterResults.values = new C3X7(arrayList, A003);
                    filterResults.count = arrayList.size();
                    return filterResults;
                }

                @Override // android.widget.Filter
                public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
                    Object obj = filterResults.values;
                    if (obj != null) {
                        C3X7 c3x7 = (C3X7) obj;
                        StatusesFragment statusesFragment2 = StatusesFragment.this;
                        statusesFragment2.A0n = c3x7.A00;
                        List list = c3x7.A01;
                        statusesFragment2.A0o = list;
                        if (!list.isEmpty()) {
                            statusesFragment2.A0n.add(new C54822jP(statusesFragment2, 2L));
                            if (!statusesFragment2.A0v || statusesFragment2.A0t || !statusesFragment2.A0s) {
                                statusesFragment2.A0n.addAll(statusesFragment2.A0o);
                            }
                        }
                    }
                    StatusesFragment statusesFragment3 = StatusesFragment.this;
                    statusesFragment3.A0l = charSequence;
                    statusesFragment3.A0m = C09940f2.A03(charSequence == null ? null : charSequence.toString(), statusesFragment3.A0L);
                    statusesFragment3.A12();
                    AnimatorSet animatorSet = statusesFragment3.A00;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        statusesFragment3.A00 = null;
                    }
                    statusesFragment3.A0b.notifyDataSetChanged();
                }
            };
            this.A01 = filter2;
            return filter2;
        }
        return filter;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        return this.A03.A0n.get(i);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        InterfaceC53102bt interfaceC53102bt = (InterfaceC53102bt) this.A03.A0n.get(i);
        if (interfaceC53102bt instanceof C53112bu) {
            UserJid userJid = ((C53112bu) interfaceC53102bt).A01.A0A;
            Map map = this.A02;
            Number number = (Number) map.get(userJid);
            if (number == null) {
                long j = this.A00;
                this.A00 = 1 + j;
                number = Long.valueOf(j);
                map.put(userJid, number);
            }
            return number.longValue();
        } else if (interfaceC53102bt instanceof C54822jP) {
            return ((C54822jP) interfaceC53102bt).A00;
        } else {
            if (interfaceC53102bt instanceof C54042hx) {
                return 3L;
            }
            throw new UnsupportedOperationException("Each list item must have an id");
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i) {
        Object obj = this.A03.A0n.get(i);
        if (obj instanceof C53112bu) {
            return 0;
        }
        if (obj instanceof C54822jP) {
            return 1;
        }
        if (obj instanceof C54042hx) {
            return 2;
        }
        throw new UnsupportedOperationException("Each list item type must have a itemType");
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        StatusesFragment statusesFragment = this.A03;
        return ((InterfaceC53102bt) statusesFragment.A0n.get(i)).ADs(i, view, viewGroup, ((Hilt_StatusesFragment) statusesFragment).A00);
    }
}
