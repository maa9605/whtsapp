package X;

import android.database.ContentObserver;
import android.database.Cursor;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.search.verification.client.R;
import com.whatsapp.gallery.GalleryFragmentBase;
import com.whatsapp.gallery.ProductGalleryFragment;
import java.util.Calendar;

/* renamed from: X.3KB  reason: invalid class name */
/* loaded from: classes2.dex */
public class C3KB extends AbstractC54512is implements C1LE {
    public int A00;
    public final ContentObserver A01;
    public final /* synthetic */ ProductGalleryFragment A02;

    public C3KB(ProductGalleryFragment productGalleryFragment) {
        this.A02 = productGalleryFragment;
        final Handler handler = new Handler(Looper.getMainLooper());
        this.A01 = new ContentObserver(handler) { // from class: X.2vM
            @Override // android.database.ContentObserver
            public boolean deliverSelfNotifications() {
                return true;
            }

            @Override // android.database.ContentObserver
            public void onChange(boolean z) {
                C000200d.A1C("productsgalleryfragment/onchange ", z);
                C3KB c3kb = C3KB.this;
                Cursor cursor = ((AbstractC54512is) c3kb).A01;
                c3kb.A00 = cursor == null ? 0 : cursor.getCount();
                ((AbstractC04890Mh) c3kb).A01.A00();
            }
        };
    }

    @Override // X.AbstractC54512is, X.AbstractC04890Mh
    public int A0C() {
        return this.A00;
    }

    @Override // X.AbstractC04890Mh
    public C0TS A0E(ViewGroup viewGroup, int i) {
        ProductGalleryFragment productGalleryFragment = this.A02;
        return new C3BC(productGalleryFragment, productGalleryFragment.A0A().getLayoutInflater().inflate(R.layout.product_media_item, viewGroup, false));
    }

    @Override // X.AbstractC54512is, X.AbstractC04890Mh
    public void A0F(C0TS c0ts, int i) {
        Cursor cursor = ((AbstractC54512is) this).A01;
        if (cursor == null || i >= cursor.getCount()) {
            return;
        }
        super.A0F(c0ts, i);
    }

    @Override // X.AbstractC54512is
    public Cursor A0G(Cursor cursor) {
        Cursor cursor2 = ((AbstractC54512is) this).A01;
        if (cursor2 != null) {
            cursor2.unregisterContentObserver(this.A01);
        }
        if (cursor != null) {
            cursor.registerContentObserver(this.A01);
            this.A00 = cursor.getCount();
        } else {
            this.A00 = 0;
        }
        return super.A0G(cursor);
    }

    @Override // X.C1LE
    public int A9A(int i) {
        return ((C52592az) ((GalleryFragmentBase) this.A02).A0H.get(i)).count;
    }

    @Override // X.C1LE
    public int AAR() {
        return ((GalleryFragmentBase) this.A02).A0H.size();
    }

    @Override // X.C1LE
    public long AAS(int i) {
        return -((Calendar) ((GalleryFragmentBase) this.A02).A0H.get(i)).getTimeInMillis();
    }

    @Override // X.C1LE
    public void AHy(C0TS c0ts, int i) {
        ((C3BA) c0ts).A00.setText(((GalleryFragmentBase) this.A02).A0H.get(i).toString());
    }

    @Override // X.C1LE
    public C0TS AJ6(ViewGroup viewGroup) {
        ProductGalleryFragment productGalleryFragment = this.A02;
        View inflate = productGalleryFragment.A0A().getLayoutInflater().inflate(R.layout.media_gallery_section_row, viewGroup, false);
        inflate.setClickable(false);
        inflate.setBackgroundColor(C02160Ac.A00(productGalleryFragment.A00(), R.color.gallery_separator));
        return new C3BA(inflate);
    }

    @Override // X.C1LE
    public boolean AP9(C0TS c0ts, int i, MotionEvent motionEvent) {
        return false;
    }
}
