package com.example.project;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0002J#\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002\u00a2\u0006\u0002\u0010\u001fJ\"\u0010 \u001a\u00020\u00192\u0006\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u00042\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u0010\u0010%\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J&\u0010&\u001a\u0004\u0018\u00010\'2\u0006\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\u001a\u0010.\u001a\u00020\u00192\u0006\u0010/\u001a\u00020\'2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\u0010\u00100\u001a\u00020\b2\u0006\u00101\u001a\u00020\u0015H\u0002J\"\u00102\u001a\u0004\u0018\u00010\u00152\u0006\u00103\u001a\u00020\u00152\u0006\u00104\u001a\u00020\u00042\u0006\u00105\u001a\u00020\u0004H\u0002J\b\u00106\u001a\u00020\u0019H\u0002J\b\u00107\u001a\u00020\u0019H\u0002J\b\u00108\u001a\u00020\u0019H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\tR\u000e\u0010\n\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u00069"}, d2 = {"Lcom/example/project/NewEventFragment;", "Landroidx/fragment/app/Fragment;", "()V", "CAMERA", "", "GALLERY", "PERMISSIONS", "", "", "[Ljava/lang/String;", "PERMISSION_ALL", "newEventService", "Lservice/NewEventService;", "getNewEventService", "()Lservice/NewEventService;", "setNewEventService", "(Lservice/NewEventService;)V", "pathPhoto", "pref", "Landroid/content/SharedPreferences;", "resizedPhoto", "Landroid/graphics/Bitmap;", "wallpaperDirectory", "Ljava/io/File;", "choosePhotoFromGallery", "", "hasPermissions", "", "context", "Landroid/content/Context;", "permissions", "(Landroid/content/Context;[Ljava/lang/String;)Z", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onAttach", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "saveImage", "myBitmap", "scaleCenterCrop", "source", "newHeight", "newWidth", "setupPermission", "takePhotoFromCamera", "uploadPhoto", "app_debug"})
public final class NewEventFragment extends androidx.fragment.app.Fragment {
    public service.NewEventService newEventService;
    private final int GALLERY = 111;
    private final int CAMERA = 112;
    private final int PERMISSION_ALL = 2;
    private android.content.SharedPreferences pref;
    private java.lang.String[] PERMISSIONS = {"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.CAMERA"};
    private java.lang.String pathPhoto = "";
    private java.io.File wallpaperDirectory;
    private android.graphics.Bitmap resizedPhoto;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final service.NewEventService getNewEventService() {
        return null;
    }
    
    public final void setNewEventService(@org.jetbrains.annotations.NotNull()
    service.NewEventService p0) {
    }
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    private final void uploadPhoto() {
    }
    
    private final boolean hasPermissions(android.content.Context context, java.lang.String[] permissions) {
        return false;
    }
    
    private final void setupPermission() {
    }
    
    private final void choosePhotoFromGallery() {
    }
    
    private final void takePhotoFromCamera() {
    }
    
    private final java.lang.String saveImage(android.graphics.Bitmap myBitmap) {
        return null;
    }
    
    private final android.graphics.Bitmap scaleCenterCrop(android.graphics.Bitmap source, int newHeight, int newWidth) {
        return null;
    }
    
    public NewEventFragment() {
        super();
    }
}