
const modal = $.modal({
    title: "Liaisan modal",
    closable: true,
    content: `<h4> Modal is working</h4>
                <p>Lorem ipsum dolor sit.</p>
    `,
    width: `400px`,
    footerButtons: [
        {text: 'Ok', type: 'primary'}
    ]
})
