package X;

import android.net.Uri;
import android.os.Build;
import android.view.View;
import com.whatsapp.camera.CameraMediaPickerFragment;
import com.whatsapp.gallery.MediaGalleryFragment;
import com.whatsapp.gallery.MediaGalleryFragmentBase;
import com.whatsapp.gallerypicker.MediaPickerFragment;
import com.whatsapp.storage.StorageUsageMediaGalleryFragment;
import com.whatsapp.util.ViewOnClickCListenerShape4S0200000_I1;
import java.util.HashSet;

/* renamed from: X.3B6  reason: invalid class name */
/* loaded from: classes2.dex */
public class C3B6 extends C0TS {
    public final C51682Xk A00;
    public final /* synthetic */ MediaGalleryFragmentBase A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3B6(MediaGalleryFragmentBase mediaGalleryFragmentBase, final C51682Xk c51682Xk) {
        super(c51682Xk);
        this.A01 = mediaGalleryFragmentBase;
        this.A00 = c51682Xk;
        if (Build.VERSION.SDK_INT >= 21) {
            c51682Xk.setSelector(null);
        }
        c51682Xk.setOnClickListener(new ViewOnClickCListenerShape4S0200000_I1(this, c51682Xk));
        c51682Xk.setOnLongClickListener(new View.OnLongClickListener() { // from class: X.2vC
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                boolean z;
                C3B6 c3b6 = C3B6.this;
                C51682Xk c51682Xk2 = c51682Xk;
                InterfaceC52102a4 interfaceC52102a4 = c51682Xk2.A04;
                if (interfaceC52102a4 != null) {
                    MediaGalleryFragmentBase mediaGalleryFragmentBase2 = c3b6.A01;
                    if (mediaGalleryFragmentBase2 instanceof StorageUsageMediaGalleryFragment) {
                        AnonymousClass097 anonymousClass097 = ((AbstractC53492h0) interfaceC52102a4).A00;
                        boolean A17 = mediaGalleryFragmentBase2.A17();
                        z = true;
                        InterfaceC04690Ll interfaceC04690Ll = (InterfaceC04690Ll) mediaGalleryFragmentBase2.A0A();
                        if (A17) {
                            c51682Xk2.setChecked(interfaceC04690Ll.AVe(anonymousClass097));
                        } else {
                            interfaceC04690Ll.AV2(anonymousClass097);
                            c51682Xk2.setChecked(true);
                        }
                    } else if (mediaGalleryFragmentBase2 instanceof MediaPickerFragment) {
                        MediaPickerFragment mediaPickerFragment = (MediaPickerFragment) mediaGalleryFragmentBase2;
                        z = true;
                        if (mediaPickerFragment.A01 <= 1) {
                            z = false;
                        } else if (mediaPickerFragment.A17()) {
                            mediaPickerFragment.A19(interfaceC52102a4);
                        } else {
                            HashSet hashSet = mediaPickerFragment.A0J;
                            Uri A88 = interfaceC52102a4.A88();
                            hashSet.add(A88);
                            mediaPickerFragment.A0I.A04(new C42611w2(A88));
                            ActivityC02320As activityC02320As = (ActivityC02320As) mediaPickerFragment.A09();
                            if (activityC02320As != null) {
                                mediaPickerFragment.A04 = activityC02320As.A0e(mediaPickerFragment.A03);
                                ((MediaGalleryFragmentBase) mediaPickerFragment).A06.A01.A00();
                                mediaPickerFragment.A13(hashSet.size());
                            } else {
                                throw null;
                            }
                        }
                    } else if (!(mediaGalleryFragmentBase2 instanceof MediaGalleryFragment)) {
                        CameraMediaPickerFragment cameraMediaPickerFragment = (CameraMediaPickerFragment) mediaGalleryFragmentBase2;
                        if (cameraMediaPickerFragment.A17()) {
                            cameraMediaPickerFragment.A1C(interfaceC52102a4);
                        } else {
                            HashSet hashSet2 = cameraMediaPickerFragment.A0D;
                            Uri A882 = interfaceC52102a4.A88();
                            hashSet2.add(A882);
                            cameraMediaPickerFragment.A0C.A04(new C42611w2(A882));
                            cameraMediaPickerFragment.A19();
                            ((MediaGalleryFragmentBase) cameraMediaPickerFragment).A06.A01.A00();
                            cameraMediaPickerFragment.A13(hashSet2.size());
                        }
                        z = true;
                    } else {
                        AnonymousClass097 anonymousClass0972 = ((AbstractC53492h0) interfaceC52102a4).A00;
                        boolean A172 = mediaGalleryFragmentBase2.A17();
                        z = true;
                        InterfaceC04690Ll interfaceC04690Ll2 = (InterfaceC04690Ll) mediaGalleryFragmentBase2.A09();
                        if (A172) {
                            c51682Xk2.setChecked(interfaceC04690Ll2.AVe(anonymousClass0972));
                        } else {
                            interfaceC04690Ll2.AV2(anonymousClass0972);
                            c51682Xk2.setChecked(true);
                        }
                    }
                    if (z) {
                        return true;
                    }
                }
                return false;
            }
        });
    }
}
