package X;

import android.database.Cursor;
import android.database.DataSetObserver;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape2S0200000_I1;
import com.google.android.search.verification.client.R;
import com.whatsapp.gallery.DocumentsGalleryFragment;
import com.whatsapp.gallery.GalleryFragmentBase;
import com.whatsapp.gallery.Hilt_DocumentsGalleryFragment;
import com.whatsapp.gallery.Hilt_LinksGalleryFragment;
import com.whatsapp.gallery.Hilt_ProductGalleryFragment;
import com.whatsapp.gallery.LinksGalleryFragment;
import com.whatsapp.gallery.ProductGalleryFragment;
import java.io.File;
import java.math.BigDecimal;
import java.util.Locale;

/* renamed from: X.2is */
/* loaded from: classes2.dex */
public abstract class AbstractC54512is extends AbstractC04890Mh {
    public Cursor A01 = null;
    public boolean A03 = false;
    public int A00 = -1;
    public DataSetObserver A02 = new DataSetObserver() { // from class: X.2vE
        {
            AbstractC54512is.this = this;
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            super.onChanged();
            AbstractC54512is abstractC54512is = AbstractC54512is.this;
            abstractC54512is.A03 = true;
            ((AbstractC04890Mh) abstractC54512is).A01.A00();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            super.onInvalidated();
            AbstractC54512is abstractC54512is = AbstractC54512is.this;
            abstractC54512is.A03 = false;
            ((AbstractC04890Mh) abstractC54512is).A01.A00();
        }
    };

    public AbstractC54512is() {
        super.A0B(true);
    }

    @Override // X.AbstractC04890Mh
    public long A00(int i) {
        Cursor cursor;
        if (this.A03 && (cursor = this.A01) != null && cursor.moveToPosition(i)) {
            return this.A01.getLong(this.A00);
        }
        return 0L;
    }

    @Override // X.AbstractC04890Mh
    public void A0B(boolean z) {
        super.A0B(true);
    }

