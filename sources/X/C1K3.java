package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;
import com.whatsapp.components.SelectionCheckView;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1K3  reason: invalid class name */
/* loaded from: classes.dex */
public class C1K3 extends BaseAdapter {
    public List A00 = new ArrayList();
    public final /* synthetic */ AbstractActivityC06930Vs A01;

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    public C1K3(AbstractActivityC06930Vs abstractActivityC06930Vs) {
        this.A01 = abstractActivityC06930Vs;
    }

    public final void A00(SelectionCheckView selectionCheckView, boolean z) {
        AbstractActivityC06930Vs abstractActivityC06930Vs = this.A01;
        if (abstractActivityC06930Vs.A0M) {
            int i = R.string.status_contact_not_excluded_description;
            if (z) {
                i = R.string.status_contact_excluded_description;
            }
            selectionCheckView.setContentDescription(abstractActivityC06930Vs.getString(i));
            return;
        }
        int i2 = R.string.status_contact_not_selected_description;
        if (z) {
            i2 = R.string.status_contact_selected_description;
        }
        selectionCheckView.setContentDescription(abstractActivityC06930Vs.getString(i2));
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.A00.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        return this.A00.get(i);
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        final C1K5 c1k5;
        C06C c06c = (C06C) this.A00.get(i);
        if (view == null) {
            AbstractActivityC06930Vs abstractActivityC06930Vs = this.A01;
            view = abstractActivityC06930Vs.getLayoutInflater().inflate(R.layout.status_contact_picker_row, viewGroup, false);
            c1k5 = new C1K5(null);
            view.setTag(c1k5);
            c1k5.A00 = (ImageView) view.findViewById(R.id.contactpicker_row_photo);
            c1k5.A01 = new C06030Rg(view, (int) R.id.contactpicker_row_name, abstractActivityC06930Vs.A0A, abstractActivityC06930Vs.A0F);
            c1k5.A02 = (SelectionCheckView) view.findViewById(R.id.selection_check);
            C003301p.A06(c1k5.A01.A01);
        } else {
            c1k5 = (C1K5) view.getTag();
        }
        view.setClickable(false);
        view.setLongClickable(false);
        Jid A03 = c06c.A03(UserJid.class);
        if (A03 != null) {
            c1k5.A03 = (UserJid) A03;
            AbstractActivityC06930Vs abstractActivityC06930Vs2 = this.A01;
            abstractActivityC06930Vs2.A0B.A02(c06c, c1k5.A00);
            C0AT.A0V(c1k5.A00, 2);
            c1k5.A01.A03(c06c, abstractActivityC06930Vs2.A0J);
            final boolean contains = abstractActivityC06930Vs2.A0U.contains(c06c.A03(UserJid.class));
            if (abstractActivityC06930Vs2.A0M) {
                c1k5.A02.setSelectionBackground(R.drawable.red_circle);
            } else {
                c1k5.A02.setSelectionBackground(R.drawable.teal_circle);
            }
            if (!abstractActivityC06930Vs2.A0T.remove(c06c.A03(UserJid.class))) {
                if (abstractActivityC06930Vs2.A06.A0H((UserJid) c06c.A03(UserJid.class))) {
                    if (abstractActivityC06930Vs2.A0M) {
                        c1k5.A02.A03(true, false);
                    } else {
                        c1k5.A02.A03(false, false);
                    }
                    c1k5.A02.setContentDescription(abstractActivityC06930Vs2.getString(R.string.tap_unblock));
                    view.setAlpha(0.5f);
                    return view;
                }
                c1k5.A02.A03(contains, false);
                A00(c1k5.A02, contains);
                view.setAlpha(1.0f);
                return view;
            }
            c1k5.A02.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: X.1K2
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public boolean onPreDraw() {
                    C1K5 c1k52 = c1k5;
                    c1k52.A02.getViewTreeObserver().removeOnPreDrawListener(this);
                    SelectionCheckView selectionCheckView = c1k52.A02;
                    boolean z = contains;
                    selectionCheckView.A03(z, true);
                    C1K3.this.A00(c1k52.A02, z);
                    return false;
                }
            });
            view.setAlpha(1.0f);
            return view;
        }
        throw null;
    }
}
