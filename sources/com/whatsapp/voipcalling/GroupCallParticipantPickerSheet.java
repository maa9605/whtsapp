package com.whatsapp.voipcalling;

import X.AbstractActivityC40671sf;
import X.AbstractC08940cM;
import X.AnonymousClass088;
import X.C000700j;
import X.C002301c;
import X.C003101m;
import X.C02160Ac;
import X.C02E;
import X.C07630Zb;
import X.C08930cL;
import X.C0AT;
import X.C0We;
import X.InterfaceC07650Zd;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.redex.ViewOnClickEBaseShape1S0200000_I0_1;
import com.facebook.redex.ViewOnClickEBaseShape6S0100000_I0_6;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.search.verification.client.R;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.ViewOnClickCListenerShape11S0100000_I0_3;
import com.whatsapp.voipcalling.GroupCallParticipantPickerSheet;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class GroupCallParticipantPickerSheet extends AbstractActivityC40671sf {
    public float A00;
    public float A01;
    public ColorDrawable A02;
    public View A03;
    public View A04;
    public View A05;
    public ViewTreeObserver.OnGlobalLayoutListener A06 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.3d4
        {
            GroupCallParticipantPickerSheet.this = this;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            GroupCallParticipantPickerSheet groupCallParticipantPickerSheet = GroupCallParticipantPickerSheet.this;
            groupCallParticipantPickerSheet.A03.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            if (!groupCallParticipantPickerSheet.A0B) {
                groupCallParticipantPickerSheet.A08.A0O(4);
            }
            groupCallParticipantPickerSheet.A0B = false;
        }
    };
    public SearchView A07;
    public BottomSheetBehavior A08;
    public C02E A09;
    public C002301c A0A;
    public boolean A0B;

    public static void A00(Activity activity, GroupJid groupJid, List list, List list2, int i, Integer num) {
        C000700j.A08(!list.isEmpty(), "List must be non empty");
        Intent intent = new Intent(activity, GroupCallParticipantPickerSheet.class);
        intent.putStringArrayListExtra("jids", C003101m.A0E(list));
        if (list2 != null && !list2.isEmpty()) {
            intent.putStringArrayListExtra("selected", C003101m.A0E(list2));
        }
        if (groupJid != null) {
            intent.putExtra("source_group_jid", groupJid);
        }
        intent.putExtra("hidden_jids", i);
        intent.putExtra("call_from_ui", num);
        activity.startActivity(intent);
    }

    public void A1o() {
        if (((GroupCallParticipantPicker) this).A00 != null) {
            A1P().addHeaderView(((GroupCallParticipantPicker) this).A00, null, false);
        }
        this.A07.A0H("");
        C08930cL c08930cL = (C08930cL) this.A03.getLayoutParams();
        c08930cL.A00(this.A08);
        ((ViewGroup.MarginLayoutParams) c08930cL).height = (int) this.A00;
        this.A03.setLayoutParams(c08930cL);
        this.A05.setVisibility(0);
        this.A04.setVisibility(8);
    }

    public void A1p() {
        if (((GroupCallParticipantPicker) this).A00 != null) {
            A1P().removeHeaderView(((GroupCallParticipantPicker) this).A00);
        }
        C08930cL c08930cL = (C08930cL) this.A03.getLayoutParams();
        c08930cL.A00(null);
        ((ViewGroup.MarginLayoutParams) c08930cL).height = -1;
        this.A03.setLayoutParams(c08930cL);
        this.A07.setIconified(false);
        this.A05.setVisibility(8);
        this.A04.setVisibility(0);
    }

    public final void A1q() {
        float f;
        int size;
        Point point = new Point();
        getWindowManager().getDefaultDisplay().getSize(point);
        Rect rect = new Rect();
        getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        this.A01 = point.y - rect.top;
        this.A00 = (int) (f * 0.75f);
        if (AnonymousClass088.A1y(this.A09.A0H())) {
            return;
        }
        int i = (int) (this.A01 * 0.55f);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.info_screen_card_spacing) + getResources().getDimensionPixelSize(R.dimen.group_call_participant_picker_sheet_search_holder_height);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.contact_picker_row_height);
        int i2 = ((dimensionPixelSize2 >> 1) - ((i - dimensionPixelSize) % dimensionPixelSize2)) + i;
        ArrayList<String> stringArrayListExtra = getIntent().getStringArrayListExtra("jids");
        if (stringArrayListExtra != null && (size = stringArrayListExtra.size()) > 0) {
            i2 = Math.min(i2, (dimensionPixelSize2 * size) + dimensionPixelSize + getResources().getDimensionPixelSize(R.dimen.selected_contacts_layout_height_big));
        }
        this.A08.A0N(i2);
    }

    public /* synthetic */ void lambda$onCreate$2692$GroupCallParticipantPickerSheet(View view) {
        A1p();
    }

    @Override // com.whatsapp.voipcalling.GroupCallParticipantPicker, X.AbstractActivityC40691si, X.ActivityC02290Ap, X.ActivityC02340Au, android.app.Activity
    public void onBackPressed() {
        if (this.A04.getVisibility() == 0) {
            A1o();
        } else {
            this.A08.A0O(5);
        }
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        A1q();
        if (this.A04.getVisibility() != 0) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.A03.getLayoutParams();
            marginLayoutParams.height = (int) this.A00;
            this.A03.setLayoutParams(marginLayoutParams);
        }
        this.A0B = true;
        this.A03.getViewTreeObserver().addOnGlobalLayoutListener(this.A06);
        this.A03.requestLayout();
    }

    @Override // X.AbstractActivityC40671sf, X.AbstractActivityC40681sh, X.AbstractActivityC40691si, X.AbstractActivityC40701sj, X.AbstractActivityC02260Am, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        findViewById(R.id.action_bar).setVisibility(8);
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().addFlags(EditorInfoCompat.IME_FLAG_FORCE_ASCII);
        }
        final int A00 = C02160Ac.A00(this, R.color.primary_dark_dimmed);
        final int A002 = C02160Ac.A00(this, R.color.primary_dark);
        View findViewById = findViewById(R.id.bottom_sheet);
        this.A03 = findViewById;
        this.A08 = BottomSheetBehavior.A00(findViewById);
        this.A03.getViewTreeObserver().addOnGlobalLayoutListener(this.A06);
        BottomSheetBehavior bottomSheetBehavior = this.A08;
        bottomSheetBehavior.A0J = true;
        bottomSheetBehavior.A0O(5);
        A1q();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.A03.getLayoutParams();
        marginLayoutParams.height = (int) this.A00;
        this.A03.setLayoutParams(marginLayoutParams);
        ListView A1P = A1P();
        if (Build.VERSION.SDK_INT >= 21) {
            A1P.setNestedScrollingEnabled(true);
        }
        View findViewById2 = findViewById(R.id.background);
        C0AT.A0V(findViewById2, 2);
        final PointF pointF = new PointF();
        findViewById2.setOnClickListener(new ViewOnClickEBaseShape1S0200000_I0_1(this, pointF, 2));
        findViewById2.setOnTouchListener(new View.OnTouchListener() { // from class: X.3by
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                pointF.set(motionEvent.getX(), motionEvent.getY());
                return false;
            }
        });
        ColorDrawable colorDrawable = new ColorDrawable();
        this.A02 = colorDrawable;
        findViewById2.setBackground(colorDrawable);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(getResources().getInteger(17694720));
        findViewById2.startAnimation(alphaAnimation);
        this.A08.A0E = new AbstractC08940cM() { // from class: X.3tx
            {
                GroupCallParticipantPickerSheet.this = this;
            }

            @Override // X.AbstractC08940cM
            public void A00(View view, float f) {
                GroupCallParticipantPickerSheet groupCallParticipantPickerSheet = GroupCallParticipantPickerSheet.this;
                float top = (groupCallParticipantPickerSheet.A01 - view.getTop()) / groupCallParticipantPickerSheet.A00;
                groupCallParticipantPickerSheet.A02.setColor(((int) (127.0f * top)) << 24);
                if (Build.VERSION.SDK_INT >= 21) {
                    groupCallParticipantPickerSheet.getWindow().setStatusBarColor(C09990f7.A04(A002, A00, top));
                }
            }

            @Override // X.AbstractC08940cM
            public void A01(View view, int i) {
                if (i == 5) {
                    GroupCallParticipantPickerSheet groupCallParticipantPickerSheet = GroupCallParticipantPickerSheet.this;
                    groupCallParticipantPickerSheet.finish();
                    groupCallParticipantPickerSheet.overridePendingTransition(0, 0);
                }
            }
        };
        this.A05 = findViewById(R.id.title_holder);
        View findViewById3 = findViewById(R.id.search_holder_sheet);
        this.A04 = findViewById3;
        C07630Zb.A00(findViewById3);
        this.A04.setVisibility(8);
        SearchView searchView = (SearchView) this.A04.findViewById(R.id.search_view);
        this.A07 = searchView;
        searchView.setIconifiedByDefault(false);
        this.A07.setQueryHint(getString(R.string.group_call_participant_search_hint));
        ((ImageView) this.A07.findViewById(R.id.search_mag_icon)).setImageDrawable(new InsetDrawable(C02160Ac.A03(this, R.drawable.ic_back_teal)) { // from class: X.3d3
            @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
            public void draw(Canvas canvas) {
            }
        });
        this.A07.A0B = new InterfaceC07650Zd() { // from class: X.3ty
            @Override // X.InterfaceC07650Zd
            public boolean ANY(String str) {
                return false;
            }

            {
                GroupCallParticipantPickerSheet.this = this;
            }

            @Override // X.InterfaceC07650Zd
            public boolean ANX(String str) {
                GroupCallParticipantPickerSheet groupCallParticipantPickerSheet = GroupCallParticipantPickerSheet.this;
                groupCallParticipantPickerSheet.A0W = str;
                ArrayList A03 = C09940f2.A03(str, groupCallParticipantPickerSheet.A0S);
                groupCallParticipantPickerSheet.A0X = A03;
                if (A03.isEmpty()) {
                    groupCallParticipantPickerSheet.A0X = null;
                }
                groupCallParticipantPickerSheet.A1c();
                return false;
            }
        };
        ImageView imageView = (ImageView) this.A04.findViewById(R.id.search_back);
        imageView.setImageDrawable(new C0We(this.A0A, C02160Ac.A03(this, R.drawable.ic_back_teal)));
        imageView.setOnClickListener(new ViewOnClickCListenerShape11S0100000_I0_3(this, 14));
        findViewById(R.id.search_btn).setOnClickListener(new ViewOnClickEBaseShape6S0100000_I0_6(this, 15));
        ((TextView) findViewById(R.id.sheet_title)).setText(this.A0A.A08(R.plurals.group_call_participant_picker_sheet_title, ((AbstractCollection) C003101m.A0F(UserJid.class, getIntent().getStringArrayListExtra("jids"))).size()));
    }

    @Override // X.AbstractActivityC40691si, X.ActivityC02250Al, android.app.Activity
    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        if (bundle.getBoolean("search")) {
            A1p();
        }
    }

    @Override // X.AbstractActivityC40691si, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("search", this.A04.getVisibility() == 0);
    }
}
