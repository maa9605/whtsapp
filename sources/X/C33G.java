package X;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ViewGroup;
import com.google.android.search.verification.client.R;
import com.whatsapp.biz.catalog.CatalogMediaViewFragment;
import com.whatsapp.mediaview.MediaViewBaseFragment;
import com.whatsapp.mediaview.PhotoView;
import com.whatsapp.ui.media.MediaCaptionTextView;
import com.whatsapp.util.ViewOnClickCListenerShape12S0100000_I1;

/* renamed from: X.33G  reason: invalid class name */
/* loaded from: classes2.dex */
public class C33G implements AnonymousClass311 {
    public final /* synthetic */ CatalogMediaViewFragment A00;

    @Override // X.AnonymousClass311
    public void A7C(int i) {
    }

    @Override // X.AnonymousClass311
    public void AKX() {
    }

    public C33G(CatalogMediaViewFragment catalogMediaViewFragment) {
        this.A00 = catalogMediaViewFragment;
    }

    @Override // X.AnonymousClass311
    public C0FK A70(int i) {
        CatalogMediaViewFragment catalogMediaViewFragment = this.A00;
        ViewGroup viewGroup = (ViewGroup) catalogMediaViewFragment.A04().inflate(R.layout.media_view_photo, (ViewGroup) null);
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.footer);
        final Context A00 = catalogMediaViewFragment.A00();
        PhotoView photoView = new PhotoView(A00) { // from class: X.3Ld
            @Override // com.whatsapp.mediaview.PhotoView, android.view.GestureDetector.OnDoubleTapListener
            public boolean onDoubleTap(MotionEvent motionEvent) {
                C33G.this.A00.A1A(((PhotoView) this).A00 != this.A04, true);
                return super.onDoubleTap(motionEvent);
            }

            @Override // com.whatsapp.mediaview.PhotoView, android.view.ScaleGestureDetector.OnScaleGestureListener
            public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
                C33G.this.A00.A1A(false, true);
                return super.onScaleBegin(scaleGestureDetector);
            }

            @Override // com.whatsapp.mediaview.PhotoView, android.view.ScaleGestureDetector.OnScaleGestureListener
            public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
                super.onScaleEnd(scaleGestureDetector);
                C33G.this.A00.A1A(((PhotoView) this).A00 <= this.A04, true);
            }
        };
        photoView.setOnClickListener(new ViewOnClickCListenerShape12S0100000_I1(this, 5));
        if (i == catalogMediaViewFragment.A00) {
            C0AT.A0e(photoView, C000200d.A0H("thumb-transition-", C06960Vv.A01(catalogMediaViewFragment.A06.A09, i)));
        }
        viewGroup.addView(photoView, 0);
        photoView.A01 = 0.2f;
        photoView.A0Y = true;
        if (1 == 0) {
            photoView.A02();
        }
        catalogMediaViewFragment.A04.A01((C2A2) catalogMediaViewFragment.A06.A0D.get(i), 1, new C33F(catalogMediaViewFragment, photoView, i), null, photoView);
        if (!TextUtils.isEmpty(catalogMediaViewFragment.A06.A06)) {
            MediaCaptionTextView mediaCaptionTextView = (MediaCaptionTextView) catalogMediaViewFragment.A04().inflate(R.layout.media_view_caption, (ViewGroup) null);
            viewGroup2.addView(mediaCaptionTextView, 0);
            viewGroup2.setBackground(new ColorDrawable(C02160Ac.A00(catalogMediaViewFragment.A00(), R.color.media_view_footer_background)));
            mediaCaptionTextView.setCaptionText(catalogMediaViewFragment.A06.A06);
        }
        viewGroup2.setVisibility(((MediaViewBaseFragment) catalogMediaViewFragment).A0G ? 0 : 8);
        return new C0FK(viewGroup, C06960Vv.A01(catalogMediaViewFragment.A06.A09, i));
    }

    @Override // X.AnonymousClass311
    public int ACV(Object obj) {
        int i = 0;
        while (true) {
            CatalogMediaViewFragment catalogMediaViewFragment = this.A00;
            if (i >= catalogMediaViewFragment.A06.A0D.size()) {
                return 0;
            }
            if (C06960Vv.A01(catalogMediaViewFragment.A06.A09, i).equals(obj)) {
                return i;
            }
            i++;
        }
    }

    @Override // X.AnonymousClass311
    public int getCount() {
        return this.A00.A06.A0D.size();
    }
}
