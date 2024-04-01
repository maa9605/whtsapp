package com.whatsapp.group;

import X.AbstractC04890Mh;
import X.AbstractC08940cM;
import X.AnonymousClass008;
import X.C002301c;
import X.C011005l;
import X.C018708s;
import X.C02160Ac;
import X.C02630Ce;
import X.C02L;
import X.C03320Ff;
import X.C03360Fk;
import X.C05W;
import X.C06C;
import X.C07630Zb;
import X.C08930cL;
import X.C09940f2;
import X.C0C8;
import X.C0D7;
import X.C0GA;
import X.C0GC;
import X.C0GE;
import X.C0HS;
import X.C0L5;
import X.C0We;
import X.C0Zn;
import X.C2AR;
import X.C2O4;
import X.C3CS;
import X.C3CT;
import X.C456823b;
import X.InterfaceC002901k;
import X.InterfaceC07650Zd;
import X.InterfaceC61762wg;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.ViewOnClickEBaseShape0S0200000_I0_0;
import com.facebook.redex.ViewOnClickEBaseShape2S0100000_I0_2;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.search.verification.client.R;
import com.whatsapp.group.GroupAdminPickerActivity;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.ViewOnClickCListenerShape9S0100000_I0_1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public class GroupAdminPickerActivity extends C2O4 {
    public ColorDrawable A00;
    public View A01;
    public View A02;
    public View A03;
    public View A04;
    public SearchView A05;
    public BottomSheetBehavior A06;
    public C02L A07;
    public C03320Ff A08;
    public C05W A09;
    public AnonymousClass008 A0A;
    public C018708s A0B;
    public C0Zn A0C;
    public C0L5 A0D;
    public C002301c A0E;
    public C0C8 A0F;
    public C3CS A0G;
    public C3CT A0H;
    public C456823b A0I;
    public C03360Fk A0J;
    public C011005l A0K;
    public C2AR A0L;
    public InterfaceC002901k A0M;
    public String A0N;
    public List A0O;
    public final C0GA A0R = new C0GA() { // from class: X.3CN
        {
            GroupAdminPickerActivity.this = this;
        }

        @Override // X.C0GA
        public void A00() {
            GroupAdminPickerActivity groupAdminPickerActivity = GroupAdminPickerActivity.this;
            groupAdminPickerActivity.A1S(groupAdminPickerActivity.A0N);
        }

        @Override // X.C0GA
        public void A01(AbstractC005302j abstractC005302j) {
            if (abstractC005302j == null || C003101m.A0U(abstractC005302j)) {
                return;
            }
            GroupAdminPickerActivity groupAdminPickerActivity = GroupAdminPickerActivity.this;
            if (GroupAdminPickerActivity.A00(groupAdminPickerActivity, UserJid.of(abstractC005302j))) {
                C06C.A00(groupAdminPickerActivity.A0O, new C3AD(groupAdminPickerActivity.A09.A0A(abstractC005302j)));
                ((AbstractC04890Mh) groupAdminPickerActivity.A0H).A01.A00();
            }
        }

        @Override // X.C0GA
        public void A03(UserJid userJid) {
            if (userJid == null || C003101m.A0U(userJid)) {
                return;
            }
            GroupAdminPickerActivity groupAdminPickerActivity = GroupAdminPickerActivity.this;
            if (GroupAdminPickerActivity.A00(groupAdminPickerActivity, userJid)) {
                C06C.A00(groupAdminPickerActivity.A0O, new C3AC(groupAdminPickerActivity.A09.A0A(userJid)));
                groupAdminPickerActivity.A1S(groupAdminPickerActivity.A0N);
            }
        }

        @Override // X.C0GA
        public void A04(UserJid userJid) {
            if (userJid == null || C003101m.A0U(userJid)) {
                return;
            }
            GroupAdminPickerActivity groupAdminPickerActivity = GroupAdminPickerActivity.this;
            if (GroupAdminPickerActivity.A00(groupAdminPickerActivity, userJid)) {
                C06C.A00(groupAdminPickerActivity.A0O, new C3AE(groupAdminPickerActivity.A09.A0A(userJid)));
                ((AbstractC04890Mh) groupAdminPickerActivity.A0H).A01.A00();
            }
        }
    };
    public final C0GC A0Q = new C0GC() { // from class: X.3CO
        {
            GroupAdminPickerActivity.this = this;
        }

        @Override // X.C0GC
        public void A00(AbstractC005302j abstractC005302j) {
            GroupAdminPickerActivity groupAdminPickerActivity = GroupAdminPickerActivity.this;
            groupAdminPickerActivity.A1S(groupAdminPickerActivity.A0N);
        }
    };
    public final C0GE A0T = new C0GE() { // from class: X.3CP
        {
            GroupAdminPickerActivity.this = this;
        }

        @Override // X.C0GE
        public void A00(Set set) {
            GroupAdminPickerActivity groupAdminPickerActivity = GroupAdminPickerActivity.this;
            groupAdminPickerActivity.A1S(groupAdminPickerActivity.A0N);
        }
    };
    public final InterfaceC61762wg A0S = new InterfaceC61762wg() { // from class: X.3CD
        {
            GroupAdminPickerActivity.this = this;
        }

        @Override // X.InterfaceC61762wg
        public final void AGo(AbstractC005302j abstractC005302j) {
            GroupAdminPickerActivity groupAdminPickerActivity = GroupAdminPickerActivity.this;
            C011005l c011005l = groupAdminPickerActivity.A0K;
            if (c011005l == null) {
                throw null;
            }
            if (c011005l.equals(abstractC005302j)) {
                groupAdminPickerActivity.A1R();
                groupAdminPickerActivity.A1S(groupAdminPickerActivity.A0N);
            }
        }
    };
    public final View.OnClickListener A0P = new ViewOnClickEBaseShape2S0100000_I0_2(this, 9);

    public static boolean A00(GroupAdminPickerActivity groupAdminPickerActivity, UserJid userJid) {
        if (groupAdminPickerActivity != null) {
            if (userJid != null) {
                for (C06C c06c : groupAdminPickerActivity.A0O) {
                    if (userJid.equals(c06c.A03(UserJid.class))) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }
        throw null;
    }

    public final void A1P() {
        this.A02.setPadding(0, getResources().getDimensionPixelSize(R.dimen.admin_picker_top_padding), 0, 0);
        ((C08930cL) this.A02.getLayoutParams()).A00(this.A06);
        this.A00.setColor(2130706432);
        this.A04.setVisibility(0);
        this.A03.setVisibility(8);
        A1S(null);
    }

    public final void A1Q() {
        this.A02.setPadding(0, 0, 0, 0);
        ((C08930cL) this.A02.getLayoutParams()).A00(null);
        this.A00.setColor(C02160Ac.A00(this, R.color.groupAdminPickerBackground));
        this.A05.setIconified(false);
        this.A04.setVisibility(8);
        this.A03.setVisibility(0);
    }

    public final void A1R() {
        C0C8 c0c8 = this.A0F;
        C011005l c011005l = this.A0K;
        if (c011005l != null) {
            C02630Ce A01 = c0c8.A01(c011005l);
            this.A0O = new ArrayList(A01.A01.size());
            Iterator it = A01.A06().iterator();
            while (it.hasNext()) {
                C02L c02l = this.A07;
                UserJid userJid = ((C0D7) it.next()).A03;
                if (!c02l.A0A(userJid)) {
                    this.A0O.add(this.A09.A0A(userJid));
                }
            }
            return;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.3CS, X.0HS] */
    public final void A1S(String str) {
        this.A0N = str;
        C3CS c3cs = this.A0G;
        if (c3cs != null) {
            c3cs.A05(true);
        }
        ?? r2 = new C0HS(this.A0B, this.A0E, this, this.A0O, str) { // from class: X.3CS
            public final C018708s A00;
            public final C002301c A01;
            public final String A02;
            public final WeakReference A03;
            public final List A04 = new ArrayList();

            {
                this.A00 = r2;
                this.A01 = r3;
                this.A03 = new WeakReference(this);
                this.A04.addAll(r5);
                this.A02 = str;
            }

            @Override // X.C0HS
            public Object A07(Object[] objArr) {
                String str2 = this.A02;
                if (TextUtils.isEmpty(str2)) {
                    return this.A04;
                }
                ArrayList arrayList = new ArrayList();
                C002301c c002301c = this.A01;
                ArrayList A03 = C09940f2.A03(str2, c002301c);
                for (C06C c06c : this.A04) {
                    if (this.A00.A0G(c06c, A03, true) || C09940f2.A04(c06c.A0O, A03, c002301c)) {
                        arrayList.add(c06c);
                    }
                }
                return arrayList;
            }

            @Override // X.C0HS
            public void A09(Object obj) {
                List list = (List) obj;
                GroupAdminPickerActivity groupAdminPickerActivity = (GroupAdminPickerActivity) this.A03.get();
                if (groupAdminPickerActivity != null && !groupAdminPickerActivity.AFE()) {
                    C3CT c3ct = groupAdminPickerActivity.A0H;
                    String str2 = groupAdminPickerActivity.A0N;
                    c3ct.A01 = list;
                    c3ct.A00 = C09940f2.A03(str2, c3ct.A02.A0E);
                    ((AbstractC04890Mh) c3ct).A01.A00();
                    TextView textView = (TextView) groupAdminPickerActivity.findViewById(R.id.search_no_matches);
                    if (list.isEmpty() && !TextUtils.isEmpty(groupAdminPickerActivity.A0N)) {
                        textView.setVisibility(0);
                        textView.setText(groupAdminPickerActivity.getString(R.string.search_no_results, groupAdminPickerActivity.A0N));
                        return;
                    }
                    textView.setVisibility(8);
                }
            }
        };
        this.A0G = r2;
        this.A0M.ARy(r2, new Void[0]);
    }

    public /* synthetic */ void lambda$new$1774$GroupAdminPickerActivity(View view) {
        if (view.getTag() instanceof UserJid) {
            Intent intent = new Intent();
            intent.putExtra("contact", ((Jid) view.getTag()).getRawString());
            setResult(-1, intent);
            finish();
        }
    }

    public /* synthetic */ void lambda$onCreate$1777$GroupAdminPickerActivity(View view) {
        A1Q();
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02340Au, android.app.Activity
    public void onBackPressed() {
        if (this.A03.getVisibility() == 0) {
            A1P();
        } else {
            this.A06.A0O(4);
        }
    }

    @Override // X.C2O4, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.group_admin_picker);
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().addFlags(EditorInfoCompat.IME_FLAG_FORCE_ASCII);
        }
        View findViewById = findViewById(R.id.bottom_sheet);
        this.A02 = findViewById;
        this.A06 = BottomSheetBehavior.A00(findViewById);
        this.A02.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.2wY
            {
                GroupAdminPickerActivity.this = this;
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                GroupAdminPickerActivity groupAdminPickerActivity = GroupAdminPickerActivity.this;
                groupAdminPickerActivity.A02.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                groupAdminPickerActivity.A06.A0O(3);
            }
        });
        this.A01 = findViewById(R.id.background);
        final PointF pointF = new PointF();
        this.A01.setOnClickListener(new ViewOnClickEBaseShape0S0200000_I0_0(this, pointF, 28));
        this.A01.setOnTouchListener(new View.OnTouchListener() { // from class: X.2wL
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                pointF.set(motionEvent.getX(), motionEvent.getY());
                return false;
            }
        });
        ColorDrawable colorDrawable = new ColorDrawable(2130706432);
        this.A00 = colorDrawable;
        this.A01.setBackground(colorDrawable);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(getResources().getInteger(17694720));
        this.A01.startAnimation(alphaAnimation);
        final int A00 = C02160Ac.A00(this, R.color.primary_dark_dimmed);
        final int A002 = C02160Ac.A00(this, R.color.primary_dark);
        this.A06.A0E = new AbstractC08940cM() { // from class: X.3CQ
            {
                GroupAdminPickerActivity.this = this;
            }

            @Override // X.AbstractC08940cM
            public void A00(View view, float f) {
                GroupAdminPickerActivity groupAdminPickerActivity = GroupAdminPickerActivity.this;
                groupAdminPickerActivity.A00.setColor(((int) (127.0f * f)) << 24);
                if (Build.VERSION.SDK_INT >= 21) {
                    groupAdminPickerActivity.getWindow().setStatusBarColor(C09990f7.A04(A002, A00, f));
                }
            }

            @Override // X.AbstractC08940cM
            public void A01(View view, int i) {
                if (i == 4) {
                    GroupAdminPickerActivity groupAdminPickerActivity = GroupAdminPickerActivity.this;
                    groupAdminPickerActivity.finish();
                    groupAdminPickerActivity.overridePendingTransition(0, 0);
                }
            }
        };
        this.A04 = findViewById(R.id.title_holder);
        View findViewById2 = findViewById(R.id.search_holder);
        this.A03 = findViewById2;
        C07630Zb.A00(findViewById2);
        SearchView searchView = (SearchView) this.A03.findViewById(R.id.search_view);
        this.A05 = searchView;
        ((TextView) searchView.findViewById(R.id.search_src_text)).setTextColor(C02160Ac.A00(this, R.color.search_text_color));
        this.A05.setIconifiedByDefault(false);
        this.A05.setQueryHint(getString(R.string.select_group_admin_search_hint));
        ((ImageView) this.A05.findViewById(R.id.search_mag_icon)).setImageDrawable(new InsetDrawable(C02160Ac.A03(this, R.drawable.ic_back_teal)) { // from class: X.2wZ
            @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
            public void draw(Canvas canvas) {
            }
        });
        this.A05.A0B = new InterfaceC07650Zd() { // from class: X.3CR
            @Override // X.InterfaceC07650Zd
            public boolean ANY(String str) {
                return false;
            }

            {
                GroupAdminPickerActivity.this = this;
            }

            @Override // X.InterfaceC07650Zd
            public boolean ANX(String str) {
                GroupAdminPickerActivity.this.A1S(str);
                return false;
            }
        };
        ImageView imageView = (ImageView) this.A03.findViewById(R.id.search_back);
        imageView.setImageDrawable(new C0We(this.A0E, C02160Ac.A03(this, R.drawable.ic_back_teal)));
        imageView.setOnClickListener(new ViewOnClickCListenerShape9S0100000_I0_1(this, 24));
        findViewById(R.id.search_btn).setOnClickListener(new ViewOnClickEBaseShape2S0100000_I0_2(this, 8));
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.list);
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        this.A0C = this.A0D.A04(this);
        C011005l A04 = C011005l.A04(getIntent().getStringExtra("gid"));
        if (A04 != null) {
            this.A0K = A04;
            A1R();
            C3CT c3ct = new C3CT(this);
            this.A0H = c3ct;
            c3ct.A01 = this.A0O;
            c3ct.A00 = C09940f2.A03(null, c3ct.A02.A0E);
            ((AbstractC04890Mh) c3ct).A01.A00();
            recyclerView.setAdapter(this.A0H);
            this.A0A.A01(this.A0R);
            this.A08.A01(this.A0Q);
            C456823b c456823b = this.A0I;
            c456823b.A00.add(this.A0S);
            this.A0J.A01(this.A0T);
            return;
        }
        throw null;
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.A0A.A00(this.A0R);
        this.A08.A00(this.A0Q);
        C456823b c456823b = this.A0I;
        c456823b.A00.remove(this.A0S);
        this.A0J.A00(this.A0T);
        this.A0C.A00();
        C3CS c3cs = this.A0G;
        if (c3cs != null) {
            c3cs.A05(true);
        }
    }

    @Override // android.app.Activity
    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        if (bundle.getBoolean("search")) {
            A1Q();
        }
    }

    @Override // X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("search", this.A03.getVisibility() == 0);
    }
}
