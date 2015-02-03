//
//  Leancloud.swift
//  owhat
//
//  Created by sankooc on 2/3/15.
//
//

import Foundation

@objc(Leancloud) class Leancloud : CDVPlugin {
    func feedback(command: CDVInvokedUrlCommand){
        println("go to feedback")
        var agent = AVUserFeedbackAgent.sharedInstance()
        var option:NSDictionary = command.arguments[0] as NSDictionary;
        var email:String? = option.objectForKey("email") as String?
        var nickname:String? = option.objectForKey("title") as String?
        agent.showConversations(self.viewController, title: nickname, contact: email)
    }
}
