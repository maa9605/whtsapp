package X;

import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;
import com.whatsapp.IntentChooserBottomSheetDialogFragment;
import java.util.List;

/* renamed from: X.1j0  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C35351j0 extends AbstractC04890Mh {
    public List A00;
    public final /* synthetic */ IntentChooserBottomSheetDialogFragment A01;

    public C35351j0(IntentChooserBottomSheetDialogFragment intentChooserBottomSheetDialogFragment, List list) {
        this.A01 = intentChooserBottomSheetDialogFragment;
        this.A00 = list;
    }

    @Override // X.AbstractC04890Mh
    public int A0C() {
        return this.A00.size();
    }

    @Override // X.AbstractC04890Mh
    public C0TS A0E(ViewGroup viewGroup, int i) {
        return new C35361j1(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.intent_selector_item, viewGroup, false));
    }

    @Override // X.AbstractC04890Mh
    public void A0F(C0TS c0ts, int i) {
        Drawable A03;
        C35361j1 c35361j1 = (C35361j1) c0ts;
        final C457523l c457523l = (C457523l) this.A00.get(i);
        int i2 = c457523l.A00;
        c35361j1.A01.setText(c457523l.A01);
        c35361j1.A0H.setOnClickListener(new View.OnClickListener() { // from class: X.1HU
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C35351j0.this.A0G(c457523l);
            }
        });
        try {
            ImageView imageView = c35361j1.A00;
            if (i2 == 0) {
                A03 = imageView.getContext().getPackageManager().getApplicationIcon("com.whatsapp");
            } else {
                A03 = C02160Ac.A03(imageView.getContext(), i2);
            }
            imageView.setImageDrawable(A03);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void A0G(C457523l c457523l) {
        IntentChooserBottomSheetDialogFragment intentChooserBottomSheetDialogFragment = this.A01;
        if (intentChooserBottomSheetDialogFragment.A03 == null) {
            intentChooserBottomSheetDialogFragment.A0A().startActivityForResult(c457523l.A02, intentChooserBottomSheetDialogFragment.A00);
        } else {
            C0BA A06 = intentChooserBottomSheetDialogFragment.A0C().A06(intentChooserBottomSheetDialogFragment.A03.intValue());
            if (A06 != null) {
                A06.startActivityForResult(c457523l.A02, intentChooserBottomSheetDialogFragment.A00);
            } else {
                throw null;
            }
        }
        intentChooserBottomSheetDialogFragment.A10();
    }
}
