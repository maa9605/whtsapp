package com.whatsapp.storage;

import X.AbstractC005302j;
import X.AbstractC02800Cx;
import X.ActivityC02270An;
import X.ActivityC02290Ap;
import X.ActivityC02310Ar;
import X.AnonymousClass011;
import X.AnonymousClass088;
import X.AnonymousClass092;
import X.AnonymousClass094;
import X.C002301c;
import X.C003101m;
import X.C00A;
import X.C00T;
import X.C018608r;
import X.C018708s;
import X.C01C;
import X.C02180Ae;
import X.C02820Cz;
import X.C02980Dr;
import X.C02E;
import X.C02L;
import X.C02O;
import X.C05W;
import X.C06C;
import X.C09F;
import X.C0AT;
import X.C0C8;
import X.C0C9;
import X.C0ED;
import X.C0ES;
import X.C0HE;
import X.C0L5;
import X.C0LD;
import X.C0O8;
import X.C0U0;
import X.C0U1;
import X.C0U2;
import X.C0Zn;
import X.C25Q;
import X.C2AR;
import X.C2AT;
import X.C2M4;
import X.C2MG;
import X.C2MK;
import X.C2MN;
import X.C2QF;
import X.C3A9;
import X.C40411sD;
import X.C40731sm;
import X.C41541u6;
import X.C41771uU;
import X.C42451vl;
import X.C43081wp;
import X.C43791xz;
import X.C58712ra;
import X.C59232sQ;
import X.C658038p;
import X.C83123rc;
import X.C83143re;
import X.C83243ro;
import X.C86533xi;
import X.InterfaceC002901k;
import X.InterfaceC04690Ll;
import X.InterfaceC53992hs;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.facebook.redex.ViewOnClickEBaseShape5S0100000_I0_5;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.dialogs.ProgressDialogFragment;
import com.whatsapp.gallery.MediaGalleryFragmentBase;
import com.whatsapp.storage.StorageUsageGalleryActivity;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class StorageUsageGalleryActivity extends C2QF implements InterfaceC04690Ll {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public ViewGroup A04;
    public C0O8 A05;
    public C0U0 A06;
    public C0HE A07;
    public C02L A08;
    public C018608r A09;
    public C41541u6 A0A;
    public C05W A0B;
    public C018708s A0C;
    public C0Zn A0D;
    public C0L5 A0E;
    public C2MK A0F;
    public C59232sQ A0G;
    public C0C9 A0H;
    public C0C8 A0I;
    public C3A9 A0J;
    public C40411sD A0K;
    public C00A A0L;
    public C43081wp A0M;
    public C25Q A0N;
    public C06C A0O;
    public C0ED A0P;
    public ProgressDialogFragment A0Q;
    public AnonymousClass011 A0R;
    public C0ES A0S;
    public AbstractC005302j A0T;
    public C41771uU A0U;
    public C42451vl A0V;
    public C02980Dr A0W;
    public C02O A0X;
    public C2MN A0Y;
    public C2AR A0Z;
    public C2M4 A0a;
    public C2AT A0b;
    public C2MG A0c;
    public StorageUsageMediaGalleryFragment A0d;
    public InterfaceC002901k A0e;
    public Runnable A0f;
    public Runnable A0g;
    public String A0h;
    public final Handler A0i = new Handler(Looper.getMainLooper());
    public final Runnable A0l = new RunnableEBaseShape7S0100000_I0_7(this, 8);
    public final C00T A0j = new C00T() { // from class: X.3rn
        {
            StorageUsageGalleryActivity.this = this;
        }

        @Override // X.C00T
        public void A0B(Collection collection, Map map, Map map2) {
            StorageUsageGalleryActivity storageUsageGalleryActivity = StorageUsageGalleryActivity.this;
            storageUsageGalleryActivity.A0i.removeCallbacks(storageUsageGalleryActivity.A0l);
            Runnable runnable = storageUsageGalleryActivity.A0f;
            if (runnable != null) {
                runnable.run();
            }
        }
    };
    public final InterfaceC53992hs A0k = new C83243ro(this);
    public final Runnable A0m = new RunnableEBaseShape7S0100000_I0_7(this, 7);

    @Override // X.InterfaceC04690Ll
    public void A5M(AnonymousClass094 anonymousClass094) {
    }

    @Override // X.InterfaceC04690Ll
    public void A5Q(View view, Drawable drawable) {
    }

    @Override // X.InterfaceC04690Ll
    public void A7F(AnonymousClass094 anonymousClass094) {
    }

    @Override // X.InterfaceC04690Ll
    public void A85(AnonymousClass092 anonymousClass092) {
    }

    @Override // X.InterfaceC04690Ll
    public C58712ra A8N() {
        return null;
    }

    @Override // X.InterfaceC04690Ll
    public int A95() {
        return 0;
    }

    @Override // X.InterfaceC04690Ll
    public int A9c(C09F c09f) {
        return 0;
    }

    @Override // X.InterfaceC04690Ll
    public ArrayList ACy() {
        return null;
    }

    @Override // X.InterfaceC04700Lm
    public C43791xz ADH() {
        return null;
    }

    @Override // X.InterfaceC04690Ll
    public int ADT(AnonymousClass092 anonymousClass092) {
        return 0;
    }

    @Override // X.InterfaceC04690Ll
    public boolean AFv(AnonymousClass092 anonymousClass092) {
        return false;
    }

    @Override // X.InterfaceC04690Ll
    public void ASG(AnonymousClass092 anonymousClass092) {
    }

    @Override // X.InterfaceC04690Ll
    public void ATz(AnonymousClass092 anonymousClass092, int i) {
    }

    @Override // X.InterfaceC04690Ll
    public boolean AUN(AnonymousClass094 anonymousClass094) {
        return true;
    }

    @Override // X.InterfaceC04690Ll
    public void AVq(C09F c09f, long j) {
    }

    @Override // X.InterfaceC04690Ll
    public void AVt(AnonymousClass092 anonymousClass092) {
    }

    public static Intent A00(Context context, int i, AbstractC005302j abstractC005302j, long j, String str, int i2) {
        Intent intent = new Intent(context, StorageUsageGalleryActivity.class);
        intent.putExtra("gallery_type", i);
        String str2 = null;
        if (i == 0) {
            if (abstractC005302j != null) {
                str2 = abstractC005302j.getRawString();
            } else {
                throw null;
            }
        }
        intent.putExtra("jid", str2);
        intent.putExtra("memory_size", j);
        intent.putExtra("session_id", str);
        intent.putExtra("entry_point", i2);
        return intent;
    }

    public final void A1P() {
        Handler handler = this.A0i;
        handler.removeCallbacks(this.A0m);
        Runnable runnable = this.A0g;
        if (runnable != null) {
            handler.removeCallbacks(runnable);
            this.A0g = null;
        }
        ProgressDialogFragment progressDialogFragment = this.A0Q;
        if (progressDialogFragment != null) {
            progressDialogFragment.A11();
            this.A0Q = null;
        }
        C3A9 c3a9 = this.A0J;
        if (c3a9 != null) {
            c3a9.A05(true);
            this.A0J = null;
        }
        C0HE c0he = this.A07;
        if (c0he != null) {
            c0he.A01();
            this.A07 = null;
        }
    }

    public final void A1Q() {
        TextView textView = (TextView) C0AT.A0D(this.A04, R.id.storage_usage_detail_all_size);
        long j = this.A03;
        if (j >= 0) {
            textView.setText(C02180Ae.A0l(((ActivityC02310Ar) this).A01, Math.max(j - this.A02, 0L)));
            textView.setVisibility(0);
            return;
        }
        textView.setVisibility(8);
    }

    public final void A1R() {
        C59232sQ c59232sQ;
        C0U0 c0u0 = this.A06;
        if (c0u0 == null || (c59232sQ = this.A0G) == null) {
            return;
        }
        if (c59232sQ.isEmpty()) {
            c0u0.A05();
            return;
        }
        AnonymousClass088.A1C(this, ((ActivityC02290Ap) this).A0E, ((ActivityC02310Ar) this).A01.A0A(R.plurals.n_items_selected, c59232sQ.size(), Integer.valueOf(c59232sQ.size())));
        this.A06.A06();
    }

    @Override // X.InterfaceC04690Ll
    public C658038p A99() {
        return this.A0F.A01;
    }

    @Override // X.InterfaceC04690Ll
    public boolean AEZ() {
        return this.A0G != null;
    }

    @Override // X.InterfaceC04690Ll
    public boolean AFX(AnonymousClass092 anonymousClass092) {
        C59232sQ c59232sQ = this.A0G;
        return c59232sQ != null && c59232sQ.containsKey(anonymousClass092.A0n);
    }

    @Override // X.InterfaceC04690Ll
    public void ATr(List list, boolean z) {
        if (this.A0G == null) {
            this.A0G = new C59232sQ(((ActivityC02290Ap) this).A0A, this.A0L, null, new C83143re(this));
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass092 anonymousClass092 = (AnonymousClass092) it.next();
            C59232sQ c59232sQ = this.A0G;
            if (z) {
                c59232sQ.put(anonymousClass092.A0n, anonymousClass092);
            } else {
                c59232sQ.remove(anonymousClass092.A0n);
            }
        }
        A1R();
    }

    @Override // X.InterfaceC04690Ll
    public void AV2(AnonymousClass092 anonymousClass092) {
        C59232sQ c59232sQ = new C59232sQ(((ActivityC02290Ap) this).A0A, this.A0L, this.A0G, new C83143re(this));
        this.A0G = c59232sQ;
        c59232sQ.put(anonymousClass092.A0n, anonymousClass092);
        this.A06 = A0e(this.A05);
        C02E c02e = ((ActivityC02290Ap) this).A0E;
        C002301c c002301c = ((ActivityC02310Ar) this).A01;
        C59232sQ c59232sQ2 = this.A0G;
        AnonymousClass088.A1C(this, c02e, c002301c.A0A(R.plurals.n_items_selected, c59232sQ2.size(), Integer.valueOf(c59232sQ2.size())));
    }

    @Override // X.InterfaceC04690Ll
    public boolean AVe(AnonymousClass092 anonymousClass092) {
        C59232sQ c59232sQ = this.A0G;
        if (c59232sQ == null) {
            c59232sQ = new C59232sQ(((ActivityC02290Ap) this).A0A, this.A0L, null, new C83143re(this));
            this.A0G = c59232sQ;
        }
        AnonymousClass094 anonymousClass094 = anonymousClass092.A0n;
        boolean containsKey = c59232sQ.containsKey(anonymousClass094);
        C59232sQ c59232sQ2 = this.A0G;
        if (containsKey) {
            c59232sQ2.remove(anonymousClass094);
            A1R();
        } else {
            c59232sQ2.put(anonymousClass094, anonymousClass092);
            A1R();
        }
        return !containsKey;
    }

    public /* synthetic */ void lambda$initToolbar$2568$StorageUsageGalleryActivity(View view) {
        onBackPressed();
    }

    public void lambda$initToolbar$2570$StorageUsageGalleryActivity(View view) {
        StorageUsageMediaGalleryFragment storageUsageMediaGalleryFragment = this.A0d;
        if (storageUsageMediaGalleryFragment != null) {
            int i = ((MediaGalleryFragmentBase) storageUsageMediaGalleryFragment).A02;
            boolean z = true;
            z = (((ActivityC02290Ap) this).A0B.A0E(C01C.A0l) && this.A01 == 1) ? false : false;
            StorageUsageGallerySortBottomSheet storageUsageGallerySortBottomSheet = new StorageUsageGallerySortBottomSheet();
            Bundle bundle = new Bundle();
            bundle.putInt("storage_usage_gallery_sort_bottom_sheet_selected_sort_row", i);
            bundle.putBoolean("storage_usage_gallery_sort_bottom_sheet_show_forwarding_score", z);
            storageUsageGallerySortBottomSheet.A0P(bundle);
            storageUsageGallerySortBottomSheet.A00 = new C83123rc(this);
            AUh(storageUsageGallerySortBottomSheet);
        }
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02340Au, android.app.Activity
    public void onBackPressed() {
        long j = this.A02;
        if (j >= 0) {
            if (j > this.A03) {
                Log.e("Deleted media size is greater than the total media size");
            }
            Intent intent = new Intent();
            AbstractC005302j abstractC005302j = this.A0T;
            if (abstractC005302j != null) {
                intent.putExtra("jid", C003101m.A07(abstractC005302j));
            }
            intent.putExtra("gallery_type", this.A01);
            intent.putExtra("memory_size", Math.max(this.A03 - this.A02, 0L));
            intent.putExtra("deleted_size", this.A02);
            setResult(1, intent);
        }
        super.onBackPressed();
    }

    @Override // X.C2QF, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        A0z();
        setContentView(R.layout.activity_storage_usage_gallery);
        this.A05 = new C86533xi(this, this, ((ActivityC02290Ap) this).A0A, this.A0W, this.A0a, this.A08, this.A0e, this.A0c, this.A0R, ((ActivityC02290Ap) this).A0B, this.A0A, this.A09, this.A0Y, ((ActivityC02270An) this).A00, this.A0B, this.A0P, ((ActivityC02290Ap) this).A0E, this.A0C, ((ActivityC02310Ar) this).A01, this.A0S, this.A0Z, this.A0b, this.A0M, this.A0V, this.A0U, this.A0I, this.A0X);
        this.A0D = this.A0E.A04(this);
        int intExtra = getIntent().getIntExtra("gallery_type", 0);
        this.A01 = intExtra;
        if (intExtra == 0) {
            AbstractC005302j A02 = AbstractC005302j.A02(getIntent().getStringExtra("jid"));
            if (A02 != null) {
                this.A0T = A02;
                this.A0O = this.A0B.A09(A02);
            } else {
                throw null;
            }
        }
        this.A03 = getIntent().getLongExtra("memory_size", 0L);
        this.A0h = getIntent().getStringExtra("session_id");
        this.A00 = getIntent().getIntExtra("entry_point", 0);
        if (bundle != null) {
            this.A0d = (StorageUsageMediaGalleryFragment) A0N().A0Q.A01("storage_usage_gallery_fragment_tag");
            List<AnonymousClass094> A04 = C0LD.A04(bundle);
            if (A04 != null) {
                for (AnonymousClass094 anonymousClass094 : A04) {
                    AnonymousClass092 A0F = this.A0H.A0F(anonymousClass094);
                    if (A0F != null) {
                        C59232sQ c59232sQ = this.A0G;
                        if (c59232sQ == null) {
                            c59232sQ = new C59232sQ(((ActivityC02290Ap) this).A0A, this.A0L, null, new C83143re(this));
                            this.A0G = c59232sQ;
                        }
                        c59232sQ.put(anonymousClass094, A0F);
                    }
                }
                if (this.A0G != null) {
                    this.A06 = A0e(this.A05);
                }
            }
            this.A02 = bundle.getLong("deleted_size");
        } else {
            int i = this.A01;
            AbstractC005302j abstractC005302j = this.A0T;
            if (abstractC005302j != null) {
                str = abstractC005302j.getRawString();
            } else {
                str = null;
            }
            StorageUsageMediaGalleryFragment storageUsageMediaGalleryFragment = new StorageUsageMediaGalleryFragment();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("storage_media_gallery_fragment_gallery_type", i);
            bundle2.putString("storage_media_gallery_fragment_jid", str);
            bundle2.putInt("sort_type", 2);
            storageUsageMediaGalleryFragment.A0P(bundle2);
            this.A0d = storageUsageMediaGalleryFragment;
            AbstractC02800Cx A0N = A0N();
            if (A0N != null) {
                C02820Cz c02820Cz = new C02820Cz(A0N);
                c02820Cz.A09(R.id.storage_usage_gallery_container, this.A0d, "storage_usage_gallery_fragment_tag", 1);
                c02820Cz.A04();
                this.A02 = 0L;
            } else {
                throw null;
            }
        }
        this.A0N.A07.add(this.A0k);
        this.A0L.A01(this.A0j);
        C0U1 A0c = A0c();
        if (A0c != null) {
            A0c.A0L(false);
            A0c.A0O(false);
            View findViewById = findViewById(R.id.toolbar);
            if (findViewById != null) {
                ((Toolbar) findViewById).A09();
                View inflate = LayoutInflater.from(this).inflate(R.layout.storage_usage_detail_toolbar, (ViewGroup) null, false);
                if (inflate != null) {
                    ViewGroup viewGroup = (ViewGroup) inflate;
                    this.A04 = viewGroup;
                    ImageView imageView = (ImageView) C0AT.A0D(viewGroup, R.id.storage_usage_back_button);
                    imageView.setOnClickListener(new ViewOnClickEBaseShape5S0100000_I0_5(this, 33));
                    if (((ActivityC02310Ar) this).A01.A0M()) {
                        imageView.setImageResource(R.drawable.ic_back);
                    } else {
                        imageView.setImageResource(R.drawable.ic_back_rtl);
                    }
                    View A0D = C0AT.A0D(this.A04, R.id.storage_usage_sort_button);
                    A0D.setVisibility(0);
                    A0D.setOnClickListener(new ViewOnClickEBaseShape5S0100000_I0_5(this, 35));
                    A0c.A0M(true);
                    A0c.A0E(this.A04, new C0U2(-1, -1));
                    TextEmojiLabel textEmojiLabel = (TextEmojiLabel) C0AT.A0D(this.A04, R.id.storage_usage_detail_name);
                    View A0D2 = C0AT.A0D(this.A04, R.id.storage_usage_contact_photo_container);
                    ImageView imageView2 = (ImageView) C0AT.A0D(this.A04, R.id.storage_usage_contact_photo);
                    int i2 = this.A01;
                    if (i2 == 2) {
                        textEmojiLabel.setText(C40731sm.A0O(this, ((ActivityC02310Ar) this).A01));
                        A0D2.setVisibility(8);
                    } else if (i2 == 1) {
                        textEmojiLabel.setText(R.string.storage_usage_forwarded_files_title);
                        A0D2.setVisibility(8);
                    } else if (i2 == 0) {
                        C018708s c018708s = this.A0C;
                        C06C c06c = this.A0O;
                        if (c06c != null) {
                            textEmojiLabel.A03(c018708s.A08(c06c, false));
                            A0D2.setVisibility(0);
                            this.A0D.A02(this.A0O, imageView2);
                        } else {
                            throw null;
                        }
                    }
                    textEmojiLabel.setEllipsize(TextUtils.TruncateAt.MARQUEE);
                    textEmojiLabel.setMarqueeRepeatLimit(1);
                    textEmojiLabel.setOnClickListener(new ViewOnClickEBaseShape5S0100000_I0_5(textEmojiLabel, 34));
                    ((ActivityC02290Ap) this).A0A.A02.postDelayed(new RunnableEBaseShape4S0200000_I0_4(this, textEmojiLabel, 36), 1000L);
                    A1Q();
                    return;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C59232sQ c59232sQ = this.A0G;
        if (c59232sQ != null) {
            c59232sQ.A00();
            this.A0G = null;
        }
        this.A0d = null;
        C25Q c25q = this.A0N;
        c25q.A07.remove(this.A0k);
        this.A0i.removeCallbacks(null);
        A1P();
        this.A0L.A00(this.A0j);
    }

    @Override // X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C59232sQ c59232sQ = this.A0G;
        if (c59232sQ != null) {
            ArrayList arrayList = new ArrayList();
            for (AnonymousClass092 anonymousClass092 : c59232sQ.values()) {
                arrayList.add(anonymousClass092.A0n);
            }
            C0LD.A08(bundle, arrayList);
        }
        bundle.putLong("deleted_size", this.A02);
    }
}
