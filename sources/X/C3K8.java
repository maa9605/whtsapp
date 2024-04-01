package X;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;
import com.whatsapp.gallery.GalleryFragmentBase;
import com.whatsapp.gallery.Hilt_LinksGalleryFragment;
import com.whatsapp.gallery.LinksGalleryFragment;
import java.util.Calendar;

/* renamed from: X.3K8  reason: invalid class name */
/* loaded from: classes2.dex */
public class C3K8 extends AbstractC54512is implements C1LE {
    public final /* synthetic */ LinksGalleryFragment A00;

    public C3K8(LinksGalleryFragment linksGalleryFragment) {
        this.A00 = linksGalleryFragment;
    }

    @Override // X.AbstractC04890Mh
    public C0TS A0E(ViewGroup viewGroup, int i) {
        LinksGalleryFragment linksGalleryFragment = this.A00;
        View inflate = linksGalleryFragment.A09().getLayoutInflater().inflate(R.layout.link_media_item, viewGroup, false);
        ((FrameLayout) inflate.findViewById(R.id.link_preview_frame)).setForeground(C02160Ac.A03(((Hilt_LinksGalleryFragment) linksGalleryFragment).A00, R.drawable.selector_orange_gradient));
        ((ImageView) inflate.findViewById(R.id.chevron)).setImageDrawable(new C0We(((GalleryFragmentBase) linksGalleryFragment).A04, C02160Ac.A03(((Hilt_LinksGalleryFragment) linksGalleryFragment).A00, R.drawable.chevron)));
        return new C54522it(linksGalleryFragment, inflate);
    }

    @Override // X.C1LE
    public int A9A(int i) {
        return ((C52592az) ((GalleryFragmentBase) this.A00).A0H.get(i)).count;
    }

    @Override // X.C1LE
    public int AAR() {
        return ((GalleryFragmentBase) this.A00).A0H.size();
    }

    @Override // X.C1LE
    public long AAS(int i) {
        return -((Calendar) ((GalleryFragmentBase) this.A00).A0H.get(i)).getTimeInMillis();
    }

    @Override // X.C1LE
    public void AHy(C0TS c0ts, int i) {
        ((C66363At) c0ts).A00.setText(((GalleryFragmentBase) this.A00).A0H.get(i).toString());
    }

    @Override // X.C1LE
    public C0TS AJ6(ViewGroup viewGroup) {
        LinksGalleryFragment linksGalleryFragment = this.A00;
        View inflate = linksGalleryFragment.A09().getLayoutInflater().inflate(R.layout.media_gallery_section_row, viewGroup, false);
        inflate.setClickable(false);
        inflate.setBackgroundColor(C02160Ac.A00(((Hilt_LinksGalleryFragment) linksGalleryFragment).A00, R.color.gallery_separator));
        return new C66363At(inflate);
    }

    @Override // X.C1LE
    public boolean AP9(C0TS c0ts, int i, MotionEvent motionEvent) {
        return false;
    }
}
