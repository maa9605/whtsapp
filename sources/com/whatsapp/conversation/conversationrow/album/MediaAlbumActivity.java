package com.whatsapp.conversation.conversationrow.album;

import X.AbstractActivityC04650Lh;
import X.AbstractC005302j;
import X.AbstractC12840kA;
import X.AbstractC28721Ti;
import X.ActivityC02270An;
import X.ActivityC02290Ap;
import X.ActivityC02310Ar;
import X.AnonymousClass008;
import X.AnonymousClass011;
import X.AnonymousClass029;
import X.AnonymousClass092;
import X.C000200d;
import X.C000700j;
import X.C003101m;
import X.C00A;
import X.C00T;
import X.C018308n;
import X.C018708s;
import X.C01B;
import X.C02160Ac;
import X.C02620Cd;
import X.C02980Dr;
import X.C02E;
import X.C02O;
import X.C03010Du;
import X.C03320Ff;
import X.C03360Fk;
import X.C04300Jq;
import X.C08930cL;
import X.C0AT;
import X.C0C8;
import X.C0C9;
import X.C0CA;
import X.C0ED;
import X.C0ES;
import X.C0GA;
import X.C0GC;
import X.C0GE;
import X.C0HQ;
import X.C0U1;
import X.C0V5;
import X.C0VJ;
import X.C0m3;
import X.C13930m5;
import X.C2AT;
import X.C2HC;
import X.C2M4;
import X.C2MG;
import X.C2MN;
import X.C2NY;
import X.C58982s1;
import X.C58992s2;
import X.C59002s3;
import X.C68333Jf;
import X.InterfaceC002901k;
import X.InterfaceC04690Ll;
import X.InterfaceC61212vm;
import android.animation.TimeInterpolator;
import android.content.Intent;
import android.graphics.Point;
import android.os.Build;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.ListView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.google.android.search.verification.client.R;
import com.whatsapp.Conversation;
import com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity;
import com.whatsapp.gesture.VerticalSwipeDismissBehavior;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public class MediaAlbumActivity extends C2NY implements InterfaceC04690Ll, C0HQ {
    public Bundle A00;
    public C03010Du A01;
    public C01B A02;
    public C03320Ff A03;
    public AnonymousClass008 A04;
    public C018708s A05;
    public C58982s1 A06;
    public C58992s2 A07;
    public C02E A08;
    public C0C9 A09;
    public C0C8 A0A;
    public C00A A0B;
    public C0ED A0C;
    public AnonymousClass011 A0D;
    public C0ES A0E;
    public C03360Fk A0F;
    public C02980Dr A0G;
    public C02O A0H;
    public C2MN A0I;
    public C2M4 A0J;
    public C2AT A0K;
    public C2MG A0L;
    public InterfaceC002901k A0M;
    public final HashSet A0R = new HashSet();
    public final HashSet A0S = new HashSet();
    public final C00T A0P = new C00T() { // from class: X.390
        {
            MediaAlbumActivity.this = this;
        }

        @Override // X.C00T
        public void A08(AnonymousClass092 anonymousClass092, int i) {
            MediaAlbumActivity mediaAlbumActivity = MediaAlbumActivity.this;
            C58992s2 c58992s2 = mediaAlbumActivity.A07;
            AnonymousClass094 anonymousClass094 = anonymousClass092.A0n;
            if (c58992s2.A00(anonymousClass094)) {
                View findViewWithTag = mediaAlbumActivity.A1P().findViewWithTag(anonymousClass094);
                if (findViewWithTag != null) {
                    AbstractC48182Ef abstractC48182Ef = (AbstractC48182Ef) findViewWithTag;
                    if (abstractC48182Ef.A0h(anonymousClass094)) {
                        if (i == 8) {
                            if (abstractC48182Ef.getFMessage() == anonymousClass092) {
                                abstractC48182Ef.A0M();
                                return;
                            }
                        } else if (i == 12 && abstractC48182Ef.getFMessage() == anonymousClass092) {
                            abstractC48182Ef.A0J();
                            return;
                        }
                        abstractC48182Ef.A0X(anonymousClass092, true);
                        return;
                    }
                    throw new IllegalStateException();
                }
                HashSet hashSet = mediaAlbumActivity.A0R;
                if (hashSet.contains(anonymousClass094)) {
                    return;
                }
                hashSet.add(anonymousClass094);
            }
        }

        @Override // X.C00T
        public void A0A(Collection collection, AbstractC005302j abstractC005302j, Map map, boolean z) {
            if (collection == null) {
                return;
            }
            boolean z2 = false;
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                MediaAlbumActivity mediaAlbumActivity = MediaAlbumActivity.this;
                C58992s2 c58992s2 = mediaAlbumActivity.A07;
                AnonymousClass094 anonymousClass094 = ((AnonymousClass092) it.next()).A0n;
                if (c58992s2.A00(anonymousClass094)) {
                    mediaAlbumActivity.A0S.add(anonymousClass094);
                    z2 = true;
                }
            }
            if (z2) {
                MediaAlbumActivity.this.A07.notifyDataSetChanged();
            }
        }

        @Override // X.C00T
        public void A0B(Collection collection, Map map, Map map2) {
            MediaAlbumActivity mediaAlbumActivity = MediaAlbumActivity.this;
            C58992s2 c58992s2 = mediaAlbumActivity.A07;
            if (c58992s2.A00 != null) {
                Iterator it = collection.iterator();
                boolean z = false;
                while (it.hasNext()) {
                    AnonymousClass092 anonymousClass092 = (AnonymousClass092) it.next();
                    Iterator it2 = c58992s2.A00.iterator();
                    int i = 0;
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        } else if (((AnonymousClass092) it2.next()).A0n.equals(anonymousClass092.A0n)) {
                            c58992s2.A00.remove(i);
                            z = true;
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                if (z) {
                    c58992s2.notifyDataSetChanged();
                }
            }
            if (mediaAlbumActivity.A07.isEmpty()) {
                mediaAlbumActivity.finish();
            } else {
                mediaAlbumActivity.A1Y();
            }
        }
    };
    public final C0GA A0O = new C0GA() { // from class: X.391
        {
            MediaAlbumActivity.this = this;
        }

        @Override // X.C0GA
        public void A00() {
            MediaAlbumActivity.this.A07.notifyDataSetChanged();
        }

        @Override // X.C0GA
        public void A01(AbstractC005302j abstractC005302j) {
            MediaAlbumActivity.this.A07.notifyDataSetChanged();
        }

        @Override // X.C0GA
        public void A03(UserJid userJid) {
            MediaAlbumActivity.this.A07.notifyDataSetChanged();
        }
    };
    public final C0GC A0N = new C0GC() { // from class: X.392
        {
            MediaAlbumActivity.this = this;
        }

        @Override // X.C0GC
        public void A00(AbstractC005302j abstractC005302j) {
            MediaAlbumActivity.this.A07.notifyDataSetChanged();
        }
    };
    public final C0GE A0Q = new C0GE() { // from class: X.393
        {
            MediaAlbumActivity.this = this;
        }

        @Override // X.C0GE
        public void A00(Set set) {
            MediaAlbumActivity.this.A07.notifyDataSetChanged();
        }
    };

    @Override // X.InterfaceC04690Ll
    public int A95() {
        return 2;
    }

    @Override // X.InterfaceC04690Ll
    public ArrayList ACy() {
        return null;
    }

    @Override // X.InterfaceC04690Ll
    public boolean AFv(AnonymousClass092 anonymousClass092) {
        return false;
    }

    @Override // X.C0HQ
    public void ALZ(C13930m5 c13930m5) {
    }

    @Override // X.AbstractActivityC04650Lh
    public boolean A1X() {
        if (((AbstractActivityC04650Lh) this).A00 != null) {
            return false;
        }
        Log.i("starred/selectionrequested");
        this.A07.notifyDataSetChanged();
        ((AbstractActivityC04650Lh) this).A00 = A0e(new C68333Jf(this, this, ((ActivityC02290Ap) this).A0A, this.A0G, this.A0J, ((AbstractActivityC04650Lh) this).A01, this.A0M, this.A0L, this.A0D, this.A02, ((AbstractActivityC04650Lh) this).A05, ((AbstractActivityC04650Lh) this).A03, this.A0I, ((ActivityC02270An) this).A00, ((AbstractActivityC04650Lh) this).A06, this.A0C, this.A08, this.A05, ((ActivityC02310Ar) this).A01, this.A0E, this.A0Z, this.A0K, super.A0P, this.A0V, this.A0U, this.A0A, this.A0H));
        return true;
    }

    public final void A1Y() {
        String string;
        List list = this.A07.A00;
        if (list != null && !list.isEmpty()) {
            int i = 0;
            int i2 = 0;
            for (AnonymousClass092 anonymousClass092 : this.A07.A00) {
                byte b = anonymousClass092.A0m;
                if (b == 1) {
                    i2++;
                } else if (b == 3) {
                    i++;
                }
            }
            AnonymousClass092 anonymousClass0922 = (AnonymousClass092) this.A07.A00.get(0);
            if (i == 0) {
                string = ((ActivityC02310Ar) this).A01.A0A(R.plurals.number_of_photos, i2, Integer.valueOf(i2));
            } else if (i2 == 0) {
                string = ((ActivityC02310Ar) this).A01.A0A(R.plurals.number_of_videos, i, Integer.valueOf(i));
            } else {
                string = getString(R.string.number_of_photos_and_videos, ((ActivityC02310Ar) this).A01.A0A(R.plurals.number_of_photos, i2, Integer.valueOf(i2)), ((ActivityC02310Ar) this).A01.A0A(R.plurals.number_of_videos, i, Integer.valueOf(i)));
            }
            if (C02620Cd.A00(System.currentTimeMillis(), anonymousClass0922.A0E) != 0) {
                StringBuilder A0V = C000200d.A0V(string, "  ");
                A0V.append(getString(R.string.contacts_help_bullet));
                A0V.append("  ");
                A0V.append(AnonymousClass029.A0l(((ActivityC02310Ar) this).A01, anonymousClass0922.A0E));
                string = A0V.toString();
            }
            C0U1 A0c = A0c();
            if (A0c == null) {
                throw null;
            }
            A0c.A0G(string);
        }
    }

    public final void A1Z(AnonymousClass092 anonymousClass092) {
        C000700j.A09(!(anonymousClass092 instanceof C04300Jq), "should not reply to systemMessage");
        AbstractC005302j A0A = anonymousClass092.A0A();
        if (A0A != null) {
            Conversation.A57.put(A0A, anonymousClass092);
            Intent intent = new Intent(this, Conversation.class);
            intent.putExtra("jid", A0A.getRawString());
            C018308n c018308n = ((ActivityC02270An) this).A00;
            if (c018308n == null) {
                throw null;
            }
            c018308n.A08(this, intent, "MediaAlbumActivity");
            return;
        }
        throw null;
    }

    @Override // X.C0HQ
    public C13930m5 AJ7(int i, Bundle bundle) {
        return new AbstractC28721Ti(this, this.A09, getIntent().getLongArrayExtra("message_ids")) { // from class: X.3Jg
            public final C0C9 A00;
            public final long[] A01;

            {
                this.A01 = r3;
                this.A00 = r2;
            }

            @Override // X.C13930m5
            public void A01() {
                A06();
            }

            @Override // X.C13930m5
            public void A02() {
                boolean z = ((C13930m5) this).A03;
                ((C13930m5) this).A03 = false;
                this.A04 |= z;
                A00();
            }

            @Override // X.C13930m5
            public void A03() {
                A06();
            }

            @Override // X.C13930m5
            public void A04(Object obj) {
                if (this.A05 || !this.A06) {
                    return;
                }
                super.A04(obj);
            }

            @Override // X.AbstractC28721Ti
            public Object A07() {
                long[] jArr;
                ArrayList arrayList = new ArrayList();
                for (long j : this.A01) {
                    synchronized (this) {
                        if (((AbstractC28721Ti) this).A02 != null) {
                            throw new C0S2();
                        }
                    }
                    AnonymousClass092 A0C = this.A00.A0C(j);
                    if (A0C instanceof AnonymousClass097) {
                        arrayList.add(A0C);
                    }
                }
                return arrayList;
            }
        };
    }

    @Override // X.C0HQ
    public /* bridge */ /* synthetic */ void ALT(C13930m5 c13930m5, Object obj) {
        List list = (List) obj;
        if (list != null && list.isEmpty()) {
            finish();
            return;
        }
        C58992s2 c58992s2 = this.A07;
        c58992s2.A00 = list;
        c58992s2.notifyDataSetChanged();
        MediaAlbumActivity mediaAlbumActivity = c58992s2.A02;
        if (mediaAlbumActivity.A00 != null) {
            mediaAlbumActivity.A1P().setSelectionFromTop(mediaAlbumActivity.A00.getInt("top_index"), mediaAlbumActivity.A00.getInt("top_offset"));
            mediaAlbumActivity.A00 = null;
        } else {
            int i = 0;
            int intExtra = mediaAlbumActivity.getIntent().getIntExtra("start_index", 0);
            if (intExtra < c58992s2.getCount()) {
                C59002s3 c59002s3 = c58992s2.A01;
                if (c59002s3 != null) {
                    Point point = new Point();
                    MediaAlbumActivity mediaAlbumActivity2 = c59002s3.A05;
                    mediaAlbumActivity2.getWindowManager().getDefaultDisplay().getSize(point);
                    int i2 = point.y;
                    int i3 = point.x;
                    ListView A1P = mediaAlbumActivity2.A1P();
                    if (i2 >= i3) {
                        View view = c58992s2.getView(intExtra, null, A1P);
                        view.measure(View.MeasureSpec.makeMeasureSpec(i3, EditorInfoCompat.IME_FLAG_FORCE_ASCII), 0);
                        c59002s3.A01 = (i2 << 2) / 5;
                        int measuredHeight = view.getMeasuredHeight();
                        c59002s3.A02 = measuredHeight;
                        int i4 = c59002s3.A01;
                        if (i4 < measuredHeight) {
                            c59002s3.A00 = intExtra;
                        } else {
                            c59002s3.A00 = -1;
                        }
                        if (intExtra != 0) {
                            c59002s3.A03 = c59002s3.A00(i2, Math.min(measuredHeight, i4), intExtra == c58992s2.getCount() - 1);
                            A1P.setSelectionFromTop(A1P.getHeaderViewsCount() + intExtra, c59002s3.A03);
                        } else {
                            c59002s3.A03 = 0;
                        }
                    } else {
                        int headerViewsCount = A1P.getHeaderViewsCount() + intExtra;
                        if (Build.VERSION.SDK_INT >= 21) {
                            int identifier = mediaAlbumActivity2.getResources().getIdentifier("status_bar_height", "dimen", "android");
                            if (identifier > 0) {
                                i = mediaAlbumActivity2.getResources().getDimensionPixelSize(identifier);
                            } else {
                                i = 0;
                            }
                        }
                        A1P.setSelectionFromTop(headerViewsCount, mediaAlbumActivity2.getResources().getDimensionPixelSize(R.dimen.actionbar_height) + i);
                    }
                } else {
                    throw null;
                }
            }
        }
        A1Y();
        A1P().getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: X.2s0
            {
                MediaAlbumActivity.this = this;
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                MediaAlbumActivity mediaAlbumActivity3 = MediaAlbumActivity.this;
                mediaAlbumActivity3.A1P().getViewTreeObserver().removeOnPreDrawListener(this);
                mediaAlbumActivity3.A0T();
                return true;
            }
        });
    }

    @Override // android.app.Activity
    public void finishAfterTransition() {
        if (getIntent().hasExtra("start_index")) {
            C0VJ.A0F(this, new AbstractC12840kA() { // from class: X.395
                {
                    MediaAlbumActivity.this = this;
                }

                @Override // X.AbstractC12840kA
                public void A01(List list, Map map) {
                    View A05;
                    View A052;
                    MediaAlbumActivity mediaAlbumActivity = MediaAlbumActivity.this;
                    List<AnonymousClass092> list2 = mediaAlbumActivity.A07.A00;
                    if (list2 != null) {
                        int i = 0;
                        boolean z = false;
                        for (AnonymousClass092 anonymousClass092 : list2) {
                            i++;
                            if (i > 3) {
                                return;
                            }
                            View findViewWithTag = mediaAlbumActivity.A1P().findViewWithTag(anonymousClass092.A0n);
                            if (findViewWithTag != null && !z && (findViewWithTag.getTop() >= 0 || (findViewWithTag.getTop() < 0 && findViewWithTag.getBottom() >= mediaAlbumActivity.A1P().getHeight()))) {
                                String A08 = C2JE.A08(anonymousClass092);
                                if (!map.containsKey(A08) && (A052 = C2HC.A05(mediaAlbumActivity.A1P(), A08)) != null) {
                                    list.add(A08);
                                    map.put(A08, A052);
                                }
                                String A02 = C2JE.A02(anonymousClass092);
                                if (!map.containsKey(A02) && (A05 = C2HC.A05(mediaAlbumActivity.A1P(), A02)) != null) {
                                    list.add(A02);
                                    map.put(A02, A05);
                                }
                                z = true;
                            } else {
                                map.remove(C2JE.A08(anonymousClass092));
                                map.remove(C2JE.A02(anonymousClass092));
                            }
                        }
                    }
                }
            });
        }
        super.finishAfterTransition();
    }

    @Override // X.AbstractActivityC04650Lh, X.ActivityC02330At, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 2 && i2 == -1) {
            Collection A1U = A1U();
            if (!((AbstractCollection) A1U).isEmpty()) {
                List A0F = C003101m.A0F(AbstractC005302j.class, intent.getStringArrayListExtra("jids"));
                Iterator it = C0CA.A01(A1U).iterator();
                while (it.hasNext()) {
                    ((AbstractActivityC04650Lh) this).A03.A0E(this.A01, (AnonymousClass092) it.next(), A0F);
                }
                AbstractList abstractList = (AbstractList) A0F;
                if (abstractList.size() == 1 && !C003101m.A0Z((Jid) abstractList.get(0))) {
                    ((ActivityC02270An) this).A00.A07(this, Conversation.A00(this, ((AbstractActivityC04650Lh) this).A06.A0A((AbstractC005302j) abstractList.get(0))));
                } else {
                    A1L(A0F);
                }
            } else {
                Log.w("mediaalbum/forward/failed");
                ((ActivityC02290Ap) this).A0A.A07(R.string.message_forward_failed, 0);
            }
            A1V();
        }
    }

    @Override // X.C2NY, X.AbstractActivityC04650Lh, X.AbstractActivityC04660Li, X.AbstractActivityC04670Lj, X.AbstractActivityC04680Lk, X.AbstractActivityC02260Am, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        int length;
        if (C2HC.A00) {
            getWindow().requestFeature(12);
            getWindow().requestFeature(13);
            AutoTransition autoTransition = new AutoTransition();
            autoTransition.setDuration(220L);
            autoTransition.setInterpolator((TimeInterpolator) new AccelerateDecelerateInterpolator());
            getWindow().setSharedElementEnterTransition(autoTransition);
        }
        this.A00 = bundle;
        super.onCreate(bundle);
        A0S();
        setContentView(R.layout.media_album);
        final Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        A0k(toolbar);
        C0U1 A0c = A0c();
        if (A0c != null) {
            A0c.A0L(true);
            this.A04.A01(this.A0O);
            this.A0B.A01(this.A0P);
            this.A03.A01(this.A0N);
            this.A0F.A01(this.A0Q);
            if (Build.VERSION.SDK_INT >= 21) {
                getWindow().getDecorView().setSystemUiVisibility(1792);
                getWindow().addFlags(134217728);
                getWindow().addFlags(EditorInfoCompat.IME_FLAG_FORCE_ASCII);
                getWindow().setStatusBarColor(C02160Ac.A00(this, R.color.primary_dark));
            }
            AbstractC005302j A02 = AbstractC005302j.A02(getIntent().getStringExtra("jid"));
            if (A02 == null) {
                A0c.A08(R.string.you);
            } else {
                A0c.A0H(this.A05.A08(((AbstractActivityC04650Lh) this).A06.A0A(A02), false));
            }
            this.A07 = new C58992s2(this);
            final ListView A1P = A1P();
            A1P.setFastScrollEnabled(false);
            A1P.setScrollbarFadingEnabled(true);
            final FrameLayout frameLayout = new FrameLayout(this);
            frameLayout.setPadding(0, 0, 0, getResources().getDimensionPixelSize(R.dimen.actionbar_height));
            A1P.addHeaderView(frameLayout, null, false);
            final FrameLayout frameLayout2 = new FrameLayout(this);
            A1P.addFooterView(frameLayout2, null, false);
            final View findViewById = findViewById(R.id.title_background);
            C0AT.A0d(A1P, new C0V5() { // from class: X.38z
                {
                    MediaAlbumActivity.this = this;
                }

                @Override // X.C0V5
                public final C07110Wv AHK(View view, C07110Wv c07110Wv) {
                    MediaAlbumActivity mediaAlbumActivity = MediaAlbumActivity.this;
                    View view2 = frameLayout;
                    View view3 = frameLayout2;
                    View view4 = findViewById;
                    int dimensionPixelSize = mediaAlbumActivity.getResources().getDimensionPixelSize(R.dimen.actionbar_height) + c07110Wv.A04();
                    int A01 = c07110Wv.A01();
                    view2.setPadding(0, 0, 0, dimensionPixelSize);
                    view3.setPadding(0, 0, 0, A01);
                    view4.setPadding(0, 0, 0, dimensionPixelSize);
                    return c07110Wv;
                }
            });
            C58982s1 c58982s1 = new C58982s1(C02160Ac.A00(this, R.color.primary));
            this.A06 = c58982s1;
            A0c.A0B(c58982s1);
            final int A00 = C02160Ac.A00(this, R.color.primary);
            final int A002 = C02160Ac.A00(this, R.color.primary_dark);
            final int A003 = C02160Ac.A00(this, R.color.media_view_footer_background);
            A1P.setOnScrollListener(new AbsListView.OnScrollListener() { // from class: X.2rz
                public float A00;
                public int A01 = -1;
                public int A02;

                @Override // android.widget.AbsListView.OnScrollListener
                public void onScrollStateChanged(AbsListView absListView, int i) {
                }

                {
                    MediaAlbumActivity.this = this;
                }

                /* JADX WARN: Removed duplicated region for block: B:68:0x0075  */
                /* JADX WARN: Removed duplicated region for block: B:71:0x0081  */
                /* JADX WARN: Removed duplicated region for block: B:74:0x0090  */
                /* JADX WARN: Removed duplicated region for block: B:79:0x00b4  */
                /* JADX WARN: Removed duplicated region for block: B:82:0x00c7  */
                /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
                @Override // android.widget.AbsListView.OnScrollListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public void onScroll(android.widget.AbsListView r13, int r14, int r15, int r16) {
                    /*
                        Method dump skipped, instructions count: 309
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C58962rz.onScroll(android.widget.AbsListView, int, int, int):void");
                }
            });
            A1Q(this.A07);
            if (Build.VERSION.SDK_INT >= 21) {
                final View findViewById2 = findViewById(R.id.background);
                VerticalSwipeDismissBehavior verticalSwipeDismissBehavior = new VerticalSwipeDismissBehavior(this);
                verticalSwipeDismissBehavior.A06 = new InterfaceC61212vm() { // from class: X.394
                    @Override // X.InterfaceC61212vm
                    public void AJc(int i) {
                    }

                    @Override // X.InterfaceC61212vm
                    public void AOa(View view) {
                    }

                    {
                        MediaAlbumActivity.this = this;
                    }

                    @Override // X.InterfaceC61212vm
                    public void AJR(View view) {
                        MediaAlbumActivity.this.onBackPressed();
                    }

                    @Override // X.InterfaceC61212vm
                    public void AOl(View view, float f) {
                        float f2 = 1.0f - f;
                        float f3 = f2 < 0.8f ? 0.0f : (f2 - 0.8f) / 0.19999999f;
                        findViewById2.setAlpha(f3);
                        findViewById.setAlpha(f3);
                        toolbar.setAlpha(f3);
                    }
                };
                ((C08930cL) A1P.getLayoutParams()).A00(verticalSwipeDismissBehavior);
            }
            long[] longArrayExtra = getIntent().getLongArrayExtra("message_ids");
            if (longArrayExtra != null && (length = longArrayExtra.length) != 0) {
                A0c.A0G(((ActivityC02310Ar) this).A01.A0A(R.plurals.notification_new_message_from_multiple_contacts_1, length, Integer.valueOf(length)));
                C0m3.A00(this).A01(0, null, this);
                return;
            }
            finish();
            return;
        }
        throw null;
    }

    @Override // X.AbstractActivityC04650Lh, X.ActivityC02250Al, X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.A04.A00(this.A0O);
        this.A0B.A00(this.A0P);
        this.A03.A00(this.A0N);
        this.A0F.A00(this.A0Q);
    }

    @Override // X.ActivityC02290Ap, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return true;
        }
        A0Q();
        return true;
    }

    @Override // X.AbstractActivityC04650Lh, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ListView A1P = A1P();
        bundle.putInt("top_index", A1P.getFirstVisiblePosition());
        View childAt = A1P.getChildAt(0);
        bundle.putInt("top_offset", childAt != null ? childAt.getTop() - A1P.getPaddingTop() : 0);
    }
}
