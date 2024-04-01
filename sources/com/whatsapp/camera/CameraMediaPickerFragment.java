package com.whatsapp.camera;

import X.AbstractC000600i;
import X.ActivityC02330At;
import X.C001200o;
import X.C002301c;
import X.C018508q;
import X.C01B;
import X.C02160Ac;
import X.C02180Ae;
import X.C02C;
import X.C02F;
import X.C0AT;
import X.C0BA;
import X.C0FK;
import X.C0We;
import X.C29X;
import X.C2AQ;
import X.C2Gx;
import X.C2HC;
import X.C42041uv;
import X.C42611w2;
import X.C51682Xk;
import X.C51702Xm;
import X.InterfaceC05800Qh;
import X.InterfaceC08810c7;
import X.InterfaceC52102a4;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import androidx.appcompat.widget.Toolbar;
import com.facebook.redex.ViewOnClickEBaseShape0S0100000_I0_0;
import com.google.android.search.verification.client.R;
import com.whatsapp.StickyHeadersRecyclerView;
import com.whatsapp.camera.CameraMediaPickerFragment;
import com.whatsapp.gallery.MediaGalleryFragmentBase;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: classes2.dex */
public class CameraMediaPickerFragment extends Hilt_CameraMediaPickerFragment {
    public BroadcastReceiver A00;
    public MenuItem A01;
    public Toolbar A02;
    public Toolbar A03;
    public AbstractC000600i A04;
    public C018508q A05;
    public C01B A06;
    public C001200o A07;
    public C02F A08;
    public C002301c A09;
    public C2AQ A0A;
    public C02C A0B;
    public final List A0E = new ArrayList();
    public final HashSet A0D = new LinkedHashSet();
    public final C2Gx A0C = new C2Gx();

    @Override // X.C0BA
    public void A0f() {
        this.A0U = true;
        BroadcastReceiver broadcastReceiver = this.A00;
        if (broadcastReceiver != null) {
            A09().unregisterReceiver(broadcastReceiver);
            this.A00 = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e1  */
    @Override // X.C0BA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0h(int r9, int r10, android.content.Intent r11) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.camera.CameraMediaPickerFragment.A0h(int, int, android.content.Intent):void");
    }

    @Override // com.whatsapp.gallery.MediaGalleryFragmentBase, X.C0BA
    public void A0k(Bundle bundle) {
        bundle.putInt("sort_type", ((MediaGalleryFragmentBase) this).A02);
        bundle.putParcelableArrayList("android.intent.extra.STREAM", new ArrayList<>(this.A0D));
    }

    @Override // com.whatsapp.gallery.MediaGalleryFragmentBase, X.C0BA
    public View A0p(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.camera_gallery, viewGroup, false);
    }

