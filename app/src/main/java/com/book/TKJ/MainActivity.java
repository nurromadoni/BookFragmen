         //Re-Edit For Source Github //
		 //Credit :
		 //Nurromadoni
		 //Grup FB : Aide 
		 //Saiful Arif
		 //Wahyu Hidayat
		 //Elmahbub
		 //Thanks For github to upload source

package com.book.TKJ;

//import android.app.*;
import android.os.*;
import android.support.v4.widget.*;
import android.support.v7.widget.*;
import android.support.v7.widget.Toolbar;
import android.support.v7.app.*;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.design.widget.*;
import android.view.*;
import android.support.v4.app.*;
import android.graphics.*;
import android.widget.*;
import android.content.*;

public class MainActivity extends AppCompatActivity 
{
	private DrawerLayout drawer;
	private Toolbar tb;
	private NavigationView navView;
	private ActionBarDrawerToggle drawerTogle;
	private ActionBar ab;
	
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		tb=(Toolbar)findViewById(R.id.toolbar);
		tb.setTitle("EBookTKJ");
		navView=(NavigationView)findViewById(R.id.navview);
		drawer=(DrawerLayout)findViewById(R.id.drawer);
		//DrawerTogle
		drawerTogle=new ActionBarDrawerToggle(this,drawer,tb,R.string.close,R.string.open);
		drawerTogle.syncState();
		//setUp drawer navigationnya
		setupNavigationDrawer(navView);
    }

	private void setupNavigationDrawer(NavigationView navView)
	{
		navView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener(){

				@Override
				public boolean onNavigationItemSelected(MenuItem menuItem)
				{
					
				
					switch(menuItem.getItemId()){
						case R.id.metu:
							finish();
							break;
						
							
					}
					setItemDrawer(menuItem);
					// TODO: Implement this method
					return true;
				}

				private void setItemDrawer(MenuItem menuItem)
				{
					Fragment fm=null;
					Class c = null ;
					setLockItem(menuItem);
					switch(menuItem.getItemId()){
						case R.id.nav_jaringandasar:
							c=JD.class;
							break;
						case R.id.nav_simdig:
							c=SD.class;
							break;
						case R.id.nav_pemrogweb:
							c=PW.class;
							break;
						
					default:
					c=JD.class;
					
					}
					try{
						fm=(Fragment)c.newInstance();
					}
					catch(Exception e){
						e.printStackTrace();
					}
					FragmentManager fmManager=getSupportFragmentManager();
					fmManager.beginTransaction().replace(R.id.mainFrameLayout,fm).commit();
					menuItem.setChecked(true);
					setTitle(menuItem.getTitle());
					drawer.closeDrawers();
					// TODO: Implemnt this method
				}

				private void setLockItem(MenuItem menuItem)
				{
					switch(menuItem.getItemId()){
						case R.id.nav_pemrogandroid:
							AlertDialog.Builder dialogLock=new AlertDialog.Builder(MainActivity.this);
							dialogLock.setTitle("Kunci");
							dialogLock.setPositiveButton(R.string.mengerti, new DialogInterface.OnClickListener(){

									@Override
									public void onClick(DialogInterface p1, int p2)
									{
										
										// TODO: Implement this method
									}
								});
							AlertDialog alert= dialogLock.create();
							alert.show();
							break;
					}
				
					// TODO: Implement this method
				}


		
			
		// TODO: Implement this method
	});
	
	
	}

	@Override
	public void onBackPressed()
	{
		if(drawer.isDrawerOpen(Gravity.START)){
			drawer.closeDrawers();
		}
		else{
			super.onBackPressed();
		}
		// TODO: Implement this method
	
	}
	

	@Override
	protected void onPostCreate(Bundle savedInstanceState)
	{
		// TODO: Implement this method
		super.onPostCreate(savedInstanceState);
	}

}
