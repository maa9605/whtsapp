package X;

import android.content.Context;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SectionIndexer;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3JD  reason: invalid class name */
/* loaded from: classes2.dex */
public class C3JD extends AbstractC54542iv implements SectionIndexer {
    public List A00;
    public List A01;
    public final Context A04;
    public final C0L7 A05;
    public final C0Zn A06;
    public final C002301c A07;
    public List A03 = new ArrayList();
    public List A02 = new ArrayList();

    public C3JD(Context context, List list, C0L7 c0l7, C0Zn c0Zn, C002301c c002301c) {
        this.A00 = list;
        this.A04 = context;
        this.A05 = c0l7;
        this.A06 = c0Zn;
        this.A01 = list;
        this.A07 = c002301c;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.A00.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        return this.A00.get(i);
    }

    @Override // android.widget.SectionIndexer
    public int getPositionForSection(int i) {
        List list = this.A02;
        if (i < list.size() && i >= 0) {
            return ((Number) list.get(i)).intValue();
        }
        return -1;
    }

    @Override // android.widget.SectionIndexer
    public int getSectionForPosition(int i) {
        return C23X.A00(i, this.A01, this.A03, this.A02);
    }

    @Override // android.widget.SectionIndexer
    public Object[] getSections() {
        return this.A03.toArray(new String[1]);
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        C58092qZ c58092qZ;
        InterfaceC54742jH interfaceC54742jH = (InterfaceC54742jH) this.A00.get(i);
        if (interfaceC54742jH != null) {
            if (interfaceC54742jH instanceof AnonymousClass372) {
                if (view == null) {
                    view = LayoutInflater.from(this.A04).inflate(R.layout.list_section, viewGroup, false);
                    C0AT.A0V(view, 2);
                }
                TextView textView = (TextView) view.findViewById(R.id.title);
                C003301p.A06(textView);
                textView.setText(((AnonymousClass372) interfaceC54742jH).A00);
                return view;
            }
            C06C A93 = interfaceC54742jH.A93();
            if (view == null) {
                view = LayoutInflater.from(this.A04).inflate(R.layout.phone_contact_row, viewGroup, false);
                c58092qZ = new C58092qZ(view);
                view.setTag(c58092qZ);
            } else {
                c58092qZ = (C58092qZ) view.getTag();
            }
            C0L7 c0l7 = this.A05;
            ImageView imageView = c58092qZ.A00;
            c0l7.A05(imageView, R.drawable.avatar_contact);
            this.A06.A02(A93, imageView);
            c58092qZ.A01.A03(A93.A0F);
            TextEmojiLabel textEmojiLabel = c58092qZ.A02;
            textEmojiLabel.setVisibility(0);
            textEmojiLabel.A03(C04630Le.A00(A93));
            return view;
        }
        throw null;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        Pair A05 = C23X.A05(this.A01, this.A07);
        this.A03 = (List) A05.first;
        this.A02 = (List) A05.second;
    }
}
