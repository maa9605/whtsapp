package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.DocumentPickerActivity;
import java.io.File;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.1KS  reason: invalid class name */
/* loaded from: classes.dex */
public class C1KS extends BaseAdapter implements Filterable {
    public final C1KU A00;
    public final /* synthetic */ DocumentPickerActivity A01;

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean isEmpty() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.1KU] */
    public C1KS(DocumentPickerActivity documentPickerActivity) {
        this.A01 = documentPickerActivity;
        final DocumentPickerActivity documentPickerActivity2 = this.A01;
        this.A00 = new Filter() { // from class: X.1KU
            public int A00 = 0;

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.util.List] */
            /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r4v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
            @Override // android.widget.Filter
            public Filter.FilterResults performFiltering(CharSequence charSequence) {
                ArrayList arrayList;
                ?? r4;
                if (charSequence != null) {
                    arrayList = C09940f2.A03(charSequence.toString(), DocumentPickerActivity.this.A06);
                } else {
                    arrayList = null;
                }
                int i = this.A00;
                DocumentPickerActivity documentPickerActivity3 = DocumentPickerActivity.this;
                int i2 = documentPickerActivity3.A00;
                if (i != i2) {
                    this.A00 = i2;
                    C002301c c002301c = documentPickerActivity3.A06;
                    List list = documentPickerActivity3.A0A;
                    if (i2 != 0) {
                        if (i2 == 1) {
                            Collections.sort(list, C25631Gd.A00);
                        }
                    } else {
                        Collator collator = Collator.getInstance(c002301c.A0I());
                        collator.setDecomposition(1);
                        Collections.sort(list, new C25601Ga(collator));
                    }
                }
                if (arrayList != null && !arrayList.isEmpty()) {
                    r4 = new ArrayList();
                    for (C1KT c1kt : documentPickerActivity3.A0A) {
                        if (C09940f2.A04(c1kt.A03, arrayList, documentPickerActivity3.A06)) {
                            r4.add(c1kt);
                        }
                    }
                } else {
                    r4 = documentPickerActivity3.A0A;
                }
                Filter.FilterResults filterResults = new Filter.FilterResults();
                filterResults.values = r4;
                filterResults.count = r4.size();
                return filterResults;
            }

            @Override // android.widget.Filter
            public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
                if (filterResults != null) {
                    DocumentPickerActivity.this.A0B = (ArrayList) filterResults.values;
                }
                DocumentPickerActivity documentPickerActivity3 = DocumentPickerActivity.this;
                documentPickerActivity3.A03.notifyDataSetChanged();
                DocumentPickerActivity.A00(documentPickerActivity3);
            }
        };
    }

    @Override // android.widget.Adapter
    public int getCount() {
        List list = this.A01.A0B;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        return this.A00;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        List list = this.A01.A0B;
        if (list == null) {
            return null;
        }
        return list.get(i);
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        C1KV c1kv;
        if (view != null) {
            c1kv = (C1KV) view.getTag();
        } else {
            view = this.A01.getLayoutInflater().inflate(R.layout.document_picker_item, (ViewGroup) null, false);
            c1kv = new C1KV(view);
            view.setTag(c1kv);
        }
        DocumentPickerActivity documentPickerActivity = this.A01;
        List list = documentPickerActivity.A0B;
        if (list == null) {
            return view;
        }
        C1KT c1kt = (C1KT) list.get(i);
        ImageView imageView = c1kv.A01;
        Context context = view.getContext();
        File file = c1kt.A02;
        imageView.setImageDrawable(C460324r.A04(context, file));
        c1kv.A04.setText(AbstractC54772jK.A02(view.getContext(), file.getName(), documentPickerActivity.A09, documentPickerActivity.A06));
        c1kv.A03.setText(C02180Ae.A0k(documentPickerActivity.A06, c1kt.A01));
        TextView textView = c1kv.A02;
        C002301c c002301c = documentPickerActivity.A06;
        long j = c1kt.A00;
        textView.setText(AnonymousClass029.A0n(c002301c, j, false));
        textView.setContentDescription(AnonymousClass029.A0n(documentPickerActivity.A06, j, true));
        View view2 = c1kv.A00;
        view2.setContentDescription(documentPickerActivity.getString(R.string.checked_icon_label));
        if (documentPickerActivity.A0E.contains(c1kt)) {
            view.setBackgroundResource(R.drawable.contact_row_selection);
            view2.setVisibility(0);
            return view;
        }
        view.setBackgroundResource(0);
        view2.setVisibility(8);
        return view;
    }
}
