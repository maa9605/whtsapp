package com.whatsapp.invites;

import X.AbstractC005302j;
import X.AbstractC04890Mh;
import X.AbstractView$OnClickListenerC49532Ky;
import X.ActivityC02290Ap;
import X.C000500h;
import X.C002301c;
import X.C003101m;
import X.C003301p;
import X.C011005l;
import X.C018608r;
import X.C018708s;
import X.C02160Ac;
import X.C02E;
import X.C02O;
import X.C05M;
import X.C05W;
import X.C06C;
import X.C09250cv;
import X.C0HS;
import X.C0L5;
import X.C0LF;
import X.C0We;
import X.C0Zn;
import X.C2HZ;
import X.C2KE;
import X.C2KG;
import X.C2MB;
import X.C2MI;
import X.C3DQ;
import X.C40081rY;
import X.C43871y8;
import X.C455822q;
import X.C47682Ce;
import X.C62122xN;
import X.C70693Tg;
import X.InterfaceC002901k;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.ViewOnClickEBaseShape2S0100000_I0_2;
import com.google.android.search.verification.client.R;
import com.whatsapp.invites.InviteGroupParticipantsActivity;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.mentions.MentionableEntry;
import com.whatsapp.util.ViewOnClickCListenerShape9S0100000_I0_1;
import java.io.ByteArrayOutputStream;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class InviteGroupParticipantsActivity extends C2KG {
    public LayoutInflater A00;
    public ImageView A01;
    public C018608r A02;
    public C05W A03;
    public C018708s A04;
    public C0Zn A05;
    public C0L5 A06;
    public C0LF A07;
    public C02E A08;
    public C000500h A09;
    public C002301c A0A;
    public C05M A0B;
    public C06C A0C;
    public C43871y8 A0D;
    public C40081rY A0E;
    public C47682Ce A0F;
    public C2MI A0G;
    public C455822q A0H;
    public MentionableEntry A0I;
    public C02O A0J;
    public C2MB A0K;
    public InterfaceC002901k A0L;
    public List A0M;
    public byte[] A0N;

    public static Intent A00(Context context, C2KE c2ke) {
        Intent intent = new Intent(context, InviteGroupParticipantsActivity.class);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Map map = c2ke.A02;
        Long l = null;
        for (Jid jid : map.keySet()) {
            C70693Tg c70693Tg = (C70693Tg) map.get(jid);
            if (c70693Tg != null) {
                if (l == null) {
                    l = Long.valueOf(c70693Tg.A00);
                }
                arrayList.add(jid.getRawString());
                arrayList2.add(c70693Tg.A01);
            }
        }
        intent.putExtra("jids", arrayList);
        intent.putExtra("invite_hashes", arrayList2);
        intent.putExtra("invite_expiration", l);
        intent.putExtra("group_jid", c2ke.A00.getRawString());
        return intent;
    }

    public static C09250cv A01(final Activity activity, View view, final Intent intent, final int i) {
        C09250cv A00 = C09250cv.A00(view, view.getResources().getText(R.string.invite_cancelled), 0);
        A00.A06(A00.A02.getText(R.string.undo), new AbstractView$OnClickListenerC49532Ky() { // from class: X.3DN
            @Override // X.AbstractView$OnClickListenerC49532Ky
            public void A00(View view2) {
                activity.startActivityForResult(intent, i);
            }
        });
        A00.A05(C02160Ac.A00(view.getContext(), R.color.group_invite_undo_accent));
        return A00;
    }

    public /* synthetic */ void lambda$onCreate$1851$InviteGroupParticipantsActivity(View view) {
        finish();
    }

    @Override // X.C2KG, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.app_name);
        setContentView(R.layout.invite_group_select_layout);
        this.A00 = LayoutInflater.from(this);
        this.A05 = this.A06.A04(this);
        this.A0I = (MentionableEntry) findViewById(R.id.comment);
        new C2HZ(this, this.A0H, this.A0K, ((ActivityC02290Ap) this).A08, this.A0E, this.A0D, this.A0F, this.A08, this.A0A, this.A0G, this.A09, this.A0J, findViewById(R.id.main), null);
        this.A0I.setText(R.string.group_invite_default_caption);
        getWindow().setSoftInputMode(3);
        this.A0I.requestFocus();
        TextView textView = (TextView) findViewById(R.id.group_name);
        this.A01 = (ImageView) findViewById(R.id.group_photo);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = ((AbstractCollection) C003101m.A0F(UserJid.class, getIntent().getStringArrayListExtra("jids"))).iterator();
        while (it.hasNext()) {
            AbstractC005302j abstractC005302j = (AbstractC005302j) it.next();
            arrayList.add(abstractC005302j);
            arrayList2.add(this.A03.A0A(abstractC005302j));
        }
        ArrayList<String> stringArrayListExtra = getIntent().getStringArrayListExtra("invite_hashes");
        long longExtra = getIntent().getLongExtra("invite_expiration", 0L);
        C011005l A04 = C011005l.A04(getIntent().getStringExtra("group_jid"));
        if (A04 != null) {
            this.A0M = new ArrayList();
            for (int i = 0; i < stringArrayListExtra.size(); i++) {
                this.A0M.add(new C62122xN((UserJid) arrayList.get(i), A04, stringArrayListExtra.get(i), longExtra));
            }
            C06C A0A = this.A03.A0A(A04);
            this.A0C = A0A;
            textView.setText(this.A04.A08(A0A, false));
            this.A0L.ARy(new C0HS(this.A07, this, this.A0C) { // from class: X.3DO
                public final C0LF A00;
                public final C06C A01;
                public final WeakReference A02;

                {
                    this.A00 = r2;
                    this.A02 = new WeakReference(this);
                    this.A01 = r4;
                }

                @Override // X.C0HS
                public Object A07(Object[] objArr) {
                    Bitmap bitmap;
                    Context context = (Context) this.A02.get();
                    byte[] bArr = null;
                    if (context != null) {
                        bitmap = this.A00.A02(context, this.A01, 96, 0.0f, false);
                        if (bitmap != null) {
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            bitmap.compress(Bitmap.CompressFormat.JPEG, 80, byteArrayOutputStream);
                            bArr = byteArrayOutputStream.toByteArray();
                        }
                    } else {
                        bitmap = null;
                    }
                    return new Pair(bitmap, bArr);
                }

                @Override // X.C0HS
                public void A09(Object obj) {
                    Pair pair = (Pair) obj;
                    Bitmap bitmap = (Bitmap) pair.first;
                    byte[] bArr = (byte[]) pair.second;
                    InviteGroupParticipantsActivity inviteGroupParticipantsActivity = (InviteGroupParticipantsActivity) this.A02.get();
                    if (inviteGroupParticipantsActivity != null) {
                        inviteGroupParticipantsActivity.A0N = bArr;
                        ImageView imageView = inviteGroupParticipantsActivity.A01;
                        if (bitmap == null) {
                            imageView.setImageResource(R.drawable.avatar_group);
                        } else {
                            imageView.setImageBitmap(bitmap);
                        }
                    }
                }
            }, new Void[0]);
            ImageView imageView = (ImageView) findViewById(R.id.send);
            imageView.setImageDrawable(new C0We(this.A0A, C02160Ac.A03(this, R.drawable.input_send)));
            imageView.setOnClickListener(new ViewOnClickCListenerShape9S0100000_I0_1(this, 39));
            RecyclerView recyclerView = (RecyclerView) findViewById(R.id.invite_contacts_recycler);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1);
            linearLayoutManager.A1Y(0);
            recyclerView.setLayoutManager(linearLayoutManager);
            C3DQ c3dq = new C3DQ(this);
            c3dq.A00 = arrayList2;
            ((AbstractC04890Mh) c3dq).A01.A00();
            recyclerView.setAdapter(c3dq);
            C003301p.A06((TextView) findViewById(R.id.send_invite_title));
            final View findViewById = findViewById(R.id.container);
            findViewById.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.2xQ
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    View view = findViewById;
                    view.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                    TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
                    translateAnimation.setDuration(200L);
                    view.startAnimation(translateAnimation);
                }
            });
            setResult(0, getIntent());
            findViewById(R.id.filler).setOnClickListener(new ViewOnClickEBaseShape2S0100000_I0_2(this, 26));
            if (Build.VERSION.SDK_INT >= 21) {
                getWindow().addFlags(EditorInfoCompat.IME_FLAG_FORCE_ASCII);
                getWindow().setStatusBarColor(0);
                getWindow().setNavigationBarColor(C02160Ac.A00(this, R.color.black));
                return;
            }
            return;
        }
        throw null;
    }

    @Override // X.ActivityC02270An, X.ActivityC02290Ap, X.ActivityC02330At, android.app.Activity
    public void onPause() {
        super.onPause();
        if (C2MB.A00(((ActivityC02290Ap) this).A04)) {
            getWindow().setSoftInputMode(5);
        } else {
            getWindow().setSoftInputMode(3);
        }
    }
}
