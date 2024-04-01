package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.0Uk */
/* loaded from: classes.dex */
public class C06650Uk implements InterfaceMenuC06660Ul {
    public static final int[] A0O = {1, 4, 5, 3, 2, 0};
    public Drawable A01;
    public View A02;
    public C0CO A03;
    public C28421Rt A04;
    public CharSequence A05;
    public ArrayList A06;
    public ArrayList A07;
    public ArrayList A08;
    public ArrayList A0A;
    public boolean A0D;
    public boolean A0F;
    public boolean A0H;
    public boolean A0J;
    public boolean A0K;
    public final Context A0M;
    public final Resources A0N;
    public int A00 = 0;
    public boolean A0I = false;
    public boolean A0G = false;
    public boolean A0L = false;
    public boolean A0E = false;
    public ArrayList A09 = new ArrayList();
    public CopyOnWriteArrayList A0B = new CopyOnWriteArrayList();
    public boolean A0C = false;

    public C06650Uk A01() {
        return this;
    }

    public String A03() {
        return "android:menu:actionviewstates";
    }

    public C06650Uk(Context context) {
        boolean z = false;
        this.A0M = context;
        Resources resources = context.getResources();
        this.A0N = resources;
        this.A07 = new ArrayList();
        this.A0A = new ArrayList();
        this.A0F = true;
        this.A06 = new ArrayList();
        this.A08 = new ArrayList();
        this.A0D = true;
        if (resources.getConfiguration().keyboard != 1 && C13160kh.A03(ViewConfiguration.get(this.A0M), this.A0M)) {
            z = true;
        }
        this.A0K = z;
    }