    @Override // X.AbstractC04890Mh
    public int A0C() {
        Cursor cursor;
        if (!this.A03 || (cursor = this.A01) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // X.AbstractC04890Mh
    public void A0F(C0TS c0ts, int i) {
        C04160Iu c04160Iu;
        String str;
        String str2;
        String str3;
        String A0F;
        if (this.A03) {
            if (this.A01.moveToPosition(i)) {
                Cursor cursor = this.A01;
                if (this instanceof C3KB) {
                    final C3BC c3bc = (C3BC) c0ts;
                    ProductGalleryFragment productGalleryFragment = ((C3KB) this).A02;
                    AnonymousClass092 A03 = productGalleryFragment.A03.A0H.A03(cursor, ((GalleryFragmentBase) productGalleryFragment).A0C);
                    if (A03 != null) {
                        c3bc.A00 = A03;
                        if (A03 instanceof C04160Iu) {
                            c04160Iu = (C04160Iu) A03;
                        } else {
                            AnonymousClass092 A0C = A03.A0C();
                            if (!(A0C instanceof C04160Iu)) {
                                return;
                            }
                            c04160Iu = (C04160Iu) A0C;
                            if (!c04160Iu.A0n.A01.startsWith("product_inquiry")) {
                                return;
                            }
                        }
                        if (c04160Iu == null) {
                            return;
                        }
                        View view = c3bc.A0H;
                        view.setOnClickListener(new ViewOnClickEBaseShape2S0200000_I1(c3bc, c04160Iu, 6));
                        view.setOnLongClickListener(new View.OnLongClickListener() { // from class: X.2vD
                            @Override // android.view.View.OnLongClickListener
                            public final boolean onLongClick(View view2) {
                                C3BC c3bc2 = c3bc;
                                ProductGalleryFragment productGalleryFragment2 = c3bc2.A04;
                                if (productGalleryFragment2.A0z().AEZ()) {
                                    productGalleryFragment2.A0z().AVe(c3bc2.A00);
                                } else {
                                    productGalleryFragment2.A0z().AV2(c3bc2.A00);
                                }
                                ((AbstractC04890Mh) ((GalleryFragmentBase) productGalleryFragment2).A09).A01.A00();
                                return true;
                            }
                        });
                        String str4 = c04160Iu.A07;
                        BigDecimal bigDecimal = c04160Iu.A08;
                        if (bigDecimal != null && (str3 = c04160Iu.A02) != null) {
                            str = new C09R(str3).A03(c3bc.A04.A02, bigDecimal, true);
                        } else {
                            str = c04160Iu.A03;
                        }
                        StringBuilder sb = new StringBuilder();
                        str2 = "";
                        String str5 = str4;
                        if (str4 == null) {
                            str5 = "";
                        }
                        sb.append(str5);
                        if (!TextUtils.isEmpty(str)) {
                            str2 = C000200d.A0L(new StringBuilder(), str4 != null ? "\n" : "", str);
                        }
                        sb.append(str2);
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb.toString());
                        if (!TextUtils.isEmpty(str)) {
                            spannableStringBuilder.setSpan(new ForegroundColorSpan(C02160Ac.A00(c3bc.A03.getContext(), R.color.secondary_text)), str4 == null ? 0 : str4.length(), spannableStringBuilder.length(), 0);
                        }
                        ProductGalleryFragment productGalleryFragment2 = c3bc.A04;
                        c3bc.A03.setText(AbstractC54772jK.A02(((Hilt_ProductGalleryFragment) productGalleryFragment2).A00, spannableStringBuilder, productGalleryFragment2.A0z().ACy(), productGalleryFragment2.A02));
                        if (((AnonymousClass097) c04160Iu).A02 != null) {
                            C42471vn c42471vn = productGalleryFragment2.A06;
                            ImageView imageView = c3bc.A02;
                            InterfaceC43821y3 interfaceC43821y3 = new InterfaceC43821y3() { // from class: X.3BB
                                @Override // X.InterfaceC43821y3
                                public void AKM() {
                                }

                                @Override // X.InterfaceC43821y3
                                public int ADA() {
                                    C3BC c3bc2 = c3bc;
                                    return c3bc2.A04.A06.A03(c3bc2.A02.getContext());
                                }

                                @Override // X.InterfaceC43821y3
                                public void AUc(View view2, Bitmap bitmap, AnonymousClass092 anonymousClass092) {
                                    if (bitmap != null && bitmap.getHeight() != 0 && bitmap.getWidth() != 0) {
                                        ImageView imageView2 = c3bc.A02;
                                        imageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
                                        imageView2.setImageBitmap(bitmap);
                                        return;
                                    }
                                    ImageView imageView3 = c3bc.A02;
                                    imageView3.setVisibility(0);
                                    imageView3.setImageResource(R.drawable.ic_business);
                                    imageView3.setBackgroundColor(C02160Ac.A00(imageView3.getContext(), R.color.white));
                                    imageView3.setScaleType(ImageView.ScaleType.CENTER);
                                }

                                @Override // X.InterfaceC43821y3
                                public void AUo(View view2) {
                                    ImageView imageView2 = c3bc.A02;
                                    imageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
                                    imageView2.setImageDrawable(new ColorDrawable(-7829368));
                                }
                            };
                            if (c42471vn != null) {
                                c42471vn.A09(c04160Iu, imageView, interfaceC43821y3, c04160Iu.A0n);
                            } else {
                                throw null;
                            }
                        } else {
                            ImageView imageView2 = c3bc.A02;
                            imageView2.setVisibility(0);
                            imageView2.setImageResource(R.drawable.ic_business);
                            imageView2.setBackgroundColor(C02160Ac.A00(imageView2.getContext(), R.color.media_link_thumbnail_background));
                            imageView2.setScaleType(ImageView.ScaleType.CENTER);
                        }
                        c3bc.A01.setVisibility(c3bc.A00.A0j ? 0 : 8);
                        if (productGalleryFragment2.A0z().AFX(c3bc.A00)) {
                            ((FrameLayout) view).setForeground(new ColorDrawable(C02160Ac.A00(((Hilt_ProductGalleryFragment) productGalleryFragment2).A00, R.color.multi_selection)));
                            view.setSelected(true);
                            return;
                        }
                        ((FrameLayout) view).setForeground(null);
                        view.setSelected(false);
                        return;
                    }
                    throw null;
                } else if (!(this instanceof C3K8)) {
                    C54502ir c54502ir = (C54502ir) c0ts;
                    AnonymousClass097 A00 = ((C40481sK) cursor).A00();
                    if (A00 != null) {
                        C09E c09e = (C09E) A00;
                        c54502ir.A00 = c09e;
                        ImageView imageView3 = c54502ir.A04;
                        DocumentsGalleryFragment documentsGalleryFragment = c54502ir.A0A;
                        imageView3.setImageDrawable(C460324r.A03(((Hilt_DocumentsGalleryFragment) documentsGalleryFragment).A00, c09e));
                        if (TextUtils.isEmpty(((AnonymousClass097) c09e).A04)) {
                            TextView textView = c54502ir.A08;
                            if (!TextUtils.isEmpty(c09e.A1B())) {
                                A0F = AnonymousClass024.A0H(c09e.A1B());
                            } else {
                                A0F = documentsGalleryFragment.A0F(R.string.untitled_document);
                            }
                            textView.setText(A0F);
                        } else {
                            c54502ir.A08.setText(AbstractC54772jK.A02(((Hilt_DocumentsGalleryFragment) documentsGalleryFragment).A00, ((AnonymousClass097) c09e).A04, documentsGalleryFragment.A0z().ACy(), ((GalleryFragmentBase) documentsGalleryFragment).A04));
                        }
                        C09H c09h = ((AnonymousClass097) c09e).A02;
                        if (c09h != null) {
                            File file = c09h.A0F;
                            TextView textView2 = c54502ir.A07;
                            if (file != null) {
                                textView2.setText(C02180Ae.A0k(((GalleryFragmentBase) documentsGalleryFragment).A04, file.length()));
                                textView2.setVisibility(0);
                                c54502ir.A02.setVisibility(0);
                            } else {
                                textView2.setVisibility(8);
                                c54502ir.A02.setVisibility(8);
                            }
                            if (c09e.A00 != 0) {
                                TextView textView3 = c54502ir.A06;
                                textView3.setVisibility(0);
                                c54502ir.A01.setVisibility(0);
                                textView3.setText(C460324r.A09(((GalleryFragmentBase) documentsGalleryFragment).A04, ((AnonymousClass097) c09e).A07, c09e.A00));
                            } else {
                                c54502ir.A06.setVisibility(8);
                                c54502ir.A01.setVisibility(8);
                            }
                            String upperCase = C41961un.A0T(((AnonymousClass097) c09e).A07).toUpperCase(Locale.US);
                            if (TextUtils.isEmpty(upperCase) && !TextUtils.isEmpty(c09e.A1B())) {
                                String A1B = c09e.A1B();
                                if (A1B != null) {
                                    upperCase = AnonymousClass024.A0G(A1B).toUpperCase(Locale.US);
                                } else {
                                    throw null;
                                }
                            }
                            c54502ir.A09.setText(upperCase);
                            if (file != null) {
                                TextView textView4 = c54502ir.A05;
                                textView4.setText(AnonymousClass029.A0n(((GalleryFragmentBase) documentsGalleryFragment).A04, c09e.A0E, false));
                                textView4.setContentDescription(AnonymousClass029.A0n(((GalleryFragmentBase) documentsGalleryFragment).A04, c09e.A0E, true));
                            } else {
                                TextView textView5 = c54502ir.A05;
                                textView5.setText("");
                                textView5.setContentDescription("");
                            }
                            c54502ir.A03.setVisibility(c09e.A0j ? 0 : 8);
                            if (documentsGalleryFragment.A0z().AFX(c09e)) {
                                View view2 = c54502ir.A0H;
                                view2.setBackgroundColor(C02160Ac.A00(documentsGalleryFragment.A00(), R.color.multi_selection));
                                view2.setSelected(true);
                                return;
                            }
                            View view3 = c54502ir.A0H;
                            view3.setBackgroundResource(R.drawable.selector_orange_gradient);
                            view3.setSelected(false);
                            return;
                        }
                        throw null;
                    }
                    throw null;
                } else {
                    final C54522it c54522it = (C54522it) c0ts;
                    int i2 = cursor.getInt(cursor.getColumnIndex("link_index"));
                    LinksGalleryFragment linksGalleryFragment = ((C3K8) this).A00;
                    AnonymousClass092 A032 = ((GalleryFragmentBase) linksGalleryFragment).A05.A0H.A03(cursor, ((GalleryFragmentBase) linksGalleryFragment).A0C);
                    c54522it.A01 = A032;
                    C55072jp c55072jp = c54522it.A00;
                    if (c55072jp != null) {
                        ((AbstractCallableC55022jk) c55072jp).A00.A01();
                    }
                    TextView textView6 = c54522it.A07;
                    textView6.setText("");
                    c54522it.A09.setText("");
                    c54522it.A06.setVisibility(8);
                    View view4 = c54522it.A05;
                    view4.setVisibility(8);
                    c54522it.A0A.setVisibility(8);
                    TextView textView7 = c54522it.A08;
                    textView7.setVisibility(8);
                    LinksGalleryFragment linksGalleryFragment2 = c54522it.A0B;
                    if (linksGalleryFragment2.A0z().AFX(A032)) {
                        View view5 = c54522it.A0H;
                        ((FrameLayout) view5).setForeground(new ColorDrawable(C02160Ac.A00(((Hilt_LinksGalleryFragment) linksGalleryFragment2).A00, R.color.multi_selection)));
                        view5.setSelected(true);
                    } else {
                        View view6 = c54522it.A0H;
                        ((FrameLayout) view6).setForeground(null);
                        view6.setSelected(false);
                    }
                    textView7.setVisibility(c54522it.A03 == null ? 8 : 0);
                    view4.setVisibility(A032.A0j ? 0 : 8);
                    C52682b9 c52682b9 = linksGalleryFragment2.A01;
                    C55072jp c55072jp2 = new C55072jp(linksGalleryFragment2.A00(), linksGalleryFragment2.A04, ((GalleryFragmentBase) linksGalleryFragment2).A04, linksGalleryFragment2.A03, i2, A032, textView6, linksGalleryFragment2.A0z().ACy());
                    c54522it.A00 = c55072jp2;
                    c52682b9.A01.execute(new RunnableEBaseShape0S0300000_I0_0(c52682b9, c55072jp2, new InterfaceC55052jn() { // from class: X.3Ak
                        @Override // X.InterfaceC55052jn
                        public final void AIn(Object obj) {
                            TextView textView8;
                            final C54522it c54522it2 = c54522it;
                            C55112jt c55112jt = (C55112jt) obj;
                            C60892vG c60892vG = c55112jt.A01.A00;
                            c54522it2.A02 = c60892vG.A01;
                            c54522it2.A03 = c60892vG.A02;
                            if (c54522it2.A01 instanceof C03890Hn) {
                                textView8 = c54522it2.A09;
                                textView8.setTypeface(null, 2);
                            } else {
                                textView8 = c54522it2.A09;
                                textView8.setTypeface(null, 0);
                            }
                            c54522it2.A07.setText(c55112jt.A02);
                            textView8.setText(c55112jt.A00);
                            if (c55112jt.A01.A04) {
                                C42471vn c42471vn2 = c54522it2.A0B.A05;
                                AnonymousClass092 anonymousClass092 = c54522it2.A01;
                                ImageView imageView4 = c54522it2.A06;
                                InterfaceC43821y3 interfaceC43821y32 = new InterfaceC43821y3() { // from class: X.3Au
                                    @Override // X.InterfaceC43821y3
                                    public void AKM() {
                                    }

                                    @Override // X.InterfaceC43821y3
                                    public int ADA() {
                                        C54522it c54522it3 = c54522it2;
                                        return c54522it3.A0B.A05.A03(c54522it3.A06.getContext());
                                    }

                                    @Override // X.InterfaceC43821y3
                                    public void AUc(View view7, Bitmap bitmap, AnonymousClass092 anonymousClass0922) {
                                        if (bitmap != null && bitmap.getHeight() != 0 && bitmap.getWidth() != 0) {
                                            ImageView imageView5 = c54522it2.A06;
                                            imageView5.setScaleType(ImageView.ScaleType.CENTER_CROP);
                                            imageView5.setImageBitmap(bitmap);
                                            return;
                                        }
                                        ImageView imageView6 = c54522it2.A06;
                                        imageView6.setVisibility(0);
                                        imageView6.setImageDrawable(C02180Ae.A0O(imageView6.getContext(), R.drawable.ic_group_invite_link, R.color.white_alpha_80));
                                        imageView6.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                                        imageView6.setScaleY(1.5f);
                                        imageView6.setScaleX(1.5f);
                                        imageView6.setBackgroundColor(C02160Ac.A00(imageView6.getContext(), R.color.media_link_thumbnail_background));
                                    }

                                    @Override // X.InterfaceC43821y3
                                    public void AUo(View view7) {
                                        ImageView imageView5 = c54522it2.A06;
                                        imageView5.setScaleType(ImageView.ScaleType.CENTER_CROP);
                                        imageView5.setImageDrawable(new ColorDrawable(-7829368));
                                    }
                                };
                                if (c42471vn2 != null) {
                                    c42471vn2.A09(anonymousClass092, imageView4, interfaceC43821y32, anonymousClass092.A0n);
                                } else {
                                    throw null;
                                }
                            } else {
                                ImageView imageView5 = c54522it2.A06;
                                imageView5.setVisibility(0);
                                imageView5.setImageDrawable(C02180Ae.A0O(imageView5.getContext(), R.drawable.ic_group_invite_link, R.color.white_alpha_80));
                                imageView5.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                                imageView5.setScaleX(1.5f);
                                imageView5.setScaleY(1.5f);
                                imageView5.setBackgroundColor(C02160Ac.A00(imageView5.getContext(), R.color.media_link_thumbnail_background));
                            }
                            String str6 = c55112jt.A01.A00.A00;
                            if (!TextUtils.isEmpty(str6)) {
                                TextView textView9 = c54522it2.A0A;
                                textView9.setText(str6);
                                textView9.setVisibility(0);
                                return;
                            }
                            c54522it2.A0A.setVisibility(8);
                        }
                    }, 8));
                    return;
                }
            }
            throw new IllegalStateException(C000200d.A0D("couldn't move cursor to position ", i));
        }
        throw new IllegalStateException("this should only be called when the cursor is valid");
    }

    public Cursor A0G(Cursor cursor) {
        DataSetObserver dataSetObserver;
        Cursor cursor2 = this.A01;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null && (dataSetObserver = this.A02) != null) {
            cursor2.unregisterDataSetObserver(dataSetObserver);
        }
        this.A01 = cursor;
        if (cursor != null) {
            DataSetObserver dataSetObserver2 = this.A02;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.A00 = cursor.getColumnIndexOrThrow("_id");
            this.A03 = true;
            super.A01.A00();
            return cursor2;
        }
        this.A00 = -1;
        this.A03 = false;
        super.A01.A00();
        return cursor2;
    }
}
