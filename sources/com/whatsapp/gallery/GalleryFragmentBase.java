package com.whatsapp.gallery;

import X.AbstractC005302j;
import X.AbstractC04890Mh;
import X.AbstractC54512is;
import X.ActivityC02330At;
import X.C000700j;
import X.C002301c;
import X.C00A;
import X.C00T;
import X.C012706e;
import X.C02F;
import X.C03690Gr;
import X.C05F;
import X.C0AT;
import X.C0C9;
import X.C0CD;
import X.C0D5;
import X.C0HD;
import X.C0HE;
import X.C0IU;
import X.C0M6;
import X.C2NE;
import X.C40481sK;
import X.C66343Ar;
import X.C66353As;
import X.InterfaceC002901k;
import X.InterfaceC04690Ll;
import X.InterfaceC53322di;
import android.database.Cursor;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.search.verification.client.R;
import com.whatsapp.gallery.GalleryFragmentBase;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class GalleryFragmentBase extends Hilt_GalleryFragmentBase implements InterfaceC53322di {
    public View A01;
    public RecyclerView A02;
    public C02F A03;
    public C0C9 A05;
    public C00A A07;
    public C05F A08;
    public AbstractC54512is A09;
    public C66343Ar A0A;
    public C66353As A0B;
    public AbstractC005302j A0C;
    public InterfaceC002901k A0D;
    public final String A0G;
    public C002301c A04;
    public C0IU A06 = new C0IU(this.A04);
    public String A0E = "";
    public int A00 = -1;
    public final ArrayList A0H = new ArrayList();
    public final C00T A0F = new C00T() { // from class: X.3Aq
        {
            GalleryFragmentBase.this = this;
        }

        @Override // X.C00T
        public void A0A(Collection collection, AbstractC005302j abstractC005302j, Map map, boolean z) {
            if (collection != null && !collection.isEmpty()) {
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    AbstractC005302j abstractC005302j2 = ((AnonymousClass092) it.next()).A0n.A00;
                    if (abstractC005302j2 != null) {
                        GalleryFragmentBase galleryFragmentBase = GalleryFragmentBase.this;
                        if (abstractC005302j2.equals(galleryFragmentBase.A0C)) {
                            galleryFragmentBase.A10();
                            return;
                        }
                    }
                }
            } else if (abstractC005302j != null && !abstractC005302j.equals(GalleryFragmentBase.this.A0C)) {
            } else {
                GalleryFragmentBase.this.A10();
            }
        }

        @Override // X.C00T
        public void A0B(Collection collection, Map map, Map map2) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                AbstractC005302j abstractC005302j = ((AnonymousClass092) it.next()).A0n.A00;
                if (abstractC005302j != null) {
                    GalleryFragmentBase galleryFragmentBase = GalleryFragmentBase.this;
                    if (abstractC005302j.equals(galleryFragmentBase.A0C)) {
                        galleryFragmentBase.A10();
                        return;
                    }
                }
            }
        }
    };

    public GalleryFragmentBase(String str) {
        this.A0G = str;
    }

    @Override // X.C0BA
    public void A0j(Bundle bundle) {
        this.A0U = true;
        AbstractC005302j A02 = AbstractC005302j.A02(A0A().getIntent().getStringExtra("jid"));
        if (A02 != null) {
            this.A0C = A02;
            View A05 = A05();
            this.A01 = A05.findViewById(16908292);
            RecyclerView recyclerView = (RecyclerView) A05.findViewById(R.id.grid);
            this.A02 = recyclerView;
            C0AT.A0f(recyclerView, true);
            C0AT.A0f(super.A0A.findViewById(16908292), true);
            ActivityC02330At A09 = A09();
            if (A09 instanceof MediaGalleryActivity) {
                this.A02.A0m(((MediaGalleryActivity) A09).A0n);
            }
            this.A07.A01(this.A0F);
            View view = super.A0A;
            if (view != null) {
                view.findViewById(R.id.progress_bar).setVisibility(0);
            }
            A10();
            return;
        }
        throw null;
    }

    @Override // X.C0BA
    public View A0p(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.gallery_fragment, viewGroup, false);
    }

    @Override // X.C0BA
    public void A0q() {
        this.A0U = true;
        this.A07.A00(this.A0F);
        Cursor A0G = this.A09.A0G(null);
        if (A0G != null) {
            A0G.close();
        }
        C66353As c66353As = this.A0B;
        if (c66353As != null) {
            c66353As.A0A();
            this.A0B = null;
        }
        C66343Ar c66343Ar = this.A0A;
        if (c66343Ar != null) {
            c66343Ar.A05(true);
            synchronized (c66343Ar) {
                C0HE c0he = c66343Ar.A00;
                if (c0he != null) {
                    c0he.A01();
                }
            }
            this.A0A = null;
        }
    }

    @Override // X.C0BA
    public void A0s() {
        this.A0U = true;
        A11();
    }

    public Cursor A0y(AbstractC005302j abstractC005302j, C0IU c0iu, C0HE c0he) {
        Cursor A08;
        C0CD A03;
        Cursor A082;
        Cursor A083;
        if (this instanceof ProductGalleryFragment) {
            ProductGalleryFragment productGalleryFragment = (ProductGalleryFragment) this;
            C012706e c012706e = productGalleryFragment.A05;
            C0D5 c0d5 = productGalleryFragment.A04;
            C0CD A032 = c012706e.A02.A03();
            try {
                c0iu.A02();
                if (c0iu.A06()) {
                    c0iu.A02 = 112;
                    A08 = A032.A02.A08(C0HD.A0R, new String[]{c0d5.A0B(c0iu, c0he)}, c0he);
                } else {
                    A08 = A032.A02.A08(C0HD.A0s, new String[]{String.valueOf(c012706e.A00.A05(abstractC005302j))}, c0he);
                }
                A032.close();
                return A08;
            } finally {
                try {
                    throw th;
                } finally {
                    try {
                        A032.close();
                    } catch (Throwable unused) {
                    }
                }
            }
        } else if (!(this instanceof LinksGalleryFragment)) {
            DocumentsGalleryFragment documentsGalleryFragment = (DocumentsGalleryFragment) this;
            C0C9 c0c9 = ((GalleryFragmentBase) documentsGalleryFragment).A05;
            C2NE c2ne = documentsGalleryFragment.A04;
            if (c2ne != null) {
                C0D5 c0d52 = c2ne.A01;
                long A04 = c0d52.A04();
                A03 = c2ne.A02.A03();
                try {
                    c0iu.A02();
                    if (!c0iu.A06()) {
                        A083 = A03.A02.A08(C0HD.A0D, new String[]{String.valueOf(c2ne.A00.A05(abstractC005302j))}, c0he);
                    } else if (A04 == 1) {
                        A083 = A03.A02.A08(C0HD.A0E, new String[]{c0d52.A0G(c0iu.A02()), String.valueOf(c2ne.A00.A05(abstractC005302j))}, c0he);
                    } else {
                        C000700j.A08(A04 == 5, "unknown fts version");
                        c0iu.A02 = 100;
                        A083 = A03.A02.A08(C0HD.A0R, new String[]{c0d52.A0B(c0iu, c0he)}, c0he);
                    }
                    A03.close();
                    return new C40481sK(c0c9, abstractC005302j, A083, false);
                } finally {
                }
            } else {
                throw null;
            }
        } else {
            C03690Gr c03690Gr = ((LinksGalleryFragment) this).A02;
            if (c03690Gr.A03()) {
                C0D5 c0d53 = c03690Gr.A02;
                long A042 = c0d53.A04();
                String l = Long.toString(c03690Gr.A01.A05(abstractC005302j));
                C0CD A033 = c03690Gr.A03.A03();
                try {
                    if (c0iu.A06()) {
                        c0iu.A02();
                        if (A042 == 1) {
                            Cursor A084 = A033.A02.A08(C0HD.A0O, new String[]{l, c0d53.A0G(c0iu.A02())}, c0he);
                            A033.close();
                            return A084;
                        }
                        c0iu.A02 = C0M6.A03;
                        Cursor A085 = A033.A02.A08(C0HD.A0P, new String[]{c0d53.A0B(c0iu, c0he)}, c0he);
                        A033.close();
                        return A085;
                    }
                    Cursor A086 = A033.A02.A08(C0HD.A0Q, new String[]{l}, c0he);
                    A033.close();
                    return A086;
                } finally {
                    try {
                        throw th;
                    } finally {
                    }
                }
            }
            String rawString = abstractC005302j.getRawString();
            C0D5 c0d54 = c03690Gr.A02;
            long A043 = c0d54.A04();
            A03 = c03690Gr.A03.A03();
            try {
                if (c0iu.A06()) {
                    String A02 = c0iu.A02();
                    if (A043 == 1) {
                        A082 = A03.A02.A08(C0HD.A0J, new String[]{rawString, TextUtils.isEmpty(A02) ? null : c0d54.A0G(A02)}, c0he);
                    } else {
                        c0iu.A02 = C0M6.A03;
                        A082 = A03.A02.A08(C0HD.A0K, new String[]{c0d54.A0B(c0iu, c0he)}, c0he);
                    }
                } else {
                    A082 = A03.A02.A08(C0HD.A0L, new String[]{rawString}, c0he);
                }
                A03.close();
                return A082;
            } finally {
                try {
                    throw th;
                } finally {
                    try {
                        A03.close();
                    } catch (Throwable unused2) {
                    }
                }
            }
        }
    }

    public InterfaceC04690Ll A0z() {
        InterfaceC04690Ll interfaceC04690Ll = (InterfaceC04690Ll) A09();
        if (interfaceC04690Ll != null) {
            return interfaceC04690Ll;
        }
        throw null;
    }

    public final void A10() {
        C66343Ar c66343Ar = this.A0A;
        if (c66343Ar != null) {
            c66343Ar.A05(true);
            synchronized (c66343Ar) {
                C0HE c0he = c66343Ar.A00;
                if (c0he != null) {
                    c0he.A01();
                }
            }
        }
        C66353As c66353As = this.A0B;
        if (c66353As != null) {
            c66353As.A0A();
        }
        C66343Ar c66343Ar2 = new C66343Ar(this, this.A0C, this.A06);
        this.A0A = c66343Ar2;
        this.A0D.ARy(c66343Ar2, new Void[0]);
    }

    public final void A11() {
        if (this.A00 != -1) {
            if (this.A03.A06() && this.A00 > 0) {
                this.A01.setVisibility(8);
                this.A02.setVisibility(0);
                return;
            }
            this.A01.setVisibility(0);
            this.A02.setVisibility(8);
        }
    }

    @Override // X.InterfaceC53322di
    public void AON(C0IU c0iu) {
        if (TextUtils.equals(this.A0E, c0iu.A02())) {
            return;
        }
        this.A0E = c0iu.A02();
        this.A06 = c0iu;
        A10();
    }

    @Override // X.InterfaceC53322di
    public void AOT() {
        ((AbstractC04890Mh) this.A09).A01.A00();
    }
}
