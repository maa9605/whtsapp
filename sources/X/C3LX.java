package X;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.search.verification.client.R;
import com.whatsapp.mediacomposer.ImageComposerFragment;
import com.whatsapp.mediacomposer.MediaComposerActivity;
import com.whatsapp.mediacomposer.MediaComposerFragment;
import com.whatsapp.mediaview.PhotoView;

/* renamed from: X.3LX  reason: invalid class name */
/* loaded from: classes2.dex */
public class C3LX extends C3J1 {
    public final /* synthetic */ MediaComposerActivity A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3LX(MediaComposerActivity mediaComposerActivity, AbstractC02800Cx abstractC02800Cx) {
        super(abstractC02800Cx);
        this.A00 = mediaComposerActivity;
    }

    @Override // X.C0ZT
    public int A0B() {
        return this.A00.A0d.A04().size();
    }

    @Override // X.AbstractC35271is
    public int A0F(Object obj) {
        int indexOf = this.A00.A0d.A04().indexOf(((MediaComposerFragment) ((C0BA) obj)).A00);
        if (indexOf < 0) {
            return -2;
        }
        return A0L(indexOf);
    }

    @Override // X.C3J1
    public void A0K(ViewGroup viewGroup, int i, C0BA c0ba) {
        PhotoView photoView;
        if (c0ba instanceof ImageComposerFragment) {
            ((ImageComposerFragment) c0ba).A08.A00();
        } else {
            View view = c0ba.A0A;
            if (view != null && (photoView = (PhotoView) view.findViewById(R.id.photo)) != null) {
                photoView.A01();
            }
        }
        super.A0I(viewGroup, i, c0ba);
    }

    public final int A0L(int i) {
        MediaComposerActivity mediaComposerActivity = this.A00;
        return !mediaComposerActivity.A0O.A0M() ? (mediaComposerActivity.A0d.A04().size() - i) - 1 : i;
    }
}