    @Override // com.whatsapp.gallery.MediaGalleryFragmentBase, X.C0BA
    public void A0q() {
        super.A0q();
        StickyHeadersRecyclerView stickyHeadersRecyclerView = ((MediaGalleryFragmentBase) this).A08;
        if (stickyHeadersRecyclerView != null) {
            int childCount = stickyHeadersRecyclerView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = ((MediaGalleryFragmentBase) this).A08.getChildAt(i);
                if (childAt instanceof C51702Xm) {
                    ((ImageView) childAt).setImageDrawable(null);
                }
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
        BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: X.2oX
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
                        CameraMediaPickerFragment.this.A16(false, false);
                        return;
                    case -963871873:
                        if (!action.equals("android.intent.action.MEDIA_UNMOUNTED")) {
                            return;
                        }
                        Log.i("mediapickerfragment/receivemediabroadcast/ACTION_MEDIA_UNMOUNTED");
                        CameraMediaPickerFragment.this.A16(true, false);
                        return;
                    case -625887599:
                        if (!action.equals("android.intent.action.MEDIA_EJECT")) {
                            return;
                        }
                        Log.i("mediapickerfragment/receivemediabroadcast/ACTION_MEDIA_EJECT");
                        CameraMediaPickerFragment.this.A16(true, false);
                        return;
                    case 1412829408:
                        if (!action.equals("android.intent.action.MEDIA_SCANNER_STARTED")) {
                            return;
                        }
                        Log.i("mediapickerfragment/receivemediabroadcast/ACTION_MEDIA_SCANNER_STARTED");
                        CameraMediaPickerFragment.this.A16(false, true);
                        return;
                    default:
                        return;
                }
            }
        };
        this.A00 = broadcastReceiver;
        A09().registerReceiver(broadcastReceiver, intentFilter);
    }

    @Override // X.C0BA
    public void A0w(View view, Bundle bundle) {
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        this.A03 = toolbar;
        toolbar.setNavigationIcon(new C0We(this.A09, C02180Ae.A0O(((Hilt_CameraMediaPickerFragment) this).A00, R.drawable.ic_back_teal, R.color.tealActionBarItemDrawableTint)));
        this.A03.setNavigationContentDescription(this.A09.A06(R.string.back));
        this.A03.getMenu().add(0, R.id.menuitem_select_multiple, 0, this.A09.A06(R.string.select_multiple)).setIcon(C02180Ae.A0O(((Hilt_CameraMediaPickerFragment) this).A00, R.drawable.ic_action_select_multiple_teal, R.color.tealActionBarItemDrawableTint)).setShowAsAction(2);
        Toolbar toolbar2 = this.A03;
        toolbar2.A0R = new InterfaceC08810c7() { // from class: X.34t
            @Override // X.InterfaceC08810c7
            public final boolean onMenuItemClick(MenuItem menuItem) {
                CameraMediaPickerFragment cameraMediaPickerFragment = CameraMediaPickerFragment.this;
                if (menuItem.getItemId() == R.id.menuitem_select_multiple) {
                    cameraMediaPickerFragment.A19();
                    return true;
                }
                return false;
            }
        };
        toolbar2.setNavigationOnClickListener(new ViewOnClickEBaseShape0S0100000_I0_0(this, 23));
        Toolbar toolbar3 = (Toolbar) view.findViewById(R.id.gallery_action_mode_bar);
        this.A02 = toolbar3;
        MenuItem add = toolbar3.getMenu().add(0, R.id.menuitem_select_multiple, 0, this.A09.A06(R.string.ok));
        this.A01 = add;
        add.setShowAsAction(2);
        this.A02.setNavigationIcon(new C0We(this.A09, C02160Ac.A03(((Hilt_CameraMediaPickerFragment) this).A00, R.drawable.ic_back)));
        this.A02.setNavigationContentDescription(this.A09.A06(R.string.back));
        Toolbar toolbar4 = this.A02;
        toolbar4.A0R = new InterfaceC08810c7() { // from class: X.34u
            @Override // X.InterfaceC08810c7
            public final boolean onMenuItemClick(MenuItem menuItem) {
                CameraMediaPickerFragment cameraMediaPickerFragment = CameraMediaPickerFragment.this;
                if (menuItem.getItemId() == R.id.menuitem_select_multiple) {
                    cameraMediaPickerFragment.A1D(cameraMediaPickerFragment.A0D);
                    return true;
                }
                return false;
            }
        };
        toolbar4.setNavigationOnClickListener(new ViewOnClickEBaseShape0S0100000_I0_0(this, 24));
    }

    public final void A19() {
        if (this.A02.getVisibility() != 0) {
            this.A02.setVisibility(0);
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(120L);
            this.A02.startAnimation(alphaAnimation);
        }
        this.A03.setVisibility(4);
        A1B();
    }

    public final void A1A() {
        if (this.A02.getVisibility() != 4) {
            this.A02.setVisibility(4);
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration(120L);
            this.A02.startAnimation(alphaAnimation);
        }
        this.A03.setVisibility(0);
        this.A0D.clear();
        this.A0C.A00.clear();
        ((MediaGalleryFragmentBase) this).A06.A01.A00();
    }

    public final void A1B() {
        HashSet hashSet = this.A0D;
        if (hashSet.isEmpty()) {
            this.A02.setTitle(this.A09.A06(R.string.select_multiple_title));
        } else {
            this.A02.setTitle(this.A09.A0A(R.plurals.n_selected, hashSet.size(), Integer.valueOf(hashSet.size())));
        }
        this.A01.setVisible(true ^ hashSet.isEmpty());
    }

    public final void A1C(InterfaceC52102a4 interfaceC52102a4) {
        if (interfaceC52102a4 == null) {
            return;
        }
        if (A17()) {
            HashSet hashSet = this.A0D;
            Uri A88 = interfaceC52102a4.A88();
            if (hashSet.contains(A88)) {
                hashSet.remove(A88);
            } else if (hashSet.size() < 30) {
                hashSet.add(A88);
                this.A0C.A04(new C42611w2(A88));
            } else {
                this.A05.A0E(C42041uv.A04(((Hilt_CameraMediaPickerFragment) this).A00, 30), 0);
            }
            if (hashSet.isEmpty()) {
                A1A();
            } else {
                A1B();
                A13(hashSet.size());
            }
            ((MediaGalleryFragmentBase) this).A06.A01.A00();
            return;
        }
        HashSet hashSet2 = new HashSet();
        Uri A882 = interfaceC52102a4.A88();
        hashSet2.add(A882);
        this.A0C.A04(new C42611w2(A882));
        A1D(hashSet2);
    }

    public final void A1D(HashSet hashSet) {
        C29X A8l;
        Bitmap bitmap;
        InterfaceC52102a4 interfaceC52102a4;
        C51682Xk A0z;
        if (hashSet == null || hashSet.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(hashSet);
        ActivityC02330At A09 = A09();
        if (!(A09 instanceof InterfaceC05800Qh) || (A8l = ((InterfaceC05800Qh) A09).A8l()) == null) {
            return;
        }
        ArrayList arrayList2 = null;
        if (C2HC.A00 && arrayList.size() == 1 && ((C0BA) this).A0A != null && (A0z = A0z((Uri) arrayList.get(0))) != null) {
            arrayList2 = new ArrayList();
            arrayList2.add(new C0FK(A0z, arrayList.get(0).toString()));
            View findViewById = ((C0BA) this).A0A.findViewById(R.id.gallery_header_transition);
            arrayList2.add(new C0FK(findViewById, C0AT.A0G(findViewById)));
            View findViewById2 = ((C0BA) this).A0A.findViewById(R.id.gallery_footer_transition);
            arrayList2.add(new C0FK(findViewById2, C0AT.A0G(findViewById2)));
            View findViewById3 = ((C0BA) this).A0A.findViewById(R.id.gallery_send_button_transition);
            arrayList2.add(new C0FK(findViewById3, C0AT.A0G(findViewById3)));
            bitmap = A0z.A00;
            interfaceC52102a4 = A0z.A04;
        } else {
            bitmap = null;
            interfaceC52102a4 = null;
        }
        A8l.A0M(arrayList, arrayList2, bitmap, interfaceC52102a4, this);
    }
}
