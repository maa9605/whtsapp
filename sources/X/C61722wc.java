package X;

import android.text.TextUtils;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.chatinfo.ChatInfoActivity;
import com.whatsapp.group.GroupChatInfo;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.2wc  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C61722wc extends BaseAdapter implements Filterable {
    public String A00;
    public ArrayList A01;
    public ArrayList A02 = new ArrayList();
    public boolean A03;
    public final Filter A04;
    public final /* synthetic */ GroupChatInfo A05;

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean areAllItemsEnabled() {
        return false;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    public C61722wc(GroupChatInfo groupChatInfo) {
        this.A05 = groupChatInfo;
        final GroupChatInfo groupChatInfo2 = this.A05;
        this.A04 = new Filter() { // from class: X.2wb
            @Override // android.widget.Filter
            public Filter.FilterResults performFiltering(CharSequence charSequence) {
                ArrayList arrayList;
                Filter.FilterResults filterResults = new Filter.FilterResults();
                if (!TextUtils.isEmpty(charSequence)) {
                    arrayList = new ArrayList();
                    String charSequence2 = charSequence.toString();
                    GroupChatInfo groupChatInfo3 = GroupChatInfo.this;
                    ArrayList A03 = C09940f2.A03(charSequence2, ((ChatInfoActivity) groupChatInfo3).A09);
                    boolean contains = charSequence.toString().toLowerCase().contains(groupChatInfo3.getString(R.string.group_admin).toLowerCase());
                    Iterator it = groupChatInfo3.A1O.iterator();
                    while (it.hasNext()) {
                        C06C c06c = (C06C) it.next();
                        if (!groupChatInfo3.A0S.A0G(c06c, A03, true) && !C09940f2.A04(c06c.A0O, A03, ((ChatInfoActivity) groupChatInfo3).A09)) {
                            if (contains) {
                                C0C8 c0c8 = groupChatInfo3.A0h;
                                C011005l c011005l = groupChatInfo3.A13;
                                Jid A032 = c06c.A03(UserJid.class);
                                if (A032 != null) {
                                    if (c0c8.A07(c011005l, (UserJid) A032)) {
                                    }
                                } else {
                                    throw null;
                                }
                            } else {
                                continue;
                            }
                        }
                        arrayList.add(c06c);
                    }
                } else {
                    arrayList = GroupChatInfo.this.A1O;
                }
                filterResults.values = arrayList;
                filterResults.count = arrayList.size();
                return filterResults;
            }

            @Override // android.widget.Filter
            public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
                ArrayList arrayList;
                Object obj = filterResults.values;
                if (obj == null) {
                    arrayList = GroupChatInfo.this.A1O;
                } else {
                    arrayList = (ArrayList) obj;
                }
                GroupChatInfo groupChatInfo3 = GroupChatInfo.this;
                C61722wc c61722wc = groupChatInfo3.A0u;
                c61722wc.A02 = arrayList;
                String charSequence2 = charSequence == null ? null : charSequence.toString();
                c61722wc.A00 = charSequence2;
                c61722wc.A01 = C09940f2.A03(charSequence2, ((ChatInfoActivity) c61722wc.A05).A09);
                c61722wc.notifyDataSetChanged();
                TextView textView = (TextView) groupChatInfo3.findViewById(R.id.search_no_matches);
                if (textView != null) {
                    if (arrayList.isEmpty() && !TextUtils.isEmpty(charSequence)) {
                        textView.setVisibility(0);
                        textView.setText(groupChatInfo3.getString(R.string.search_no_results, charSequence));
                        return;
                    }
                    textView.setVisibility(8);
                }
            }
        };
    }

    public void A00() {
        if (TextUtils.isEmpty(this.A00)) {
            GroupChatInfo groupChatInfo = this.A05;
            CharSequence charSequence = null;
            this.A02 = groupChatInfo.A1O;
            String charSequence2 = 0 == 0 ? null : charSequence.toString();
            this.A00 = charSequence2;
            this.A01 = C09940f2.A03(charSequence2, ((ChatInfoActivity) groupChatInfo).A09);
            notifyDataSetChanged();
            return;
        }
        this.A04.filter(this.A00);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        if (this.A03 || this.A02.size() <= 11) {
            return this.A02.size();
        }
        return 11;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        return this.A04;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        return this.A02.get(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x006c, code lost:
        if (r12.A02.size() <= 11) goto L50;
     */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View getView(int r13, android.view.View r14, android.view.ViewGroup r15) {
        /*
            Method dump skipped, instructions count: 555
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61722wc.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean isEnabled(int i) {
        C06C c06c = (C06C) this.A02.get(i);
        if (c06c != null) {
            return !this.A05.A0J.A0A(c06c.A02());
        }
        throw null;
    }
}
