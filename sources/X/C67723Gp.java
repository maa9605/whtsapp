package X;

import android.animation.Animator;
import android.animation.LayoutTransition;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageView;
import com.whatsapp.gallerypicker.PhotoViewPager;
import com.whatsapp.jid.Jid;
import com.whatsapp.mediacomposer.bottombar.BottomBarView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3Gp */
/* loaded from: classes2.dex */
public final class C67723Gp {
    public float A00;
    public float A01;
    public C2EP A02;
    public C67753Gs A03;
    public final int A04;
    public final Context A05;
    public final C018708s A06;
    public final C000500h A07;
    public final C002301c A08;
    public final C0EB A09;
    public final PhotoViewPager A0A;
    public final C48822Gw A0B;
    public final C2HT A0C;
    public final BottomBarView A0D;
    public final boolean A0E;

    public C67723Gp(BottomBarView bottomBarView, C002301c c002301c, C40081rY c40081rY, C0EB c0eb, C018708s c018708s, C000500h c000500h, C43791xz c43791xz, PhotoViewPager photoViewPager, C41961un c41961un, C52132a7 c52132a7, C2Gx c2Gx, C2HT c2ht, C48822Gw c48822Gw, HashSet hashSet, C06F c06f, boolean z) {
        String string;
        Context context = bottomBarView.getContext();
        this.A05 = context;
        this.A0D = bottomBarView;
        this.A08 = c002301c;
        this.A09 = c0eb;
        this.A06 = c018708s;
        this.A07 = c000500h;
        this.A0A = photoViewPager;
        this.A0C = c2ht;
        this.A0B = c48822Gw;
        this.A0E = z;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.gallery_picker_preview_thumb_size);
        this.A04 = dimensionPixelSize;
        this.A03 = new C67753Gs(this.A05, c002301c, c40081rY, c43791xz, this, c2ht, c41961un, c52132a7, c2Gx, hashSet, c06f, c48822Gw, dimensionPixelSize);
        C0AT.A0V(bottomBarView.A0A, 2);
        ViewGroup viewGroup = bottomBarView.A05;
        AnonymousClass088.A1V(viewGroup, R.string.add_caption);
        int i = z ? R.color.selector_media_preview_button : R.color.selector_media_preview_button_old;
        WaImageView waImageView = bottomBarView.A0D;
        waImageView.setImageDrawable(C02160Ac.A03(this.A05, R.drawable.view_once_selector));
        C07O.A0h(waImageView, C02160Ac.A02(this.A05, i));
        C07O.A0h(bottomBarView.A0C, C02160Ac.A02(this.A05, i));
        viewGroup.setLayoutTransition(new LayoutTransition() { // from class: X.2tP
            {
                setAnimator(2, A00(true));
                setAnimator(3, A00(false));
                setDuration(100L);
                setStartDelay(2, 0L);
                setStartDelay(0, 0L);
                setStartDelay(1, 0L);
            }

            public static final Animator A00(boolean z2) {
                float f = !z2 ? 1 : 0;
                float f2 = z2 ? 1.0f : 0.0f;
                return ObjectAnimator.ofPropertyValuesHolder(null, PropertyValuesHolder.ofFloat("scaleX", f, f2), PropertyValuesHolder.ofFloat("scaleY", f, f2));
            }
        });
        bottomBarView.A06.setImageDrawable(new C0We(c002301c, C02160Ac.A03(this.A05, R.drawable.chevron)));
        this.A0D.A06.setImageDrawable(new C0We(this.A08, C02160Ac.A03(this.A05, R.drawable.chevron)));
        List<Jid> list = (List) this.A0B.A00.A01();
        if (list.isEmpty()) {
            this.A0D.A03.setVisibility(8);
            if (!this.A0E) {
                this.A0D.getPrivacyDivider().setVisibility(8);
            }
        } else {
            this.A0D.A03.setVisibility(0);
            if (!this.A0E) {
                this.A0D.getPrivacyDivider().setVisibility(0);
            }
        }
        C018708s c018708s2 = this.A06;
        ArrayList arrayList = new ArrayList();
        for (Jid jid : list) {
            if (!C003101m.A0Z(jid)) {
                arrayList.add(jid);
            }
        }
        if (c018708s2 != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                AbstractC005302j abstractC005302j = (AbstractC005302j) it.next();
                if (c018708s2.A00.A0A(abstractC005302j)) {
                    z2 = true;
                } else {
                    C06C A0A = c018708s2.A01.A0A(abstractC005302j);
                    if (!arrayList2.contains(A0A)) {
                        arrayList2.add(A0A);
                    }
                }
            }
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                C06C c06c = (C06C) it2.next();
                String A04 = c018708s2.A04(c06c);
                if (A04 != null) {
                    if (c06c.A0A()) {
                        arrayList4.add(A04);
                    } else {
                        arrayList3.add(A04);
                    }
                }
            }
            Collections.sort(arrayList3, c018708s2.A0E());
            Collections.sort(arrayList4);
            arrayList3.addAll(arrayList4);
            if (z2) {
                arrayList3.add(c018708s2.A03.A00.getString(R.string.you));
            }
            if (this.A0B.A0A()) {
                C0EB c0eb2 = this.A09;
                Context context2 = this.A05;
                if (c0eb2.A04() == 0) {
                    string = context2.getString(R.string.status_media_privacy_contacts);
                } else {
                    string = context2.getString(R.string.status_media_privacy_custom);
                }
                arrayList3.add(0, string);
            }
            this.A0D.A0B.A03(AnonymousClass029.A0o(this.A08, true, arrayList3));
            ImageView imageView = this.A0D.A07;
            C48822Gw c48822Gw2 = this.A0B;
            if (c48822Gw2.A09 && ((List) c48822Gw2.A00.A01()).isEmpty()) {
                imageView.setImageResource(R.drawable.ic_done);
                imageView.setContentDescription(this.A05.getString(R.string.done));
            } else {
                imageView.setImageDrawable(new C0We(this.A08, C02160Ac.A03(this.A05, R.drawable.input_send)));
                imageView.setContentDescription(this.A05.getString(R.string.send));
            }
            this.A0D.A09.A0k(new AbstractC08920cK(this.A08) { // from class: X.3Go
                public final C002301c A00;

                {
                    this.A00 = r1;
                }

                @Override // X.AbstractC08920cK
                public void A01(Rect rect, View view, RecyclerView recyclerView, C0Y0 c0y0) {
                    int dimensionPixelSize2 = view.getContext().getResources().getDimensionPixelSize(R.dimen.gallery_picker_preview_spacing);
                    if (this.A00.A0M()) {
                        rect.set(0, 0, dimensionPixelSize2, 0);
                    } else {
                        rect.set(dimensionPixelSize2, 0, 0, 0);
                    }
                }
            });
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
            linearLayoutManager.A1Y(0);
            this.A0D.A09.setLayoutManager(linearLayoutManager);
            return;
        }
        throw null;
    }

    public void A00() {
        AlphaAnimation A03 = C000200d.A03(0.0f, 1.0f, 300L);
        A06();
        if (this.A0B.A04().size() > 1) {
            RecyclerView recyclerView = this.A0D.A09;
            recyclerView.clearAnimation();
            recyclerView.startAnimation(A03);
        }
        BottomBarView bottomBarView = this.A0D;
        ImageView imageView = bottomBarView.A07;
        imageView.clearAnimation();
        imageView.startAnimation(A03);
        View captionAndPrivacyLayout = bottomBarView.getCaptionAndPrivacyLayout();
        captionAndPrivacyLayout.clearAnimation();
        captionAndPrivacyLayout.startAnimation(A03);
        ImageView imageView2 = bottomBarView.A06;
        imageView2.clearAnimation();
        imageView2.startAnimation(A03);
        TextEmojiLabel textEmojiLabel = bottomBarView.A0B;
        textEmojiLabel.clearAnimation();
        textEmojiLabel.startAnimation(A03);
    }

    public void A01() {
        if (this.A0B.A09()) {
            TextView textView = this.A0D.A08;
            if (textView.getVisibility() == 4) {
                A04();
                textView.startAnimation(C000200d.A03(0.0f, 1.0f, 300L));
            }
        }
    }

    public void A02() {
        AlphaAnimation A03 = C000200d.A03(1.0f, 0.0f, 300L);
        if (this.A0B.A04().size() > 1) {
            RecyclerView recyclerView = this.A0D.A09;
            recyclerView.clearAnimation();
            recyclerView.startAnimation(A03);
        }
        BottomBarView bottomBarView = this.A0D;
        ImageView imageView = bottomBarView.A07;
        imageView.clearAnimation();
        imageView.startAnimation(A03);
        View captionAndPrivacyLayout = bottomBarView.getCaptionAndPrivacyLayout();
        captionAndPrivacyLayout.clearAnimation();
        captionAndPrivacyLayout.startAnimation(A03);
        ImageView imageView2 = bottomBarView.A06;
        imageView2.clearAnimation();
        imageView2.startAnimation(A03);
        TextEmojiLabel textEmojiLabel = bottomBarView.A0B;
        textEmojiLabel.clearAnimation();
        textEmojiLabel.startAnimation(A03);
        A05();
    }

    public void A03() {
        C48822Gw c48822Gw = this.A0B;
        if (c48822Gw.A09()) {
            TextView textView = this.A0D.A08;
            if (textView.getVisibility() == 0) {
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation.setDuration(300L);
                textView.startAnimation(alphaAnimation);
                if (c48822Gw.A09()) {
                    textView.setVisibility(4);
                }
            }
        }
    }

    public void A04() {
        if (this.A0B.A09()) {
            this.A0D.A08.setVisibility(0);
        }
    }

    public void A05() {
        int i = this.A0B.A04().size() > 1 ? 4 : 8;
        BottomBarView bottomBarView = this.A0D;
        bottomBarView.A09.setVisibility(i);
        bottomBarView.A07.setVisibility(4);
        bottomBarView.getCaptionAndPrivacyLayout().setVisibility(4);
        bottomBarView.A06.setVisibility(4);
        bottomBarView.A0B.setVisibility(4);
    }

    public void A06() {
        int i = this.A0B.A04().size() > 1 ? 0 : 8;
        BottomBarView bottomBarView = this.A0D;
        bottomBarView.A09.setVisibility(i);
        bottomBarView.A07.setVisibility(0);
        bottomBarView.getCaptionAndPrivacyLayout().setVisibility(0);
        bottomBarView.A06.setVisibility(0);
        bottomBarView.A0B.setVisibility(0);
    }

    public void A07(CharSequence charSequence, boolean z) {
        BottomBarView bottomBarView;
        if (TextUtils.isEmpty(charSequence)) {
            BottomBarView bottomBarView2 = this.A0D;
            bottomBarView2.A0A.setText((CharSequence) null);
            bottomBarView2.A05.setContentDescription(this.A05.getString(R.string.add_caption));
            return;
        }
        if (z) {
            bottomBarView = this.A0D;
            TextEmojiLabel textEmojiLabel = bottomBarView.A0A;
            textEmojiLabel.A05(charSequence, null, null, true, 0, true, textEmojiLabel.getCurrentTextColor());
        } else {
            bottomBarView = this.A0D;
            bottomBarView.A0A.setText(charSequence);
        }
        bottomBarView.A05.setContentDescription(charSequence);
    }

    public void A08(boolean z) {
        BottomBarView bottomBarView = this.A0D;
        bottomBarView.A0C.setClickable(z);
        bottomBarView.A07.setClickable(z);
        bottomBarView.A05.setClickable(z);
        bottomBarView.A0D.setClickable(z);
    }
}
