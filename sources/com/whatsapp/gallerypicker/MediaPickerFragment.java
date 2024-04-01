package com.whatsapp.gallerypicker;

import X.AbstractC000600i;
import X.AbstractC005302j;
import X.AbstractC15200oF;
import X.ActivityC02290Ap;
import X.ActivityC02320As;
import X.ActivityC02330At;
import X.AnonymousClass029;
import X.C001200o;
import X.C002301c;
import X.C003101m;
import X.C011605s;
import X.C018508q;
import X.C01B;
import X.C02180Ae;
import X.C02C;
import X.C02F;
import X.C08950cN;
import X.C0AT;
import X.C0BA;
import X.C0FK;
import X.C0O8;
import X.C0U0;
import X.C2AQ;
import X.C2F9;
import X.C2Gx;
import X.C2HC;
import X.C42041uv;
import X.C42611w2;
import X.C43981yK;
import X.C51682Xk;
import X.C51702Xm;
import X.C61122vd;
import X.C63332zc;
import X.InterfaceC52102a4;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.search.verification.client.R;
import com.whatsapp.StickyHeadersRecyclerView;
import com.whatsapp.gallery.MediaGalleryFragmentBase;
import com.whatsapp.gallerypicker.MediaPickerFragment;
import com.whatsapp.jid.UserJid;
import com.whatsapp.mediacomposer.MediaComposerActivity;
import com.whatsapp.util.Log;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: classes2.dex */
public class MediaPickerFragment extends Hilt_MediaPickerFragment {
    public int A00;
    public BroadcastReceiver A02;
    public C0U0 A04;
    public AbstractC000600i A05;
    public C018508q A06;
    public C01B A07;
    public C011605s A08;
    public C001200o A09;
    public C02F A0A;
    public C002301c A0B;
    public AbstractC005302j A0C;
    public C2AQ A0D;
    public C2F9 A0E;
    public C02C A0F;
    public boolean A0G;
    public boolean A0H = true;
    public int A01 = Integer.MAX_VALUE;
    public final HashSet A0J = new LinkedHashSet();
    public final C2Gx A0I = new C2Gx();
    public C0O8 A03 = new C0O8() { // from class: X.3BP
        public MenuItem A00;

        {
            MediaPickerFragment.this = this;
        }

        @Override // X.C0O8
        public boolean AGv(C0U0 c0u0, MenuItem menuItem) {
            if (menuItem.getItemId() == 0) {
                MediaPickerFragment mediaPickerFragment = MediaPickerFragment.this;
                mediaPickerFragment.A1A(mediaPickerFragment.A0J);
                return false;
            }
            return false;
        }

        @Override // X.C0O8
        public boolean AJ5(C0U0 c0u0, Menu menu) {
            MediaPickerFragment mediaPickerFragment = MediaPickerFragment.this;
            MenuItem add = menu.add(0, 0, 0, mediaPickerFragment.A0B.A06(R.string.ok));
            this.A00 = add;
            add.setShowAsAction(2);
            if (Build.VERSION.SDK_INT >= 21) {
                mediaPickerFragment.A0A().getWindow().setStatusBarColor(C02160Ac.A00(mediaPickerFragment.A09(), R.color.primary_dark));
                return true;
            }
            return true;
        }

        @Override // X.C0O8
        public void AJK(C0U0 c0u0) {
            MediaPickerFragment mediaPickerFragment = MediaPickerFragment.this;
            if (mediaPickerFragment.A0G) {
                mediaPickerFragment.A0A().finish();
            }
            mediaPickerFragment.A0J.clear();
            mediaPickerFragment.A04 = null;
            ((MediaGalleryFragmentBase) mediaPickerFragment).A06.A01.A00();
            if (Build.VERSION.SDK_INT >= 21) {
                mediaPickerFragment.A0A().getWindow().setStatusBarColor(C02160Ac.A00(mediaPickerFragment.A09(), R.color.black));
            }
        }

        @Override // X.C0O8
        public boolean ANE(C0U0 c0u0, Menu menu) {
            MediaPickerFragment mediaPickerFragment = MediaPickerFragment.this;
            HashSet hashSet = mediaPickerFragment.A0J;
            if (hashSet.isEmpty()) {
                c0u0.A0B(mediaPickerFragment.A0B.A06(R.string.select_multiple_title));
            } else {
                c0u0.A0B(mediaPickerFragment.A0B.A0A(R.plurals.n_selected, hashSet.size(), Integer.valueOf(hashSet.size())));
            }
            this.A00.setVisible(!hashSet.isEmpty());
            return true;
        }
    };