    public MenuItem A00(int i, int i2, int i3, CharSequence charSequence) {
        int i4;
        int i5 = ((-65536) & i3) >> 16;
        if (i5 >= 0) {
            int[] iArr = A0O;
            if (i5 < iArr.length) {
                int i6 = (iArr[i5] << 16) | (65535 & i3);
                C28421Rt c28421Rt = new C28421Rt(this, i, i2, i3, i6, charSequence, this.A00);
                ArrayList arrayList = this.A07;
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size >= 0) {
                        if (((C28421Rt) arrayList.get(size)).A0S <= i6) {
                            i4 = size + 1;
                            break;
                        }
                    } else {
                        i4 = 0;
                        break;
                    }
                }
                arrayList.add(i4, c28421Rt);
                A0E(true);
                return c28421Rt;
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    public C28421Rt A02(int i, KeyEvent keyEvent) {
        char c;
        ArrayList arrayList = this.A09;
        arrayList.clear();
        A0D(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (C28421Rt) arrayList.get(0);
        }
        boolean A0H = A0H();
        for (int i2 = 0; i2 < size; i2++) {
            C28421Rt c28421Rt = (C28421Rt) arrayList.get(i2);
            if (A0H) {
                c = c28421Rt.A00;
            } else {
                c = c28421Rt.A01;
            }
            char[] cArr = keyData.meta;
            if ((c == cArr[0] && (metaState & 2) == 0) || ((c == cArr[2] && (metaState & 2) != 0) || (A0H && c == '\b' && i == 67))) {
                return c28421Rt;
            }
        }
        return null;
    }

    public ArrayList A04() {
        if (this.A0F) {
            this.A0A.clear();
            int size = this.A07.size();
            for (int i = 0; i < size; i++) {
                C28421Rt c28421Rt = (C28421Rt) this.A07.get(i);
                if (c28421Rt.isVisible()) {
                    this.A0A.add(c28421Rt);
                }
            }
            this.A0F = false;
            this.A0D = true;
            return this.A0A;
        }
        return this.A0A;
    }

    public void A05() {
        ArrayList A04 = A04();
        if (this.A0D) {
            Iterator it = this.A0B.iterator();
            boolean z = false;
            while (it.hasNext()) {
                Reference reference = (Reference) it.next();
                C0VC c0vc = (C0VC) reference.get();
                if (c0vc == null) {
                    this.A0B.remove(reference);
                } else {
                    z |= c0vc.A7r();
                }
            }
            if (z) {
                ArrayList arrayList = this.A06;
                arrayList.clear();
                ArrayList arrayList2 = this.A08;
                arrayList2.clear();
                int size = A04.size();
                for (int i = 0; i < size; i++) {
                    C28421Rt c28421Rt = (C28421Rt) A04.get(i);
                    if ((c28421Rt.A02 & 32) == 32) {
                        arrayList.add(c28421Rt);
                    } else {
                        arrayList2.add(c28421Rt);
                    }
                }
            } else {
                this.A06.clear();
                ArrayList arrayList3 = this.A08;
                arrayList3.clear();
                arrayList3.addAll(A04());
            }
            this.A0D = false;
        }
    }

    public void A06() {
        this.A0I = false;
        if (this.A0G) {
            this.A0G = false;
            A0E(this.A0L);
        }
    }

    public void A07() {
        if (this.A0I) {
            return;
        }
        this.A0I = true;
        this.A0G = false;
        this.A0L = false;
    }

    public final void A08(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources resources = this.A0N;
        if (view != null) {
            this.A02 = view;
            this.A05 = null;
            this.A01 = null;
        } else {
            if (i > 0) {
                this.A05 = resources.getText(i);
            } else if (charSequence != null) {
                this.A05 = charSequence;
            }
            if (i2 > 0) {
                this.A01 = C02160Ac.A03(this.A0M, i2);
            } else if (drawable != null) {
                this.A01 = drawable;
            }
            this.A02 = null;
        }
        A0E(false);
    }

    public void A09(Bundle bundle) {
        MenuItem findItem;
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(A03());
        int size = size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((C06650Uk) item.getSubMenu()).A09(bundle);
            }
        }
        int i2 = bundle.getInt("android:menu:expandedactionview");
        if (i2 <= 0 || (findItem = findItem(i2)) == null) {
            return;
        }
        findItem.expandActionView();
    }

    public void A0A(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((C06650Uk) item.getSubMenu()).A0A(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(A03(), sparseArray);
        }
    }

    public void A0B(C0VC c0vc) {
        Iterator it = this.A0B.iterator();
        while (it.hasNext()) {
            Reference reference = (Reference) it.next();
            Object obj = reference.get();
            if (obj == null || obj == c0vc) {
                this.A0B.remove(reference);
            }
        }
    }

    public void A0C(C0VC c0vc, Context context) {
        this.A0B.add(new WeakReference(c0vc));
        c0vc.AEt(context, this);
        this.A0D = true;
    }

    public void A0D(List list, int i, KeyEvent keyEvent) {
        char c;
        int i2;
        boolean A0H = A0H();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            int size = this.A07.size();
            for (int i3 = 0; i3 < size; i3++) {
                C28421Rt c28421Rt = (C28421Rt) this.A07.get(i3);
                if (c28421Rt.hasSubMenu()) {
                    c28421Rt.A0F.A0D(list, i, keyEvent);
                }
                if (A0H) {
                    c = c28421Rt.A00;
                    i2 = c28421Rt.A04;
                } else {
                    c = c28421Rt.A01;
                    i2 = c28421Rt.A05;
                }
                if ((modifiers & 69647) == (i2 & 69647) && c != 0) {
                    char[] cArr = keyData.meta;
                    if ((c == cArr[0] || c == cArr[2] || (A0H && c == '\b' && i == 67)) && c28421Rt.isEnabled()) {
                        list.add(c28421Rt);
                    }
                }
            }
        }
    }

    public void A0E(boolean z) {
        if (!this.A0I) {
            if (z) {
                this.A0F = true;
                this.A0D = true;
            }
            if (this.A0B.isEmpty()) {
                return;
            }
            A07();
            Iterator it = this.A0B.iterator();
            while (it.hasNext()) {
                Reference reference = (Reference) it.next();
                C0VC c0vc = (C0VC) reference.get();
                if (c0vc == null) {
                    this.A0B.remove(reference);
                } else {
                    c0vc.AVo(z);
                }
            }
            A06();
            return;
        }
        this.A0G = true;
        if (z) {
            this.A0L = true;
        }
    }

    public final void A0F(boolean z) {
        if (this.A0E) {
            return;
        }
        this.A0E = true;
        Iterator it = this.A0B.iterator();
        while (it.hasNext()) {
            Reference reference = (Reference) it.next();
            C0VC c0vc = (C0VC) reference.get();
            if (c0vc == null) {
                this.A0B.remove(reference);
            } else {
                c0vc.AIe(this, z);
            }
        }
        this.A0E = false;
    }

    public boolean A0G() {
        return this.A0C;
    }

    public boolean A0H() {
        return this.A0J;
    }

    public boolean A0I() {
        return this.A0K;
    }

    /* JADX WARN: Code restructure failed: missing block: B:92:0x0025, code lost:
        if (((X.C28431Ru) r6).A00.hasSubMenu() == false) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A0J(android.view.MenuItem r9, X.C0VC r10, int r11) {
        /*
            r8 = this;
            X.1Rt r9 = (X.C28421Rt) r9
            r4 = 0
            if (r9 == 0) goto Ldb
            boolean r0 = r9.isEnabled()
            if (r0 == 0) goto Ldb
            android.view.MenuItem$OnMenuItemClickListener r0 = r9.A0C
            r3 = 1
            if (r0 == 0) goto Lab
            boolean r0 = r0.onMenuItemClick(r9)
            if (r0 == 0) goto Lab
        L16:
            r7 = 1
        L17:
            X.0kX r6 = r9.A0G
            if (r6 == 0) goto L27
            r0 = r6
            X.1Ru r0 = (X.C28431Ru) r0
            android.view.ActionProvider r0 = r0.A00
            boolean r0 = r0.hasSubMenu()
            r2 = 1
            if (r0 != 0) goto L28
        L27:
            r2 = 0
        L28:
            boolean r0 = r9.A02()
            if (r0 == 0) goto L39
            boolean r0 = r9.expandActionView()
            r7 = r7 | r0
            if (r7 == 0) goto L38
            r8.A0F(r3)
        L38:
            return r7
        L39:
            boolean r0 = r9.hasSubMenu()
            if (r0 != 0) goto L49
            if (r2 != 0) goto L49
            r0 = r11 & 1
            if (r0 != 0) goto L38
            r8.A0F(r3)
            return r7
        L49:
            r0 = r11 & 4
            if (r0 != 0) goto L50
            r8.A0F(r4)
        L50:
            boolean r0 = r9.hasSubMenu()
            if (r0 != 0) goto L64
            android.content.Context r0 = r8.A0M
            X.1ns r1 = new X.1ns
            r1.<init>(r0, r8, r9)
            r9.A0F = r1
            java.lang.CharSequence r0 = r9.A0I
            r1.setHeaderTitle(r0)
        L64:
            X.1ns r5 = r9.A0F
            if (r2 == 0) goto L6f
            X.1Ru r6 = (X.C28431Ru) r6
            android.view.ActionProvider r0 = r6.A00
            r0.onPrepareSubMenu(r5)
        L6f:
            java.util.concurrent.CopyOnWriteArrayList r0 = r8.A0B
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto La4
            if (r10 == 0) goto L7d
            boolean r4 = r10.APD(r5)
        L7d:
            java.util.concurrent.CopyOnWriteArrayList r0 = r8.A0B
            java.util.Iterator r2 = r0.iterator()
        L83:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto La4
            java.lang.Object r1 = r2.next()
            java.lang.ref.Reference r1 = (java.lang.ref.Reference) r1
            java.lang.Object r0 = r1.get()
            X.0VC r0 = (X.C0VC) r0
            if (r0 != 0) goto L9d
            java.util.concurrent.CopyOnWriteArrayList r0 = r8.A0B
            r0.remove(r1)
            goto L83
        L9d:
            if (r4 != 0) goto L83
            boolean r4 = r0.APD(r5)
            goto L83
        La4:
            r7 = r7 | r4
            if (r7 != 0) goto L38
            r8.A0F(r3)
            return r7
        Lab:
            X.0Uk r0 = r9.A0E
            boolean r0 = r0.A0K(r0, r9)
            if (r0 != 0) goto L16
            android.content.Intent r1 = r9.A07
            if (r1 == 0) goto Lc8
            X.0Uk r0 = r9.A0E     // Catch: android.content.ActivityNotFoundException -> Lc0
            android.content.Context r0 = r0.A0M     // Catch: android.content.ActivityNotFoundException -> Lc0
            r0.startActivity(r1)     // Catch: android.content.ActivityNotFoundException -> Lc0
            goto L16
        Lc0:
            r2 = move-exception
            java.lang.String r1 = "MenuItemImpl"
            java.lang.String r0 = "Can't find activity to handle intent; ignoring"
            android.util.Log.e(r1, r0, r2)
        Lc8:
            X.0kX r0 = r9.A0G
            if (r0 == 0) goto Ld8
            X.1Ru r0 = (X.C28431Ru) r0
            android.view.ActionProvider r0 = r0.A00
            boolean r0 = r0.onPerformDefaultAction()
            if (r0 == 0) goto Ld8
            goto L16
        Ld8:
            r7 = 0
            goto L17
        Ldb:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06650Uk.A0J(android.view.MenuItem, X.0VC, int):boolean");
    }

    public boolean A0K(C06650Uk c06650Uk, MenuItem menuItem) {
        C0CO c0co = this.A03;
        return c0co != null && c0co.AM1(c06650Uk, menuItem);
    }

    public boolean A0L(C28421Rt c28421Rt) {
        boolean z = false;
        if (!this.A0B.isEmpty() && this.A04 == c28421Rt) {
            A07();
            Iterator it = this.A0B.iterator();
            while (it.hasNext()) {
                Reference reference = (Reference) it.next();
                C0VC c0vc = (C0VC) reference.get();
                if (c0vc == null) {
                    this.A0B.remove(reference);
                } else {
                    z = c0vc.A6J(this, c28421Rt);
                    if (z) {
                        break;
                    }
                }
            }
            A06();
            if (z) {
                this.A04 = null;
            }
        }
        return z;
    }

    public boolean A0M(C28421Rt c28421Rt) {
        boolean z = false;
        if (this.A0B.isEmpty()) {
            return false;
        }
        A07();
        Iterator it = this.A0B.iterator();
        while (it.hasNext()) {
            Reference reference = (Reference) it.next();
            C0VC c0vc = (C0VC) reference.get();
            if (c0vc == null) {
                this.A0B.remove(reference);
            } else {
                z = c0vc.A7j(this, c28421Rt);
                if (z) {
                    break;
                }
            }
        }
        A06();
        if (z) {
            this.A04 = c28421Rt;
        }
        return z;
    }

    @Override // android.view.Menu
    public MenuItem add(int i) {
        return A00(0, 0, 0, this.A0N.getString(i));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, int i4) {
        return A00(i, i2, i3, this.A0N.getString(i4));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return A00(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return A00(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        int i6;
        PackageManager packageManager = this.A0M.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        if (queryIntentActivityOptions != null) {
            i5 = queryIntentActivityOptions.size();
        } else {
            i5 = 0;
        }
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i7 = 0; i7 < i5; i7++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i7);
            int i8 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i8 < 0 ? intent : intentArr[i8]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            C28421Rt c28421Rt = (C28421Rt) A00(i, i2, i3, resolveInfo.loadLabel(packageManager));
            c28421Rt.setIcon(resolveInfo.loadIcon(packageManager));
            c28421Rt.setIntent(intent2);
            if (menuItemArr != null && (i6 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i6] = c28421Rt;
            }
        }
        return i5;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.A0N.getString(i));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.A0N.getString(i4));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C28421Rt c28421Rt = (C28421Rt) A00(i, i2, i3, charSequence);
        SubMenuC38291ns subMenuC38291ns = new SubMenuC38291ns(this.A0M, this, c28421Rt);
        c28421Rt.A0F = subMenuC38291ns;
        subMenuC38291ns.setHeaderTitle(c28421Rt.A0I);
        return subMenuC38291ns;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public void clear() {
        C28421Rt c28421Rt = this.A04;
        if (c28421Rt != null) {
            A0L(c28421Rt);
        }
        this.A07.clear();
        A0E(true);
    }

    public void clearHeader() {
        this.A01 = null;
        this.A05 = null;
        this.A02 = null;
        A0E(false);
    }

    @Override // android.view.Menu
    public void close() {
        A0F(true);
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i) {
        MenuItem findItem;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            C28421Rt c28421Rt = (C28421Rt) this.A07.get(i2);
            if (c28421Rt.A0R == i) {
                return c28421Rt;
            }
            if (c28421Rt.hasSubMenu() && (findItem = c28421Rt.A0F.findItem(i)) != null) {
                return findItem;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i) {
        return (MenuItem) this.A07.get(i);
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.A0H) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (((C28421Rt) this.A07.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return A02(i, keyEvent) != null;
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i, int i2) {
        return A0J(findItem(i), null, i2);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        boolean z;
        C28421Rt A02 = A02(i, keyEvent);
        if (A02 != null) {
            z = A0J(A02, null, i2);
        } else {
            z = false;
        }
        if ((i2 & 2) != 0) {
            A0F(true);
        }
        return z;
    }

    @Override // android.view.Menu
    public void removeGroup(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((C28421Rt) this.A07.get(i2)).A0Q == i) {
                if (i2 >= 0) {
                    int size2 = this.A07.size() - i2;
                    int i3 = 0;
                    while (true) {
                        int i4 = i3 + 1;
                        if (i3 >= size2 || ((C28421Rt) this.A07.get(i2)).A0Q != i) {
                            break;
                        }
                        ArrayList arrayList = this.A07;
                        if (i2 < arrayList.size()) {
                            arrayList.remove(i2);
                        }
                        i3 = i4;
                    }
                    A0E(true);
                    return;
                }
                return;
            }
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((C28421Rt) this.A07.get(i2)).A0R == i) {
                if (i2 >= 0) {
                    ArrayList arrayList = this.A07;
                    if (i2 < arrayList.size()) {
                        arrayList.remove(i2);
                        A0E(true);
                        return;
                    }
                    return;
                }
                return;
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.A07.size();
        for (int i2 = 0; i2 < size; i2++) {
            C28421Rt c28421Rt = (C28421Rt) this.A07.get(i2);
            if (c28421Rt.A0Q == i) {
                c28421Rt.A02 = (c28421Rt.A02 & (-5)) | (z2 ? 4 : 0);
                c28421Rt.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.A0C = z;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i, boolean z) {
        int size = this.A07.size();
        for (int i2 = 0; i2 < size; i2++) {
            C28421Rt c28421Rt = (C28421Rt) this.A07.get(i2);
            if (c28421Rt.A0Q == i) {
                c28421Rt.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i, boolean z) {
        ArrayList arrayList = this.A07;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C28421Rt c28421Rt = (C28421Rt) arrayList.get(i2);
            if (c28421Rt.A0Q == i) {
                int i3 = c28421Rt.A02;
                int i4 = (z ? 0 : 8) | (i3 & (-9));
                c28421Rt.A02 = i4;
                if (i3 != i4) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            A0E(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.A0J = z;
        A0E(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.A07.size();
    }
}
