package X;

import android.text.TextUtils;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import com.google.android.search.verification.client.R;
import com.whatsapp.conversationslist.ConversationsFragment;
import com.whatsapp.jid.Jid;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.29q  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C471129q extends BaseAdapter implements Filterable {
    public final C05W A03;
    public final C002301c A04;
    public final C0CB A05;
    public final /* synthetic */ ConversationsFragment A06;
    public final Filter A02 = new Filter() { // from class: X.2jJ
        public boolean A00;
        public boolean A01;

        @Override // android.widget.Filter
        public Filter.FilterResults performFiltering(CharSequence charSequence) {
            ArrayList arrayList;
            Filter.FilterResults filterResults = new Filter.FilterResults();
            this.A00 = true;
            this.A01 = true;
            C0HC c0hc = new C0HC("conversations/filter/performFiltering");
            if (TextUtils.isEmpty(charSequence)) {
                arrayList = C471129q.this.A06.A12();
            } else {
                arrayList = new ArrayList();
                C471129q c471129q = C471129q.this;
                ArrayList A03 = C09940f2.A03((String) charSequence, c471129q.A04);
                HashSet hashSet = new HashSet();
                ArrayList arrayList2 = new ArrayList();
                if (!A03.isEmpty()) {
                    ArrayList arrayList3 = new ArrayList(arrayList2);
                    ConversationsFragment conversationsFragment = c471129q.A06;
                    arrayList2.add(new C52502aq(conversationsFragment.A12, conversationsFragment.A0b, A03));
                    C0IU c0iu = conversationsFragment.A25;
                    c0iu.A09 = arrayList3;
                    c0iu.A08 = charSequence;
                    c0iu.A03 = null;
                    c0iu.A05(A03);
                }
                ConversationsFragment conversationsFragment2 = c471129q.A06;
                C0IU c0iu2 = conversationsFragment2.A25;
                C07610Yz c07610Yz = c471129q.A00;
                List list = c07610Yz.A02;
                if (list == null) {
                    list = new ArrayList();
                    c07610Yz.A02 = list;
                }
                c0iu2.A0C = list;
                c0iu2.A00 = 0;
                c0iu2.A01 = 100;
                c0hc.A00();
                List<AnonymousClass092> list2 = (List) conversationsFragment2.A16.A07(c0iu2, null).second;
                c0hc.A00();
                Iterator it = ((AbstractCollection) conversationsFragment2.A14.A0B()).iterator();
                while (it.hasNext()) {
                    AbstractC005302j abstractC005302j = (AbstractC005302j) it.next();
                    if (C0DK.A01(arrayList2, abstractC005302j)) {
                        hashSet.add(abstractC005302j);
                        if (this.A01) {
                            arrayList.add(new C52862bT(conversationsFragment2.A0F(R.string.search_section_chats)));
                            this.A01 = false;
                        }
                        arrayList.add(new C52572ax(abstractC005302j));
                    }
                }
                c0hc.A00();
                for (C06C c06c : conversationsFragment2.A12.A03()) {
                    if (c06c.A08 != null && !hashSet.contains(c06c.A03(AbstractC005302j.class))) {
                        Jid A032 = c06c.A03(AbstractC005302j.class);
                        if (A032 != null) {
                            if (C0DK.A01(arrayList2, (AbstractC005302j) A032)) {
                                if (this.A00) {
                                    arrayList.add(new C52862bT(conversationsFragment2.A0F(R.string.search_section_contacts)));
                                    this.A00 = false;
                                }
                                arrayList.add(new C52582ay(c06c));
                            }
                        } else {
                            throw null;
                        }
                    }
                }
                c0hc.A00();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                if (list2 != null) {
                    for (AnonymousClass092 anonymousClass092 : list2) {
                        if (anonymousClass092.A0n.A00 != null) {
                            if (anonymousClass092.A0j) {
                                arrayList4.add(anonymousClass092);
                            } else {
                                arrayList5.add(anonymousClass092);
                            }
                        } else {
                            throw null;
                        }
                    }
                    if (arrayList4.size() > 0) {
                        arrayList.add(new C52862bT(conversationsFragment2.A0F(R.string.search_section_starred_messages)));
                    }
                    Iterator it2 = arrayList4.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(new C52612b1((AnonymousClass092) it2.next()));
                    }
                    if (arrayList5.size() > 0) {
                        arrayList.add(new C52862bT(conversationsFragment2.A0F(R.string.search_section_messages)));
                    }
                    Iterator it3 = arrayList5.iterator();
                    while (it3.hasNext()) {
                        arrayList.add(new C52612b1((AnonymousClass092) it3.next()));
                    }
                } else {
                    throw null;
                }
            }
            filterResults.values = arrayList;
            filterResults.count = arrayList.size();
            c0hc.A01();
            return filterResults;
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x005d, code lost:
            if (r4.A00 <= 0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0072, code lost:
            if (r4.A0y.A00.getInt("delete_chat_count", 0) >= 3) goto L55;
         */
        @Override // android.widget.Filter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void publishResults(java.lang.CharSequence r13, android.widget.Filter.FilterResults r14) {
            /*
                Method dump skipped, instructions count: 344
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: X.C54762jJ.publishResults(java.lang.CharSequence, android.widget.Filter$FilterResults):void");
        }
    };
    public C07610Yz A00 = new C07610Yz();
    public ArrayList A01 = new ArrayList();

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 2;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    public C471129q(ConversationsFragment conversationsFragment, C05W c05w, C002301c c002301c, C0CB c0cb) {
        this.A06 = conversationsFragment;
        this.A03 = c05w;
        this.A04 = c002301c;
        this.A05 = c0cb;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.A06.A1q.size();
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        return this.A02;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        return this.A06.A1q.get(i);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return this.A06.A1q.get(i).hashCode();
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i) {
        return this.A06.A1q.get(i) instanceof C52862bT ? 1 : 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00f8, code lost:
        if (r2.A0C(442) != false) goto L32;
     */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View getView(int r44, android.view.View r45, android.view.ViewGroup r46) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C471129q.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean isEmpty() {
        if (super.isEmpty()) {
            return this.A06.A00 == 0 || !TextUtils.isEmpty(this.A00.A01);
        }
        return false;
    }
}