    @Override // X.C0BA
    public void A0f() {
        this.A0U = true;
        if (this.A02 != null) {
            A0A().unregisterReceiver(this.A02);
            this.A02 = null;
        }
    }

    @Override // X.C0BA
    public void A0h(int i, int i2, Intent intent) {
        if (i == 1) {
            ActivityC02320As activityC02320As = (ActivityC02320As) A09();
            if (activityC02320As == null) {
                throw null;
            }
            if (i2 == -1) {
                activityC02320As.setResult(-1, intent);
                activityC02320As.finish();
            } else if (i2 == 2) {
                activityC02320As.setResult(2);
                activityC02320As.finish();
            } else if (i2 != 1) {
            } else {
                ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("android.intent.extra.STREAM");
                HashSet hashSet = this.A0J;
                hashSet.clear();
                if (parcelableArrayListExtra != null) {
                    hashSet.addAll(parcelableArrayListExtra);
                }
                C0U0 c0u0 = this.A04;
                if (c0u0 == null) {
                    this.A04 = activityC02320As.A0e(this.A03);
                } else {
                    c0u0.A06();
                }
                this.A0I.A02(intent.getExtras());
                ((MediaGalleryFragmentBase) this).A06.A01.A00();
            }
        }
    }

    @Override // com.whatsapp.gallery.MediaGalleryFragmentBase, X.C0BA
    public void A0j(Bundle bundle) {
        ArrayList parcelableArrayListExtra;
        String str;
        String str2;
        super.A0j(bundle);
        ActivityC02320As activityC02320As = (ActivityC02320As) A09();
        if (activityC02320As != null) {
            Intent intent = activityC02320As.getIntent();
            this.A01 = intent.getIntExtra("max_items", Integer.MAX_VALUE);
            this.A0H = intent.getBooleanExtra("preview", true);
            boolean booleanExtra = intent.getBooleanExtra("is_in_multi_select_mode_only", false);
            this.A0G = booleanExtra;
            if (booleanExtra) {
                this.A04 = activityC02320As.A0e(this.A03);
            }
            this.A0C = AbstractC005302j.A02(intent.getStringExtra("jid"));
            this.A00 = 7;
            ActivityC02290Ap activityC02290Ap = (ActivityC02290Ap) A09();
            if (activityC02290Ap != null) {
                Intent intent2 = activityC02290Ap.getIntent();
                if (intent2 != null) {
                    String resolveType = intent2.resolveType(activityC02290Ap);
                    if (resolveType != null) {
                        if (resolveType.equals("vnd.android.cursor.dir/image") || resolveType.equals("image/*")) {
                            this.A00 = 1;
                            activityC02290Ap.setTitle(this.A0B.A06(R.string.pick_photos_gallery_title));
                        }
                        if (resolveType.equals("vnd.android.cursor.dir/video") || resolveType.equals("video/*")) {
                            this.A00 = 4;
                            activityC02290Ap.setTitle(this.A0B.A06(R.string.pick_videos_gallery_title));
                        }
                    }
                    Bundle extras = intent2.getExtras();
                    if (extras != null) {
                        str2 = extras.getString("window_title");
                    } else {
                        str2 = null;
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        activityC02290Ap.A1B(str2);
                    }
                    if (extras != null) {
                        this.A00 = 7 & extras.getInt("include_media", this.A00);
                    }
                }
                if (bundle != null) {
                    parcelableArrayListExtra = bundle.getParcelableArrayList("android.intent.extra.STREAM");
                } else {
                    parcelableArrayListExtra = intent.getParcelableArrayListExtra("android.intent.extra.STREAM");
                }
                if (parcelableArrayListExtra != null && !parcelableArrayListExtra.isEmpty()) {
                    HashSet hashSet = this.A0J;
                    hashSet.clear();
                    hashSet.addAll(parcelableArrayListExtra);
                    this.A04 = activityC02320As.A0e(this.A03);
                    ((MediaGalleryFragmentBase) this).A06.A01.A00();
                }
                Uri data = intent.getData();
                if (data != null) {
                    str = data.toString();
                } else {
                    str = "";
                }
                StringBuilder sb = new StringBuilder("mediapickerfragment/create/");
                sb.append(str);
                Log.i(sb.toString());
                A0J();
                ActivityC02330At A09 = A09();
                A16(false, C61122vd.A01(A09 == null ? null : A09.getContentResolver()));
                final C2F9 c2f9 = this.A0E;
                StickyHeadersRecyclerView stickyHeadersRecyclerView = ((MediaGalleryFragmentBase) this).A08;
                if (c2f9 != null) {
                    c2f9.A03(stickyHeadersRecyclerView.getContext());
                    stickyHeadersRecyclerView.A0m(new AbstractC15200oF() { // from class: X.3kF
                        public final /* synthetic */ int A01 = 3;
                        public int A00 = 0;

                        @Override // X.AbstractC15200oF
                        public void A00(RecyclerView recyclerView, int i) {
                            if (i != 0) {
                                if (i == 1 && this.A00 == 0) {
                                    c2f9.A02(this.A01);
                                }
                            } else {
                                c2f9.A01();
                            }
                            this.A00 = i;
                        }
                    });
                    return;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }

    @Override // com.whatsapp.gallery.MediaGalleryFragmentBase, X.C0BA
    public void A0k(Bundle bundle) {
        bundle.putInt("sort_type", ((MediaGalleryFragmentBase) this).A02);
        bundle.putParcelableArrayList("android.intent.extra.STREAM", new ArrayList<>(this.A0J));
    }

    @Override // X.C0BA
    public void A0m(Menu menu, MenuInflater menuInflater) {
        if (this.A01 > 1) {
            menu.add(0, R.id.menuitem_select_multiple, 0, this.A0B.A06(R.string.select_multiple)).setIcon(C02180Ae.A0O(((Hilt_MediaPickerFragment) this).A00, R.drawable.ic_action_select_multiple_teal, R.color.tealActionBarItemDrawableTint)).setShowAsAction(2);
        }
    }

    @Override // X.C0BA
    public boolean A0o(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.menuitem_select_multiple) {
            ActivityC02320As activityC02320As = (ActivityC02320As) A09();
            if (activityC02320As != null) {
                this.A04 = activityC02320As.A0e(this.A03);
                ((MediaGalleryFragmentBase) this).A06.A01.A00();
                return true;
            }
            throw null;
        }
        return false;
    }

    @Override // com.whatsapp.gallery.MediaGalleryFragmentBase, X.C0BA
    public void A0q() {
        super.A0q();
        this.A03 = null;
        this.A04 = null;
        int childCount = ((MediaGalleryFragmentBase) this).A08.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = ((MediaGalleryFragmentBase) this).A08.getChildAt(i);
            if (childAt instanceof C51702Xm) {
                ((ImageView) childAt).setImageDrawable(null);
            }
        }
    }

    @Override // com.whatsapp.gallery.MediaGalleryFragmentBase, X.C0BA
    public void A0s() {
        super.A0s();
        IntentFilter intentFilter = new IntentFilter("android.intent.action.MEDIA_MOUNTED");
        intentFilter.addAction("android.intent.action.MEDIA_UNMOUNTED");
        intentFilter.addAction("android.intent.action.MEDIA_SCANNER_STARTED");
        intentFilter.addAction("android.intent.action.MEDIA_SCANNER_FINISHED");
        intentFilter.addAction("android.intent.action.MEDIA_EJECT");
        intentFilter.addDataScheme("file");
        this.A02 = new BroadcastReceiver() { // from class: X.2ve
            {
                MediaPickerFragment.this = this;
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                String action = intent.getAction();
                if (action == null) {
                    return;
                }
                switch (action.hashCode()) {
                    case -1514214344:
                        if (!action.equals("android.intent.action.MEDIA_MOUNTED")) {
                            return;
                        }
                        Log.i("mediapickerfragment/receivemediabroadcast/ACTION_MEDIA_MOUNTED");
                        return;
                    case -1142424621:
                        if (!action.equals("android.intent.action.MEDIA_SCANNER_FINISHED")) {
                            return;
                        }
                        Log.i("mediapickerfragment/receivemediabroadcast/ACTION_MEDIA_SCANNER_FINISHED");
                        MediaPickerFragment.this.A16(false, false);
                        return;
                    case -963871873:
                        if (!action.equals("android.intent.action.MEDIA_UNMOUNTED")) {
                            return;
                        }
                        Log.i("mediapickerfragment/receivemediabroadcast/ACTION_MEDIA_UNMOUNTED");
                        MediaPickerFragment.this.A16(true, false);
                        return;
                    case -625887599:
                        if (!action.equals("android.intent.action.MEDIA_EJECT")) {
                            return;
                        }
                        Log.i("mediapickerfragment/receivemediabroadcast/ACTION_MEDIA_EJECT");
                        MediaPickerFragment.this.A16(true, false);
                        return;
                    case 1412829408:
                        if (!action.equals("android.intent.action.MEDIA_SCANNER_STARTED")) {
                            return;
                        }
                        Log.i("mediapickerfragment/receivemediabroadcast/ACTION_MEDIA_SCANNER_STARTED");
                        MediaPickerFragment.this.A16(false, true);
                        return;
                    default:
                        return;
                }
            }
        };
        A0A().registerReceiver(this.A02, intentFilter);
    }

    public final void A19(InterfaceC52102a4 interfaceC52102a4) {
        if (interfaceC52102a4 == null) {
            return;
        }
        if (A17()) {
            HashSet hashSet = this.A0J;
            Uri A88 = interfaceC52102a4.A88();
            if (hashSet.contains(A88)) {
                hashSet.remove(A88);
                this.A0I.A00.remove(A88);
            } else {
                int size = hashSet.size();
                int i = this.A01;
                if (size < i) {
                    hashSet.add(A88);
                    this.A0I.A04(new C42611w2(A88));
                } else {
                    this.A06.A0E(C42041uv.A04(((Hilt_MediaPickerFragment) this).A00, i), 0);
                }
            }
            if (hashSet.isEmpty()) {
                C0U0 c0u0 = this.A04;
                if (c0u0 == null) {
                    throw null;
                }
                c0u0.A05();
            } else {
                C0U0 c0u02 = this.A04;
                if (c0u02 != null) {
                    c0u02.A06();
                    C018508q c018508q = this.A06;
                    c018508q.A02.postDelayed(new RunnableEBaseShape2S0100000_I0_2(this, 47), 300L);
                } else {
                    throw null;
                }
            }
            ((MediaGalleryFragmentBase) this).A06.A01.A00();
            return;
        }
        HashSet hashSet2 = new HashSet();
        Uri A882 = interfaceC52102a4.A88();
        hashSet2.add(A882);
        this.A0I.A04(new C42611w2(A882));
        A1A(hashSet2);
    }

    public final void A1A(HashSet hashSet) {
        if (hashSet == null || hashSet.isEmpty()) {
            return;
        }
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(hashSet);
        ActivityC02330At A0A = A0A();
        if (this.A0H) {
            int intExtra = A0A.getIntent().getIntExtra("origin", 1);
            C63332zc c63332zc = new C63332zc(A0A);
            c63332zc.A08 = arrayList;
            c63332zc.A06 = C003101m.A07(this.A0C);
            c63332zc.A00 = this.A01;
            c63332zc.A01 = intExtra;
            c63332zc.A02 = A0A.getIntent().getLongExtra("picker_open_time", 0L);
            c63332zc.A0B = true;
            c63332zc.A03 = A0A.getIntent().getLongExtra("quoted_message_row_id", 0L);
            c63332zc.A07 = A0A.getIntent().getStringExtra("quoted_group_jid");
            c63332zc.A0A = intExtra != 20;
            c63332zc.A09 = A0A.getIntent().getBooleanExtra("number_from_url", false);
            C2Gx c2Gx = this.A0I;
            C42611w2 A01 = c2Gx.A01((Uri) arrayList.get(0));
            List A0F = C003101m.A0F(UserJid.class, A0A.getIntent().getStringArrayListExtra("mentions"));
            Iterator it = new ArrayList(c2Gx.A00.values()).iterator();
            while (it.hasNext()) {
                C42611w2 c42611w2 = (C42611w2) it.next();
                c42611w2.A0B(null);
                c42611w2.A0C(null);
            }
            if (!((AbstractCollection) A0F).isEmpty()) {
                A01.A0C(AnonymousClass029.A0v(A0F));
            }
            String stringExtra = A0A.getIntent().getStringExtra("android.intent.extra.TEXT");
            if (!TextUtils.isEmpty(stringExtra)) {
                A01.A0B(stringExtra);
            }
            c63332zc.A05 = c2Gx.A00();
            if (C2HC.A00 && arrayList.size() == 1 && ((C0BA) this).A0A != null) {
                Uri uri = (Uri) arrayList.get(0);
                C51682Xk A0z = A0z(uri);
                if (A0z != null) {
                    c63332zc.A04 = uri;
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(new C0FK(A0z, uri.toString()));
                    View findViewById = ((C0BA) this).A0A.findViewById(R.id.header_transition);
                    arrayList2.add(new C0FK(findViewById, C0AT.A0G(findViewById)));
                    View findViewById2 = ((C0BA) this).A0A.findViewById(R.id.transition_clipper_bottom);
                    C0AT.A0e(findViewById2, A0A().getApplicationContext().getResources().getString(R.string.transition_footer));
                    arrayList2.add(new C0FK(findViewById2, C0AT.A0G(findViewById2)));
                    View findViewById3 = ((C0BA) this).A0A.findViewById(R.id.gallery_filter_swipe_transition);
                    arrayList2.add(new C0FK(findViewById3, C0AT.A0G(findViewById3)));
                    View findViewById4 = ((C0BA) this).A0A.findViewById(R.id.gallery_send_button_transition);
                    arrayList2.add(new C0FK(findViewById4, C0AT.A0G(findViewById4)));
                    Bitmap bitmap = A0z.A00;
                    if (bitmap != null) {
                        this.A08.A03().A05(C43981yK.A06(uri), bitmap);
                    }
                    A0A.startActivityForResult(MediaComposerActivity.A01(c63332zc), 1, C08950cN.A00(A0A, (C0FK[]) arrayList2.toArray(new C0FK[0])).A01());
                    return;
                }
                A0A.startActivityForResult(MediaComposerActivity.A01(c63332zc), 1);
                return;
            }
            A0A.startActivityForResult(MediaComposerActivity.A01(c63332zc), 1);
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("bucket_uri", A0A.getIntent().getData());
        intent.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
        intent.setData(arrayList.size() == 1 ? (Uri) arrayList.get(0) : null);
        A0A.setResult(-1, intent);
        A0A.finish();
    }
}
