import React from "react";
import './style.css'

// component: Footer Layout
export default function Footer(){

    //event handler : insta icon button click event
    const onInstaButtonClickHandler = () => {
        window.open('https://www.instagram.com')
    };

    //event handler : naver blog icon button click event
    const onNaverBlogButtonClickHandler = () => {
        window.open('https://blog.naver.com')
    };


    // render: Footer Layout Rendering

    return(
        <div id='footer'>
            <div className='footer-container'>
                <div className='footer-top'>
                    <div className='footer-logo-box'>
                        <div className='icon-box'>
                            <div className='icon logo-light-icon'></div>
                        </div>
                        <div className='footer-logo-text'>{'TRAVLOG'}</div>
                    </div>
                    <div className='footer-link-box'>
                        <div className='footer-email-link'>{'travlog@travlog.com'}</div>
                        <div className='icon-button' onClick={onInstaButtonClickHandler}>
                            <div className='icon insta-icon'></div>
                        </div>
                        <div className='icon-button' onClick={onNaverBlogButtonClickHandler}>
                            <div className='icon naver-blog-icon'></div>
                        </div>
                    </div>
                </div>
                <div className='footer-bottom'>
                    <div className='footer-copyright'>
                        {'Copyright ⓒ 2024 Travlog. All Rights Reserved.'}ㅋ
                    </div>
                </div>

            </div>
        </div>
    )
}