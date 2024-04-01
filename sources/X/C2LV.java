package X;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.ViewOnClickCListenerShape2S0300000_I0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2LV  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2LV extends ArrayAdapter {
    public List A00;
    public boolean A01;
    public final Activity A02;
    public final LayoutInflater A03;
    public final C1M7 A04;
    public final C018708s A05;
    public final C0Zn A06;
    public final C002301c A07;
    public final C2AR A08;
    public final InterfaceC002901k A09;

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 1;
    }

    public C2LV(InterfaceC002901k interfaceC002901k, C018708s c018708s, C002301c c002301c, C1M7 c1m7, C2AR c2ar, Activity activity, C0Zn c0Zn) {
        super(activity, (int) R.layout.participant_list_row, (List) null);
        this.A02 = activity;
        this.A09 = interfaceC002901k;
        this.A05 = c018708s;
        this.A07 = c002301c;
        this.A04 = c1m7;
        this.A08 = c2ar;
        this.A06 = c0Zn;
        this.A03 = LayoutInflater.from(activity);
        this.A00 = new ArrayList();
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public int getCount() {
        List list = this.A00;
        if (list == null) {
            return 0;
        }
        if (this.A01 || list.size() <= 10) {
            return this.A00.size();
        }
        return 11;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public Object getItem(int i) {
        return this.A00.get(i);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        C57372pC c57372pC;
        if (view == null) {
            view = this.A03.inflate(R.layout.participant_list_row, viewGroup, false);
            c57372pC = new C57372pC(null);
            c57372pC.A03 = new C06030Rg(view, (int) R.id.name, this.A05, this.A08);
            c57372pC.A02 = (TextEmojiLabel) view.findViewById(R.id.status);
            c57372pC.A01 = (ImageView) view.findViewById(R.id.avatar);
            c57372pC.A00 = view.findViewById(R.id.divider);
            view.setTag(c57372pC);
        } else {
            c57372pC = (C57372pC) view.getTag();
        }
        if (i == getCount() - 1) {
            c57372pC.A00.setVisibility(8);
        } else {
            c57372pC.A00.setVisibility(0);
        }
        if (!this.A01 && i == 10) {
            int size = this.A00.size() - 10;
            c57372pC.A03.A01.setText(this.A07.A0A(R.plurals.n_more, size, Integer.valueOf(size)));
            c57372pC.A03.A01.setTextColor(C02160Ac.A00(this.A02, R.color.list_item_sub_title));
            c57372pC.A02.setVisibility(8);
            c57372pC.A01.setImageResource(R.drawable.ic_more_participants);
            c57372pC.A01.setClickable(false);
            return view;
        }
        C06C c06c = (C06C) this.A00.get(i);
        if (c06c != null) {
            c57372pC.A03.A01.setTextColor(C02160Ac.A00(this.A02, R.color.list_item_title));
            c57372pC.A03.A03(c06c, null);
            ImageView imageView = c57372pC.A01;
            StringBuilder sb = new StringBuilder();
            sb.append(this.A04.A00(R.string.transition_avatar));
            Jid A02 = c06c.A02();
            if (A02 != null) {
                sb.append(A02.getRawString());
                C0AT.A0e(imageView, sb.toString());
                c57372pC.A02.setVisibility(0);
                c57372pC.A02.setTag(c06c.A02());
                final C018708s c018708s = this.A05;
                String str = (String) c018708s.A07.get(c06c.A03(AbstractC011205o.class));
                if (str != null) {
                    c57372pC.A02.setText(str);
                } else {
                    c57372pC.A02.setText("");
                    InterfaceC002901k interfaceC002901k = this.A09;
                    final C011005l c011005l = (C011005l) c06c.A03(C011005l.class);
                    final TextEmojiLabel textEmojiLabel = c57372pC.A02;
                    interfaceC002901k.ARy(new C0HS(c018708s, c011005l, textEmojiLabel) { // from class: X.35a
                        public final C018708s A00;
                        public final C011005l A01;
                        public final WeakReference A02;

                        {
                            this.A00 = c018708s;
                            this.A01 = c011005l;
                            this.A02 = new WeakReference(textEmojiLabel);
                        }

                        @Override // X.C0HS
                        public Object A07(Object[] objArr) {
                            return this.A00.A0A(this.A01);
                        }

                        @Override // X.C0HS
                        public void A09(Object obj) {
                            String str2 = (String) obj;
                            TextView textView = (TextView) this.A02.get();
                            if (textView == null || !textView.getTag().equals(this.A01)) {
                                return;
                            }
                            textView.setText(str2);
                        }
                    }, new Void[0]);
                }
                this.A06.A02(c06c, c57372pC.A01);
                c57372pC.A01.setClickable(true);
                c57372pC.A01.setOnClickListener(new ViewOnClickCListenerShape2S0300000_I0(this, c06c, c57372pC, 0));
                return view;
            }
            throw null;
        }
        throw null;
    }
}
