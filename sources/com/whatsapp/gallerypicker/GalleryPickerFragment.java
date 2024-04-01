package com.whatsapp.gallerypicker;

import X.AbstractC000600i;
import X.ActivityC02330At;
import X.C000200d;
import X.C000700j;
import X.C001200o;
import X.C002301c;
import X.C011605s;
import X.C01B;
import X.C02160Ac;
import X.C02C;
import X.C02F;
import X.C0HS;
import X.C2AQ;
import X.C3BE;
import X.C3BF;
import X.C52132a7;
import X.C61062vX;
import X.C61122vd;
import X.InterfaceC002901k;
import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.database.Cursor;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.search.verification.client.R;
import com.whatsapp.SquareImageView;
import com.whatsapp.gallerypicker.GalleryPickerFragment;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class GalleryPickerFragment extends Hilt_GalleryPickerFragment {
    public static final String A0N;
    public static final C61062vX[] A0O;
    public static final C61062vX[] A0P;
    public int A01;
    public int A02;
    public BroadcastReceiver A03;
    public ContentObserver A04;
    public Drawable A05;
    public View A07;
    public RecyclerView A08;
    public AbstractC000600i A09;
    public C01B A0A;
    public C011605s A0B;
    public C001200o A0C;
    public C02F A0D;
    public C002301c A0E;
    public C3BE A0F;
    public C3BF A0G;
    public C52132a7 A0H;
    public C2AQ A0I;
    public C02C A0J;
    public InterfaceC002901k A0K;
    public boolean A0L;
    public boolean A0M;
    public int A00 = 1;
    public Handler A06 = new Handler(Looper.getMainLooper());

    static {
        String str = C61122vd.A00;
        A0N = str;
        A0O = new C61062vX[]{new C61062vX(4, 1, str, R.string.gallery_camera_images_bucket_name), new C61062vX(5, 4, str, R.string.gallery_camera_videos_bucket_name), new C61062vX(6, 2, str, R.string.gallery_camera_images_bucket_name), new C61062vX(0, 1, null, R.string.all_images), new C61062vX(1, 4, null, R.string.all_videos), new C61062vX(2, 2, null, R.string.all_gifs)};
        A0P = new C61062vX[]{new C61062vX(7, 7, str, R.string.gallery_camera_bucket_name), new C61062vX(3, 7, null, R.string.all_media), new C61062vX(1, 4, null, R.string.all_videos)};
    }

    @Override // X.C0BA
    public void A0j(Bundle bundle) {
        this.A0U = true;
        this.A00 = super.A06.getInt("include");
        int A00 = C02160Ac.A00(((Hilt_GalleryPickerFragment) this).A00, R.color.gallery_cell);
        this.A01 = A00;
        this.A05 = new ColorDrawable(A00);
        this.A02 = A01().getDimensionPixelSize(R.dimen.gallery_picker_folder_thumb_size);
        this.A08 = (RecyclerView) A05().findViewById(R.id.albums);
        this.A03 = new BroadcastReceiver() { // from class: X.2vT
            {
                GalleryPickerFragment.this = this;
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                GalleryPickerFragment galleryPickerFragment = GalleryPickerFragment.this;
                if (galleryPickerFragment != null) {
                    String action = intent.getAction();
                    if (action == null) {
                        return;
                    }
                    switch (action.hashCode()) {
                        case -1514214344:
                            if (!action.equals("android.intent.action.MEDIA_MOUNTED")) {
                                return;
                            }
                            Log.i("gallerypicker/receivemediabroadcast/ACTION_MEDIA_MOUNTED");
                            return;
                        case -1142424621:
                            if (!action.equals("android.intent.action.MEDIA_SCANNER_FINISHED")) {
                                return;
                            }
                            Log.i("gallerypicker/receivemediabroadcast/ACTION_MEDIA_SCANNER_FINISHED");
                            galleryPickerFragment.A10(false, false);
                            return;
                        case -963871873:
                            if (!action.equals("android.intent.action.MEDIA_UNMOUNTED")) {
                                return;
                            }
                            Log.i("gallerypicker/receivemediabroadcast/ACTION_MEDIA_UNMOUNTED");
                            galleryPickerFragment.A10(true, false);
                            return;
                        case -625887599:
                            if (!action.equals("android.intent.action.MEDIA_EJECT")) {
                                return;
                            }
                            Log.i("gallerypicker/receivemediabroadcast/ACTION_MEDIA_EJECT");
                            galleryPickerFragment.A10(true, false);
                            return;
                        case 1412829408:
                            if (!action.equals("android.intent.action.MEDIA_SCANNER_STARTED")) {
                                return;
                            }
                            Log.i("gallerypicker/receivemediabroadcast/ACTION_MEDIA_SCANNER_STARTED");
                            galleryPickerFragment.A10(false, true);
                            return;
                        default:
                            return;
                    }
                }
                throw null;
            }
        };
        this.A04 = new ContentObserver(this.A06) { // from class: X.2vU
            {
                GalleryPickerFragment.this = this;
            }

            @Override // android.database.ContentObserver
            public void onChange(boolean z) {
                GalleryPickerFragment galleryPickerFragment = GalleryPickerFragment.this;
                ActivityC02330At A09 = galleryPickerFragment.A09();
                if ((A09 == null ? null : A09.getContentResolver()) != null) {
                    ActivityC02330At A092 = galleryPickerFragment.A09();
                    galleryPickerFragment.A10(false, C61122vd.A01(A092 == null ? null : A092.getContentResolver()));
                    return;
                }
                StringBuilder A0P2 = C000200d.A0P("gallerypicker/");
                A0P2.append(galleryPickerFragment.A00);
                A0P2.append(" no content resolver");
                Log.i(A0P2.toString());
            }
        };
        C3BF c3bf = new C3BF(this);
        this.A0G = c3bf;
        this.A08.setAdapter(c3bf);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.MEDIA_MOUNTED");
        intentFilter.addAction("android.intent.action.MEDIA_UNMOUNTED");
        intentFilter.addAction("android.intent.action.MEDIA_SCANNER_STARTED");
        intentFilter.addAction("android.intent.action.MEDIA_SCANNER_FINISHED");
        intentFilter.addAction("android.intent.action.MEDIA_EJECT");
        intentFilter.addDataScheme("file");
        A09().registerReceiver(this.A03, intentFilter);
        ActivityC02330At A09 = A09();
        ContentResolver contentResolver = A09 == null ? null : A09.getContentResolver();
        if (contentResolver != null) {
            contentResolver.registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, this.A04);
            C011605s c011605s = this.A0B;
            ActivityC02330At A092 = A09();
            this.A0H = new C52132a7(c011605s, A092 == null ? null : A092.getContentResolver(), this.A06);
            this.A0M = false;
            this.A0L = false;
            A0z();
            return;
        }
        throw null;
    }

    @Override // X.C0BA
    public View A0p(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.gallery_picker_fragment, viewGroup, false);
    }

    @Override // X.C0BA
    public void A0q() {
        this.A0U = true;
        C3BE c3be = this.A0F;
        if (c3be != null) {
            c3be.A05(true);
            this.A0F = null;
        }
        C52132a7 c52132a7 = this.A0H;
        if (c52132a7 != null) {
            c52132a7.A00();
            this.A0H = null;
        }
        A09().unregisterReceiver(this.A03);
        ActivityC02330At A09 = A09();
        ContentResolver contentResolver = A09 == null ? null : A09.getContentResolver();
        if (contentResolver != null) {
            contentResolver.unregisterContentObserver(this.A04);
            for (int i = 0; i < this.A08.getChildCount(); i++) {
                View childAt = this.A08.getChildAt(i);
                if (childAt instanceof FrameLayout) {
                    ViewGroup viewGroup = (ViewGroup) childAt;
                    for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                        View childAt2 = viewGroup.getChildAt(i2);
                        if (childAt2 instanceof SquareImageView) {
                            ((ImageView) childAt2).setImageDrawable(null);
                        }
                    }
                }
            }
            this.A0G = null;
            this.A08.setAdapter(null);
            this.A0B.A03().A00.A07(-1);
            return;
        }
        throw null;
    }

    public final void A0y() {
        if (this.A07 == null) {
            ViewGroup viewGroup = (ViewGroup) A05().findViewById(R.id.root);
            A09().getLayoutInflater().inflate(R.layout.gallery_picker_no_images, viewGroup);
            View findViewById = viewGroup.findViewById(R.id.no_media);
            this.A07 = findViewById;
            TextView textView = (TextView) findViewById.findViewById(R.id.no_media_text);
            int i = this.A00;
            if (i == 1) {
                textView.setText(R.string.image_gallery_NoImageView_text);
            } else if (i == 2) {
                textView.setText(R.string.image_gallery_NoGifView_text);
            } else if (i == 4) {
                textView.setText(R.string.image_gallery_NoVideoView_text);
            }
        }
        this.A07.setVisibility(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.0HS, X.3BE] */
    public final void A0z() {
        C000700j.A08(this.A0F == null, "galleryFoldersTask must be cancelled");
        if (!this.A0D.A06()) {
            A0y();
            return;
        }
        Point point = new Point();
        A09().getWindowManager().getDefaultDisplay().getSize(point);
        int i = point.y * point.x;
        int i2 = this.A02;
        ?? r3 = new C0HS(this.A0C, this.A09, this.A0A, this.A0E, this.A0I, this.A0D, this.A0J, this, this.A00, (i / (i2 * i2)) + 1) { // from class: X.3BE
            public final int A00;
            public final int A01;
            public final AbstractC000600i A02;
            public final C01B A03;
            public final C001200o A04;
            public final C02F A05;
            public final C002301c A06;
            public final C2AQ A07;
            public final C02C A08;
            public final WeakReference A09;

            {
                this.A04 = r2;
                this.A02 = r3;
                this.A03 = r4;
                this.A06 = r5;
                this.A07 = r6;
                this.A05 = r7;
                this.A08 = r8;
                this.A09 = new WeakReference(this);
                this.A01 = r10;
                this.A00 = r11;
            }

            @Override // X.C0HS
            public void A03(Object[] objArr) {
                List[] listArr = (List[]) objArr;
                GalleryPickerFragment galleryPickerFragment = (GalleryPickerFragment) this.A09.get();
                if (galleryPickerFragment != null) {
                    for (List list : listArr) {
                        if (galleryPickerFragment.A09() != null) {
                            C3BF c3bf = galleryPickerFragment.A0G;
                            c3bf.A00.addAll(list);
                            ((AbstractC04890Mh) c3bf).A01.A00();
                            if (galleryPickerFragment.A0G.A0C() == 0) {
                                galleryPickerFragment.A0y();
                            } else {
                                View view = galleryPickerFragment.A07;
                                if (view != null) {
                                    view.setVisibility(8);
                                }
                            }
                        }
                    }
                }
            }

            @Override // X.C0HS
            public Object A07(Object[] objArr) {
                C61062vX[] c61062vXArr;
                Number number;
                C61042vV c61042vV = new C61042vV(this, this.A00);
                int i3 = this.A01;
                if (i3 == 7) {
                    c61062vXArr = GalleryPickerFragment.A0P;
                } else {
                    c61062vXArr = GalleryPickerFragment.A0O;
                }
                HashMap hashMap = new HashMap();
                for (C61062vX c61062vX : c61062vXArr) {
                    if ((c61062vX.A00 & i3) != 0) {
                        if (A04()) {
                            break;
                        }
                        int i4 = c61062vX.A00;
                        String str = c61062vX.A03;
                        InterfaceC52142a8 A0A = A0A(i4 & i3, str);
                        if (A0A.isEmpty()) {
                            A0A.close();
                        } else {
                            if (C61122vd.A00.equals(str)) {
                                hashMap.put(Integer.valueOf(i4), Integer.valueOf(A0A.getCount()));
                            } else if (str == null && (number = (Number) hashMap.get(Integer.valueOf(i4))) != null && number.intValue() == A0A.getCount()) {
                                A0A.close();
                            }
                            C61052vW c61052vW = new C61052vW(c61062vX.A02, i3, str, this.A06.A06(c61062vX.A01), A0A.AB8(0), A0A.getCount());
                            A0A.close();
                            c61042vV.A00(c61052vW);
                        }
                    }
                }
                if (A04()) {
                    return null;
                }
                C001200o c001200o = this.A04;
                AbstractC000600i abstractC000600i = this.A02;
                C01B c01b = this.A03;
                C2AQ c2aq = this.A07;
                C02F c02f = this.A05;
                C02C c02c = this.A08;
                C61112vc c61112vc = new C61112vc();
                c61112vc.A01 = 2;
                c61112vc.A00 = i3;
                c61112vc.A02 = 2;
                c61112vc.A03 = null;
                InterfaceC52142a8 A00 = C61122vd.A00(c001200o, abstractC000600i, c01b, c2aq, c02f, c02c, c61112vc);
                if (A04()) {
                    A00.close();
                } else {
                    ArrayList arrayList = new ArrayList(A00.A8a().entrySet());
                    final Collator collator = Collator.getInstance(this.A06.A0I());
                    collator.setDecomposition(1);
                    Collections.sort(arrayList, new Comparator() { // from class: X.2vO
                        @Override // java.util.Comparator
                        public final int compare(Object obj, Object obj2) {
                            Map.Entry entry = (Map.Entry) obj;
                            Map.Entry entry2 = (Map.Entry) obj2;
                            int compare = collator.compare((String) entry.getValue(), (String) entry2.getValue());
                            if (compare != 0) {
                                String str2 = AbstractC012105x.A0B;
                                if (!str2.equals(entry.getValue())) {
                                    if (!str2.equals(entry2.getValue())) {
                                        String str3 = AbstractC012105x.A0E;
                                        if (!str3.equals(entry.getValue())) {
                                            if (!str3.equals(entry2.getValue())) {
                                                return compare;
                                            }
                                        } else {
                                            return -1;
                                        }
                                    }
                                    return 1;
                                }
                                return -1;
                            }
                            return compare;
                        }
                    });
                    A00.close();
                    if (!A04()) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            String str2 = (String) entry.getKey();
                            if (str2 != null) {
                                if (A04()) {
                                    break;
                                } else if (!str2.equals(GalleryPickerFragment.A0N)) {
                                    InterfaceC52142a8 A0A2 = A0A(i3, str2);
                                    if (!A0A2.isEmpty()) {
                                        c61042vV.A00(new C61052vW(8, i3, str2, (String) entry.getValue(), A0A2.AB8(0), A0A2.getCount()));
                                    }
                                    A0A2.close();
                                }
                            }
                        }
                    }
                }
                if (A04()) {
                    return null;
                }
                Cursor query = c001200o.A00.getContentResolver().query(Uri.parse("content://com.whatsapp.provider.media/buckets"), null, null, null, null);
                try {
                    if (query == null) {
                        Log.w("gallerypicker/cursor/null");
                    } else {
                        while (query.moveToNext()) {
                            Jid nullable = Jid.getNullable(query.getString(0));
                            String string = query.getString(1);
                            if (A04()) {
                                break;
                            }
                            String A07 = C003101m.A07(nullable);
                            C3KG c3kg = new C3KG(c001200o, c01b, c2aq, c02c, A07, i3);
                            if (!c3kg.isEmpty()) {
                                c61042vV.A00(new C61052vW(9, i3, A07, string, c3kg.AB8(0), c3kg.getCount()));
                            }
                            c3kg.close();
                        }
                        query.close();
                    }
                    if (A04()) {
                        return null;
                    }
                    super.A02.A00(c61042vV.A04);
                    return null;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        if (query != null) {
                            try {
                                query.close();
                            } catch (Throwable unused) {
                            }
                        }
                        throw th2;
                    }
                }
            }

            public final InterfaceC52142a8 A0A(int i3, String str) {
                C001200o c001200o = this.A04;
                AbstractC000600i abstractC000600i = this.A02;
                C01B c01b = this.A03;
                C2AQ c2aq = this.A07;
                C02F c02f = this.A05;
                C02C c02c = this.A08;
                C61112vc c61112vc = new C61112vc();
                c61112vc.A01 = 2;
                c61112vc.A00 = i3;
                c61112vc.A02 = 2;
                c61112vc.A03 = str;
                return C61122vd.A00(c001200o, abstractC000600i, c01b, c2aq, c02f, c02c, c61112vc);
            }
        };
        this.A0F = r3;
        this.A0K.ARy(r3, new Void[0]);
    }

    public final void A10(boolean z, boolean z2) {
        StringBuilder A0P2 = C000200d.A0P("gallerypicker/");
        A0P2.append(this.A00);
        A0P2.append("/rebake unmounted:");
        A0P2.append(z);
        A0P2.append(" scanning:");
        A0P2.append(z2);
        A0P2.append(" oldunmounted:");
        A0P2.append(this.A0M);
        A0P2.append(" oldscanning:");
        C000200d.A1V(A0P2, this.A0L);
        if (z == this.A0M && z2 == this.A0L) {
            return;
        }
        this.A0M = z;
        this.A0L = z2;
        C3BE c3be = this.A0F;
        if (c3be != null) {
            c3be.A05(true);
            this.A0F = null;
        }
        if (this.A0M || !this.A0D.A06()) {
            A0y();
            return;
        }
        View view = this.A07;
        if (view != null) {
            view.setVisibility(8);
        }
        A0z();
    }
}
