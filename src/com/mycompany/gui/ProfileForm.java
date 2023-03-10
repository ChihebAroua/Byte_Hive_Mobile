/*
 * Copyright (c) 2016, Codename One
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated 
 * documentation files (the "Software"), to deal in the Software without restriction, including without limitation 
 * the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, 
 * and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions 
 * of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, 
 * INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A 
 * PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT 
 * HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF 
 * CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE 
 * OR THE USE OR OTHER DEALINGS IN THE SOFTWARE. 
 */

package com.mycompany.gui;

import com.codename1.components.FloatingHint;
import com.codename1.components.ScaleImageLabel;
import com.codename1.ui.Button;
import com.codename1.ui.CheckBox;
import com.codename1.ui.Component;
import com.codename1.ui.Container;
import com.codename1.ui.Display;
import com.codename1.ui.Image;
import com.codename1.ui.Label;
import com.codename1.ui.TextField;
import com.codename1.ui.Toolbar;
import com.codename1.ui.layouts.BorderLayout;
import com.codename1.ui.layouts.BoxLayout;
import com.codename1.ui.layouts.FlowLayout;
import com.codename1.ui.layouts.GridLayout;
import com.codename1.ui.layouts.LayeredLayout;
import com.codename1.ui.plaf.Style;
import com.codename1.ui.util.Resources;
import com.mycompany.entities.User;

/**
 * The user profile form
 *
 * @author Shai Almog
 */
public class ProfileForm extends BaseForm {

    public ProfileForm(Resources res) {
        super("Newsfeed", BoxLayout.y());
        Toolbar tb = new Toolbar(true);
        setToolbar(tb);
        getTitleArea().setUIID("Container");
        setTitle("Profile");
        getContentPane().setScrollVisible(false);
        
        super.addSideMenu(res);
        
        tb.addSearchCommand(e -> {});
        
        
        Image img = res.getImage("profile-background.jpg");
        if(img.getHeight() > Display.getInstance().getDisplayHeight() / 3) {
            img = img.scaledHeight(Display.getInstance().getDisplayHeight() / 3);
        }
        ScaleImageLabel sl = new ScaleImageLabel(img);
        sl.setUIID("BottomPad");
        sl.setBackgroundType(Style.BACKGROUND_IMAGE_SCALED_FILL);
        Button edit = new Button("edit");
        //Button supprimer = new Button("supprimer");

      
        
        add(LayeredLayout.encloseIn(
                sl,
                
               edit
               //supprimer
              
               
                    
                
                
        )
        );
                  
                
       
               
                
        
        
        

       

   
        TextField email = new TextField(SessionManager.getEmail());
        email.setUIID("TextFieldBlack");
        addStringValue("email", email);
        TextField password = new TextField(SessionManager.getPassword());
        password.setUIID("TextFieldBlack");
        addStringValue("Password", password);
        TextField name = new TextField(SessionManager.getName());
        name.setUIID("TextFieldBlack");
        addStringValue("name", name);
        TextField lastname = new TextField(SessionManager.getLastname());
        lastname.setUIID("TextFieldBlack");
        addStringValue("lastname", lastname);
        TextField profilepicture = new TextField(SessionManager.getProfilepicture());
        profilepicture.setUIID("TextFieldBlack");
        addStringValue("profilepicture", profilepicture);

       
        
   
      
      
   /*  TextField name = new TextField(SessionManager.getName());
        //nom.setUIID("TextFieldWhite");
        addStringValue(" Name: ", name);
        
        TextField email= new TextField(SessionManager.getEmail());
        //nom.setUIID("TextFieldWhite");
        addStringValue(" Email: ", email);
        
         TextField password = new TextField(SessionManager.getPassword());
        //nom.setUIID("TextFieldWhite");
        addStringValue(" Password: ", password);
         TextField lastname= new TextField(SessionManager.getLastname());
        //nom.setUIID("TextFieldWhite");
        addStringValue(" Email: ", email);
         TextField profilepicture= new TextField(SessionManager.getProfilepicture());
        //nom.setUIID("TextFieldWhite");
        addStringValue(" Profilepicture: ", profilepicture);*/
         
      
     
               
        
                
        
               

    }
    
    private void addStringValue(String s, Component v) {
        add(BorderLayout.west(new Label(s, "PaddedLabel")).
                add(BorderLayout.CENTER, v));
        add(createLineSeparator(0xeeeeee));
    }
}
