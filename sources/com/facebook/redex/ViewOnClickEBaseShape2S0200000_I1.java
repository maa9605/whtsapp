package com.facebook.redex;

import X.AbstractC02800Cx;
import X.AbstractC04890Mh;
import X.AbstractC15270oM;
import X.AbstractC461425c;
import X.AbstractC636430h;
import X.AbstractC68263Iu;
import X.AnonymousClass029;
import X.AnonymousClass092;
import X.AnonymousClass097;
import X.AnonymousClass337;
import X.AnonymousClass371;
import X.C000200d;
import X.C018308n;
import X.C02820Cz;
import X.C02980Dr;
import X.C04160Iu;
import X.C06C;
import X.C0D0;
import X.C0K0;
import X.C0M6;
import X.C0TS;
import X.C2GQ;
import X.C2HC;
import X.C2LC;
import X.C2N4;
import X.C2S0;
import X.C3BC;
import X.C3IK;
import X.C3YJ;
import X.C3YX;
import X.C3Z9;
import X.C3ZA;
import X.C55992mW;
import X.C61872wr;
import X.C61942wy;
import X.C644433j;
import X.C67973Ho;
import X.C68113Ic;
import X.C68123Id;
import X.C68143If;
import X.C68613Ks;
import X.C68623Kt;
import X.C82953rL;
import X.C82963rM;
import X.C84473tn;
import X.InterfaceC74263cy;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import androidx.recyclerview.widget.GridLayoutManager;
import com.google.android.search.verification.client.R;
import com.whatsapp.biz.collection.view.activity.CollectionProductListActivity;
import com.whatsapp.biz.product.view.activity.ProductDetailActivity;
import com.whatsapp.chatinfo.ContactInfoActivity;
import com.whatsapp.chatinfo.ListChatInfo;
import com.whatsapp.gallery.GalleryFragmentBase;
import com.whatsapp.gallery.ProductGalleryFragment;
import com.whatsapp.group.GroupChatInfo;
import com.whatsapp.inappsupport.ui.FaqItemActivityV2;
import com.whatsapp.inappsupport.ui.SupportTopicsActivity;
import com.whatsapp.inappsupport.ui.SupportTopicsFragment;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.mediacomposer.doodle.shapepicker.ShapePickerRecyclerView;
import com.whatsapp.mentions.MentionableEntry;
import com.whatsapp.migration.android.view.GoogleMigrateImporterActivity;
import com.whatsapp.voipcalling.GlVideoRenderer;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class ViewOnClickEBaseShape2S0200000_I1 extends ViewOnClickEmptyBase implements View.OnClickListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public ViewOnClickEBaseShape2S0200000_I1(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.A02) {
            case 0:
                C55992mW c55992mW = (C55992mW) this.A00;
                c55992mW.A0A.A00(3, null);
                c55992mW.A01.A06(c55992mW.A02, (Intent) this.A01);
                return;
            case 1:
                AbstractC68263Iu abstractC68263Iu = (AbstractC68263Iu) this.A00;
                C2S0 c2s0 = abstractC68263Iu.A04;
                C644433j c644433j = (C644433j) c2s0.A09.get(abstractC68263Iu.A00());
                Context context = abstractC68263Iu.A0H.getContext();
                String str = c644433j.A04;
                String str2 = c644433j.A01;
                int i = c644433j.A00;
                C018308n c018308n = ((AnonymousClass337) abstractC68263Iu).A00;
                Intent intent = new Intent(context, CollectionProductListActivity.class);
                intent.putExtra("collection_id", str);
                intent.putExtra("collection_name", str2);
                intent.putExtra("collection_item_count", i);
                intent.putExtra("cache_jid", ((UserJid) this.A01).getRawString());
                c018308n.A06(context, intent);
                return;
            case 2:
                AnonymousClass371 anonymousClass371 = (AnonymousClass371) this.A00;
                C2LC c2lc = (C2LC) this.A01;
                if (c2lc.A03) {
                    anonymousClass371.A00.A1U(c2lc);
                    return;
                }
                return;
            case 3:
                C2GQ c2gq = (C2GQ) this.A00;
                Activity activity = (Activity) this.A01;
                ContactInfoActivity.A03(c2gq.A0D, activity, C2HC.A04(activity, c2gq.A0G.findViewById(R.id.transition_start), c2gq.A0J.A00(R.string.transition_photo)));
                return;
            case 4:
                C2GQ c2gq2 = (C2GQ) this.A00;
                Activity activity2 = (Activity) this.A01;
                GroupChatInfo.A01(c2gq2.A0D, activity2, C2HC.A04(activity2, c2gq2.A0G.findViewById(R.id.transition_start), c2gq2.A0J.A00(R.string.transition_photo)));
                return;
            case 5:
                C2GQ c2gq3 = (C2GQ) this.A00;
                Activity activity3 = (Activity) this.A01;
                ListChatInfo.A01(c2gq3.A0D, activity3, C2HC.A04(activity3, c2gq3.A0G.findViewById(R.id.transition_start), c2gq3.A0J.A00(R.string.transition_photo)));
                return;
            case 6:
                C3BC c3bc = (C3BC) this.A00;
                C04160Iu c04160Iu = (C04160Iu) this.A01;
                AnonymousClass092 anonymousClass092 = c3bc.A00;
                if (anonymousClass092 != null) {
                    ProductGalleryFragment productGalleryFragment = c3bc.A04;
                    if (productGalleryFragment.A0z().AEZ()) {
                        productGalleryFragment.A0z().AVe(anonymousClass092);
                        ((AbstractC04890Mh) ((GalleryFragmentBase) productGalleryFragment).A09).A01.A00();
                        return;
                    }
                    productGalleryFragment.A01.A01(3);
                    boolean A0A = productGalleryFragment.A00.A0A(c04160Iu.A01);
                    UserJid userJid = c04160Iu.A01;
                    String str3 = c04160Iu.A04;
                    ImageView imageView = c3bc.A02;
                    C2N4.A00(userJid, str3, A0A, Integer.valueOf(imageView.getWidth()), Integer.valueOf(imageView.getHeight()), productGalleryFragment.A0A(), new Intent(productGalleryFragment.A09(), ProductDetailActivity.class), 7);
                    return;
                }
                return;
            case 7:
                C61872wr c61872wr = (C61872wr) this.A01;
                SupportTopicsActivity supportTopicsActivity = ((C61942wy) this.A00).A00;
                String str4 = c61872wr.A01;
                if (!TextUtils.isEmpty(str4)) {
                    String str5 = c61872wr.A04;
                    Intent intent2 = new Intent(supportTopicsActivity, FaqItemActivityV2.class);
                    intent2.putExtra("com.whatsapp.inappsupport.ui.FaqItemActivityV2.html_content", str4);
                    if (!TextUtils.isEmpty(str5)) {
                        intent2.putExtra("com.whatsapp.inappsupport.ui.FaqItemActivityV2.url", str5);
                    }
                    supportTopicsActivity.startActivityForResult(intent2, 15);
                    return;
                }
                ArrayList<? extends Parcelable> arrayList = c61872wr.A05;
                if (arrayList != null && !arrayList.isEmpty()) {
                    MenuItem menuItem = supportTopicsActivity.A02;
                    if (menuItem != null) {
                        menuItem.setVisible(c61872wr.A06);
                    }
                    AbstractC02800Cx A0N = supportTopicsActivity.A0N();
                    SupportTopicsFragment supportTopicsFragment = new SupportTopicsFragment();
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("parent_topic", c61872wr);
                    bundle.putParcelableArrayList("topics", arrayList);
                    supportTopicsFragment.A0P(bundle);
                    if (A0N != null) {
                        C02820Cz c02820Cz = new C02820Cz(A0N);
                        c02820Cz.A03(c61872wr.A02);
                        ((C0D0) c02820Cz).A02 = R.anim.enter_from_right;
                        c02820Cz.A03 = R.anim.exit_to_left;
                        c02820Cz.A04 = R.anim.enter_from_left;
                        c02820Cz.A05 = R.anim.exit_to_right;
                        c02820Cz.A01(R.id.support_topics_container, supportTopicsFragment, null);
                        c02820Cz.A04();
                        supportTopicsActivity.A04.add(supportTopicsFragment);
                        return;
                    }
                    throw null;
                }
                supportTopicsActivity.A1P(c61872wr);
                return;
            case 8:
                ((C68613Ks) this.A00).A06.A0S((C0K0) this.A01);
                return;
            case 9:
                ((C68623Kt) this.A00).A04.A0S((C0K0) this.A01);
                return;
            case 10:
                C67973Ho c67973Ho = (C67973Ho) this.A00;
                int A00 = ((C0TS) this.A01).A00();
                if (A00 != -1) {
                    AbstractC636430h abstractC636430h = c67973Ho.A02;
                    abstractC636430h.A02 = false;
                    c67973Ho.A0H(A00);
                    ShapePickerRecyclerView shapePickerRecyclerView = abstractC636430h.A08;
                    int intValue = ((Number) c67973Ho.A01.get(A00)).intValue();
                    GridLayoutManager gridLayoutManager = shapePickerRecyclerView.A06;
                    if (gridLayoutManager != null) {
                        AbstractC15270oM abstractC15270oM = shapePickerRecyclerView.A07;
                        abstractC15270oM.A00 = intValue;
                        gridLayoutManager.A0W(abstractC15270oM);
                        return;
                    }
                    throw new IllegalStateException("Must set adapter first");
                }
                return;
            case GoogleMigrateImporterActivity.A0E /* 11 */:
                ((C3IK) this.A00).A00.A1L((AnonymousClass097) this.A01, 0, false);
                return;
            case 12:
                C06C c06c = (C06C) this.A01;
                MentionableEntry mentionableEntry = (MentionableEntry) ((C68143If) this.A00).A0F;
                Editable text = mentionableEntry.getText();
                if (c06c != null) {
                    mentionableEntry.A0E(true);
                    C02980Dr c02980Dr = mentionableEntry.A0F;
                    if (c02980Dr != null) {
                        String A02 = c02980Dr.A02(c06c);
                        int min = Math.min(mentionableEntry.A05(text, 0), mentionableEntry.getSelectionStart());
                        if (min < 0) {
                            min = mentionableEntry.getSelectionStart();
                        }
                        int i2 = min + 1;
                        String A0H = C000200d.A0H("@", A02);
                        mentionableEntry.A0B(mentionableEntry.A0D);
                        mentionableEntry.A0D = null;
                        int selectionEnd = mentionableEntry.getSelectionEnd();
                        StringBuilder sb = new StringBuilder();
                        sb.append(A0H);
                        sb.append(" ");
                        text.replace(min, selectionEnd, sb.toString());
                        C68113Ic c68113Ic = new C68113Ic(mentionableEntry.A00, true);
                        text.setSpan(c68113Ic, min, i2, 33);
                        int i3 = mentionableEntry.A01;
                        Jid A03 = c06c.A03(UserJid.class);
                        if (A03 != null) {
                            C68123Id c68123Id = new C68123Id(i3, AnonymousClass029.A0r((UserJid) A03), c68113Ic);
                            text.setSpan(c68123Id, i2, A02.length() + i2, 33);
                            mentionableEntry.setSelection(0);
                            mentionableEntry.setSelection(text.getSpanEnd(c68123Id) + 1);
                            mentionableEntry.A0D(null);
                            mentionableEntry.A0E(false);
                            return;
                        }
                        throw null;
                    }
                    throw null;
                }
                return;
            case 13:
                C82963rM c82963rM = ((C82953rL) this.A00).A02;
                int i4 = ((C3YJ) this.A01).A00 + 1;
                AbstractC461425c abstractC461425c = c82963rM.A04;
                if (abstractC461425c != null) {
                    abstractC461425c.A02(i4, true);
                    return;
                }
                return;
            case 14:
                C82963rM c82963rM2 = ((C82953rL) this.A00).A02;
                int i5 = ((C3YJ) this.A01).A00;
                AbstractC461425c abstractC461425c2 = c82963rM2.A04;
                if (abstractC461425c2 != null) {
                    abstractC461425c2.A02(i5, true);
                    return;
                }
                return;
            case 15:
                C82963rM c82963rM3 = ((C82953rL) this.A00).A02;
                int i6 = ((C3YJ) this.A01).A00 + 2;
                AbstractC461425c abstractC461425c3 = c82963rM3.A04;
                if (abstractC461425c3 != null) {
                    abstractC461425c3.A02(i6, true);
                    return;
                }
                return;
            case GlVideoRenderer.CAP_RENDER_I420 /* 16 */:
                C82963rM c82963rM4 = ((C82953rL) this.A00).A02;
                int i7 = ((C3YJ) this.A01).A00;
                AbstractC461425c abstractC461425c4 = c82963rM4.A04;
                if (abstractC461425c4 != null) {
                    abstractC461425c4.A02(i7, true);
                    return;
                }
                return;
            case 17:
                C82963rM c82963rM5 = ((C82953rL) this.A00).A02;
                int i8 = ((C3YJ) this.A01).A00 + 3;
                AbstractC461425c abstractC461425c5 = c82963rM5.A04;
                if (abstractC461425c5 != null) {
                    abstractC461425c5.A02(i8, true);
                    return;
                }
                return;
            case 18:
                ((C3YX) this.A00).A00.AIP(((CompoundButton) this.A01).isChecked());
                return;
            case 19:
                ((C3ZA) this.A00).A00.A1T((C3Z9) this.A01);
                return;
            case C0M6.A01 /* 20 */:
                C84473tn c84473tn = (C84473tn) this.A00;
                UserJid userJid2 = (UserJid) this.A01;
                InterfaceC74263cy interfaceC74263cy = c84473tn.A09.A05;
                if (interfaceC74263cy != null) {
                    interfaceC74263cy.AIF(userJid2);
                }
                c84473tn.A08.remove(userJid2);
                ((AbstractC04890Mh) c84473tn).A01.A00();
                return;
            default:
                return;
        }
    }
}
